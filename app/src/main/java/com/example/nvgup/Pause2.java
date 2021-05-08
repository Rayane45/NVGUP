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

public class Pause2 extends AppCompatActivity {
    private Button mPause2;
    private Button mStart2;
    private TextView mTextTimer2;
    ProgressBar mProgressBar2;
    public long millisOnTimer=30000;
    public long returnIndex=millisOnTimer;
    CountDownTimer mCountDownTimer;
    int On=0;
    int updateTimer = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pause2);

        mProgressBar2=(ProgressBar)findViewById(R.id.progress_timer2);
        mStart2=(Button)findViewById(R.id.timer_start_stop2);
        mPause2=(Button)findViewById(R.id.Pause2);
        mTextTimer2=(TextView)findViewById(R.id.timer_txt2);
        mProgressBar2.getProgressDrawable().setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN);

        mPause2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pause2.this,Fentesfacile.class);
                startActivity(intent);
                millisOnTimer=returnIndex;
                mProgressBar2.setProgress(0);
            }
        });
        mStart2.setOnClickListener(new View.OnClickListener() {
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
        mStart2.setText("Pause");
        mCountDownTimer = new CountDownTimer(millisOnTimer,updateTimer) { // CountDownTimer( de base dans AS), il verifie le tps qui reste et il le fait 1 fois par secode
            long increase;
            @Override
            public void onTick(long millisUntilFinished) {// fonction de base et qui prends les millisUntilFinished (de base egalement)
                increase =(100*(updateTimer)/(returnIndex));
                mProgressBar2.incrementProgressBy((int)increase);
                millisOnTimer=millisUntilFinished;
                updateCountDownText();

            }
            @Override
            public void onFinish() {
                On=0;
                mStart2.setText("Start");
                mProgressBar2.setProgress(100);
            }
        }.start();// lance le programme dés le debut
    }
    public void stopTimer(){
        mCountDownTimer.cancel(); // on arrete le timer, mais le temps qui nous se garde car il est stocké dans le mTimerLeftInMillis
        On=0;
        mStart2.setText("Start");
    }
    public void updateCountDownText(){
        int minutes = (int) (millisOnTimer  /1000) /60; // (int) est utilisé pour forcer une variable de se transformer dans le format de la parantese
        int seconds = (int) (millisOnTimer  /1000) % 60;
        if (seconds>9 && minutes>9) {
            String timeLeftFormatted = String.format(Locale.getDefault(), "%2d:%2d", minutes, seconds);// format est utilisé pour afficher les variables d'une fct specifique;
            // % est le symbole de debut de format, 2 sert a definir la longeur, d est le decimal ( pour float c'est f, par exemple)
            mTextTimer2.setText(timeLeftFormatted); // on mets ce texte dans l'endroit dedié
        }
        else if(seconds<9 && minutes>9){
            String timeLeftFormatted = String.format(Locale.getDefault(), "%2d:0%1d", minutes, seconds);// format est utilisé pour afficher les variables d'une fct specifique;
            // % est le symbole de debut de format, 2 sert a definir la longeur, d est le decimal ( pour float c'est f, par exemple)
            mTextTimer2.setText(timeLeftFormatted); // on mets ce texte dans l'endroit dedié
        }
        else if (seconds > 9 && minutes < 9) {
            String timeLeftFormatted = String.format(Locale.getDefault(), "0%1d:%2d", minutes, seconds);// format est utilisé pour afficher les variables d'une fct specifique;
            // % est le symbole de debut de format, 2 sert a definir la longeur, d est le decimal ( pour float c'est f, par exemple)
            mTextTimer2.setText(timeLeftFormatted);
        }
        else{
            String timeLeftFormatted = String.format(Locale.getDefault(), "0%1d:0%1d", minutes, seconds);// format est utilisé pour afficher les variables d'une fct specifique;
            // % est le symbole de debut de format, 2 sert a definir la longeur, d est le decimal ( pour float c'est f, par exemple)
            mTextTimer2.setText(timeLeftFormatted);
        }
    }
}