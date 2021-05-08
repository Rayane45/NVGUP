package com.example.nvgup;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class ProgrammeFacile extends AppCompatActivity {
    private TextView tProgrammeFacile;
    private ImageView Burpees10;
    private ImageView Pompesrot10;
    private ImageView Fentes10;
    private ImageView Pompes10;
    private ImageView Pompesdec10;
    private TextView  tBurpees10;
    private TextView tPompesrot10;
    private TextView tFentes10;
    private TextView tPompes10;
    private TextView tPompesdec10;
    private Button mStart;
    TextView mTimerText;
    Button mResetButton;
    ProgressBar mProgressBarRound;
    public long millisOnTimer=30000;
    public long returnIndex=millisOnTimer;
    CountDownTimer mCountDownTimer;
    int On=0;
    int updateTimer = 1000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.programme_exo_facile);

        tProgrammeFacile=findViewById(R.id.text_facile);
        Burpees10=findViewById(R.id.burpees2);
        Pompesrot10=findViewById(R.id.pompes_rotation2);
        Fentes10=findViewById(R.id.fentes2);
        Pompes10=findViewById(R.id.pompes2);
        Pompesdec10=findViewById(R.id.pompes_dec2);
        tBurpees10=findViewById(R.id.text_burpees);
        tPompesrot10=findViewById(R.id.text_pompes_rotation);
        tFentes10=findViewById(R.id.text_fentes);
        tPompes10=findViewById(R.id.text_pompes);
        tPompesdec10=findViewById(R.id.text_pompes_dec);
        mStart=(Button)findViewById(R.id.Start_facile);
        mProgressBarRound=(ProgressBar)findViewById(R.id.progess_debutant);
        mResetButton=(Button)findViewById(R.id.reset_time);
        mTimerText=findViewById(R.id.txt_time);
        mProgressBarRound.getProgressDrawable().setColorFilter(Color.MAGENTA, PorterDuff.Mode.SRC_IN);


    /*    mStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (On==0){
                    mTimerText.setVisibility(View.VISIBLE);
                    mResetButton.setVisibility(View.VISIBLE);
                    mProgressBarRound.setVisibility(View.VISIBLE);
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
                mProgressBarRound.setProgress(0);
                mResetButton.setVisibility(View.INVISIBLE);
                mProgressBarRound.setVisibility(View.INVISIBLE);
                mTimerText.setVisibility(View.INVISIBLE);
                mStart.setVisibility(View.VISIBLE);
            }
        });


    }
    public void startTimer(){
        On=1;
        mStart.setText("Pause");
        mCountDownTimer = new CountDownTimer(millisOnTimer,updateTimer) { // CountDownTimer( de base dans AS), il verifie le tps qui reste et il le fait 1 fois par secode
            long increase;
            @Override
            public void onTick(long millisUntilFinished) {// fonction de base et qui prends les millisUntilFinished (de base egalement)
                increase =(100*(updateTimer)/(returnIndex));
                mProgressBarRound.incrementProgressBy((int)increase);
                millisOnTimer=millisUntilFinished;
                updateCountDownText();

            }
            @Override
            public void onFinish() {
                On=0;
                mStart.setText("Start");
                mStart.setVisibility(View.INVISIBLE);
                mResetButton.setVisibility(View.VISIBLE);
                mProgressBarRound.setProgress(100);
            }
        }.start();// lance le programme dés le debut
        mResetButton.setVisibility(View.INVISIBLE);
        mStart.setVisibility(View.VISIBLE);
    }
    public void stopTimer(){
        mCountDownTimer.cancel(); // on arrete le timer, mais le temps qui nous se garde car il est stocké dans le mTimerLeftInMillis
        On=0;
        mStart.setText("Start");
        mResetButton.setVisibility(View.VISIBLE);
    }
    public void updateCountDownText(){
        int minutes = (int) (millisOnTimer  /1000) /60; // (int) est utilisé pour forcer une variable de se transformer dans le format de la parantese
        int seconds = (int) (millisOnTimer  /1000) % 60;
        if (seconds>9 && minutes>9) {
            String timeLeftFormatted = String.format(Locale.getDefault(), "%2d:%2d", minutes, seconds);// format est utilisé pour afficher les variables d'une fct specifique;
            // % est le symbole de debut de format, 2 sert a definir la longeur, d est le decimal ( pour float c'est f, par exemple)
           /* mTimerText.setText(timeLeftFormatted); // on mets ce texte dans l'endroit dedié
        }
        else if(seconds<9 && minutes>9){
            String timeLeftFormatted = String.format(Locale.getDefault(), "%2d:0%1d", minutes, seconds);// format est utilisé pour afficher les variables d'une fct specifique;
            // % est le symbole de debut de format, 2 sert a definir la longeur, d est le decimal ( pour float c'est f, par exemple)
            mTimerText.setText(timeLeftFormatted); // on mets ce texte dans l'endroit dedié
        }
        else if (seconds > 9 && minutes < 9) {
            String timeLeftFormatted = String.format(Locale.getDefault(), "0%1d:%2d", minutes, seconds);// format est utilisé pour afficher les variables d'une fct specifique;
            // % est le symbole de debut de format, 2 sert a definir la longeur, d est le decimal ( pour float c'est f, par exemple)
            mTimerText.setText(timeLeftFormatted);
        }
        else{
            String timeLeftFormatted = String.format(Locale.getDefault(), "0%1d:0%1d", minutes, seconds);// format est utilisé pour afficher les variables d'une fct specifique;
            // % est le symbole de debut de format, 2 sert a definir la longeur, d est le decimal ( pour float c'est f, par exemple)
            mTimerText.setText(timeLeftFormatted);
        }*/
    }
}