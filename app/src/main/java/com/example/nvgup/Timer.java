package com.example.nvgup;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.graphics.Color;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class Timer extends AppCompatActivity{
    Button mStartButton;
    Button mResetButton;
    Button mReturnButton;
    TextView mTimerText;
    ProgressBar  mProgressBar;
    public long millisOnTimer=30000;
    public long returnIndex=millisOnTimer;
    CountDownTimer mCountDownTimer;
    CountDownTimer mCountDownTimerBar;
    int On=0;
    int updateTimer = 1000;
    int progressBarUpdate=50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timer);
        mStartButton=(Button)findViewById(R.id.timer_start_stop);
        mTimerText= (TextView) findViewById(R.id.timer_txt);
        mResetButton=(Button)findViewById(R.id.timer_reset);
        mReturnButton=(Button)findViewById(R.id.timer_retour);
        mProgressBar=(ProgressBar)findViewById(R.id.progress_timer);




        mStartButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if (On==0){
                    startTimer();
                }
                else{
                    stopTimer();
                }
            }
        });
        mResetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                millisOnTimer=returnIndex;
                updateCountDownText();
                mProgressBar.setProgress(0);
                mResetButton.setVisibility(View.INVISIBLE);
                mStartButton.setVisibility(View.VISIBLE);
            }
        });
        mReturnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

public void startTimer(){
    On=1;
    final long[] increase = new long[1];
    mStartButton.setText("Pause");
    mCountDownTimer = new CountDownTimer(millisOnTimer,updateTimer) { // CountDownTimer( de base dans AS), il verifie le tps qui reste et il le fait 1 fois par secode
        @Override
        public void onTick(long millisUntilFinished) {// fonction de base et qui prends les millisUntilFinished (de base egalement)
            millisOnTimer=millisUntilFinished;
            updateCountDownText();
            increase[0] =((mProgressBar.getProgress()*updateTimer)/(millisOnTimer));
            mProgressBar.setProgress((int) (mProgressBar.getProgress()+ increase[0]));
        }
        @Override
        public void onFinish() {
            On=0;
            mStartButton.setText("Start");
            mStartButton.setVisibility(View.INVISIBLE);
            mResetButton.setVisibility(View.VISIBLE);
            mProgressBar.setProgress(0);
        }
    }.start();// lance le programme dés le debut
    mResetButton.setVisibility(View.INVISIBLE);
    mStartButton.setVisibility(View.VISIBLE);
}

public void stopTimer(){
    mCountDownTimer.cancel(); // on arrete le timer, mais le temps qui nous se garde car il est stocké dans le mTimerLeftInMillis
    On=0;
    mStartButton.setText("Start");
    mResetButton.setVisibility(View.VISIBLE);
}
public void updateCountDownText(){
        int minutes = (int) (millisOnTimer  /1000) /60; // (int) est utilisé pour forcer une variable de se transformer dans le format de la parantese
        int seconds = (int) (millisOnTimer  /1000) % 60;
        String timeLeftFormatted = String.format(Locale.getDefault(),"%2d:%2d",minutes,seconds);
       /* String timeLeftFormatted = String.format(Locale.getDefault(),"%1d:%2d",minutes,seconds); // format est utilisé pour afficher les variables d'une fct specifique;*/
        // % est le symbole de debut de format, 2 sert a definir la longeur, d est le decimal ( pour float c'est f, par exemple)
        mTimerText.setText(timeLeftFormatted); // on mets ce texte dans l'endroit dedié
    }

/*package com.example.nvgup;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class Timer extends AppCompatActivity {
    long Start_time_in_millis=599000; // start time (long est comme int avec + de capacité de stockage)
    private TextView mTextOnTimer; // creation des variables auxquelles on associera les elements du xml
    private Button mButtonStartStop;
    private Button mButtonReset;
    private CountDownTimer mCountDownTimer;
    private boolean mTimerRunning; // verification si le timer est toujours pas arreté
    long mTimerLeftInMillis = Start_time_in_millis; //  association d'une variable au Start_time_in_millis
    private Button mButtonRetour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timer);

        mTextOnTimer = findViewById(R.id.text_on_timer); // association d'une variable au id du element que l'on veut
        mButtonStartStop = findViewById(R.id.button_start_stop);
        mButtonReset=findViewById(R.id.button_reset);
        mButtonRetour=findViewById(R.id.button_retour);
        mButtonStartStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mTimerRunning) {
                    pauseTimer();
                }
                else{
                    startTimer();
                }
            }
        });

        mButtonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetTimer();
            }
        });
        updateCountDownText();

        mButtonRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    private void startTimer(){
        mCountDownTimer = new CountDownTimer(mTimerLeftInMillis,1000) { // CountDownTimer( de base dans AS), il verifie le tps qui reste et il le fait 1 fois par secode
            @Override
            public void onTick(long millisUntilFinished) {// fonction de base et qui prends les millisUntilFinished (de base egalement)
                mTimerLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                mTimerRunning = false;
                mButtonStartStop.setText("Start");
                mButtonStartStop.setVisibility(View.INVISIBLE);
                mButtonReset.setVisibility(View.VISIBLE);
            }
        }.start();// lance le programme dés le debut
        mTimerRunning = true; // pour donner une valeur de depart a mTimerRunning
        mButtonStartStop.setText("Pause");//changement du texte sur le bouton
        mButtonReset.setVisibility(View.INVISIBLE); // le bouton Reset est invisible tant qu'il y a du tps restant

    }
    private void pauseTimer(){
        mCountDownTimer.cancel(); // on arrete le timer, mais le temps qui nous se garde car il est stocké dans le mTimerLeftInMillis
        mTimerRunning=false;
        mButtonStartStop.setText("Start");
        mButtonReset.setVisibility(View.VISIBLE);
    }
    private void resetTimer(){
        mTimerLeftInMillis = Start_time_in_millis;
        updateCountDownText();
        mButtonReset.setVisibility(View.INVISIBLE);
        mButtonStartStop.setVisibility(View.VISIBLE);
    }
    private void updateCountDownText(){
        int minutes = (int) (mTimerLeftInMillis  /1000) /60; // (int) est utilisé pour forcer une variable de se transformer dans le format de la parantese
        int seconds = (int) (mTimerLeftInMillis  /1000) % 60;
        String timeLeftFormatted = String.format(Locale.getDefault(),"%1d:%2d",minutes,seconds); // format est utilisé pour afficher les variables d'une fct specifique;
        // % est le symbole de debut de format, 2 sert a definir la longeur, d est le decimal ( pour float c'est f, par exemple)
        mTextOnTimer.setText(timeLeftFormatted); // on mets ce texte dans l'endroit dedié
    }
}*/
    }