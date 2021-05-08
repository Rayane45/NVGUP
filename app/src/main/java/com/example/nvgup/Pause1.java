package com.example.nvgup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Pause1 extends AppCompatActivity {
    private Button mPause1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pause1);

        mPause1=(Button)findViewById(R.id.Pause1);
        mPause1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pause1.this,Mouvements.class);
                startActivity(intent);
            }
        });
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