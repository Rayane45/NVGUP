package com.example.nvgup;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
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

public class Pause1 extends AppCompatActivity {
    private Button mPause1;
    private Button mStart1;
    private TextView mTextTimer1;
    ProgressBar mProgressBar1;
    public long millisOnTimer=30000;
    public long returnIndex=millisOnTimer;
    CountDownTimer mCountDownTimer;
    int On=0;
    int updateTimer = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pause1);

        mProgressBar1=(ProgressBar)findViewById(R.id.progress_timer1);
        mStart1=(Button)findViewById(R.id.timer_start_stop1);
        mPause1=(Button)findViewById(R.id.Pause1);
        mTextTimer1=(TextView)findViewById(R.id.timer_txt1);
        mProgressBar1.getProgressDrawable().setColorFilter(Color.MAGENTA, PorterDuff.Mode.SRC_IN);

        mPause1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pause1.this,PompesRotationsfacile.class);
                startActivity(intent);
                millisOnTimer=returnIndex;
                mProgressBar1.setProgress(0);
            }
        });
        mStart1.setOnClickListener(new View.OnClickListener() {
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
            }
    public void startTimer(){
        On=1;
        mStart1.setText("Pause");
        mCountDownTimer = new CountDownTimer(millisOnTimer,updateTimer) { // CountDownTimer( de base dans AS), il verifie le tps qui reste et il le fait 1 fois par secode
            long increase;
            @Override
            public void onTick(long millisUntilFinished) {// fonction de base et qui prends les millisUntilFinished (de base egalement)
                increase =(100*(updateTimer)/(returnIndex));
                mProgressBar1.incrementProgressBy((int)increase);
                millisOnTimer=millisUntilFinished;
                updateCountDownText();

            }
            @Override
            public void onFinish() {
                On=0;
                mStart1.setText("Start");
                mProgressBar1.setProgress(100);
            }
        }.start();// lance le programme dés le debut
    }
    public void stopTimer(){
        mCountDownTimer.cancel(); // on arrete le timer, mais le temps qui nous se garde car il est stocké dans le mTimerLeftInMillis
        On=0;
        mStart1.setText("Start");
    }
    public void updateCountDownText(){
        int minutes = (int) (millisOnTimer  /1000) /60; // (int) est utilisé pour forcer une variable de se transformer dans le format de la parantese
        int seconds = (int) (millisOnTimer  /1000) % 60;
        if (seconds>9 && minutes>9) {
            String timeLeftFormatted = String.format(Locale.getDefault(), "%2d:%2d", minutes, seconds);// format est utilisé pour afficher les variables d'une fct specifique;
            // % est le symbole de debut de format, 2 sert a definir la longeur, d est le decimal ( pour float c'est f, par exemple)
            mTextTimer1.setText(timeLeftFormatted); // on mets ce texte dans l'endroit dedié
        }
        else if(seconds<9 && minutes>9){
            String timeLeftFormatted = String.format(Locale.getDefault(), "%2d:0%1d", minutes, seconds);// format est utilisé pour afficher les variables d'une fct specifique;
            // % est le symbole de debut de format, 2 sert a definir la longeur, d est le decimal ( pour float c'est f, par exemple)
            mTextTimer1.setText(timeLeftFormatted); // on mets ce texte dans l'endroit dedié
        }
        else if (seconds > 9 && minutes < 9) {
            String timeLeftFormatted = String.format(Locale.getDefault(), "0%1d:%2d", minutes, seconds);// format est utilisé pour afficher les variables d'une fct specifique;
            // % est le symbole de debut de format, 2 sert a definir la longeur, d est le decimal ( pour float c'est f, par exemple)
            mTextTimer1.setText(timeLeftFormatted);
        }
        else{
            String timeLeftFormatted = String.format(Locale.getDefault(), "0%1d:0%1d", minutes, seconds);// format est utilisé pour afficher les variables d'une fct specifique;
            // % est le symbole de debut de format, 2 sert a definir la longeur, d est le decimal ( pour float c'est f, par exemple)
            mTextTimer1.setText(timeLeftFormatted);
        }
    }
}