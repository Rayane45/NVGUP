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


public class Pause4  extends AppCompatActivity {
    private Button mPause4;//création des variables de type bouton
    private Button mStart4;
    private TextView mTextTimer4;//création des variables de type textView
    ProgressBar mProgressBar4;//création d'une variable de type ProgressBar
    public long millisOnTimer=30000;// variable qui définit le temps de depart (en ms)
    public long returnIndex=millisOnTimer;//création d'une variable qui va stocker la valeur du temps de départ
    CountDownTimer mCountDownTimer;// création d'une variable de type CountDownTimer
    int On=0;// création d'une variable qui va montrer si le CountDownTimer est allumé ou pas
    int updateTimer = 1000;// variable qui definit le temps entre les boucles de CountDownTimer (en ms)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pause4);

        mProgressBar4=(ProgressBar)findViewById(R.id.progress_timer4);// liasion des variables aux ID que l'on souhaite
        mStart4=(Button)findViewById(R.id.timer_start_stop4);
        mPause4=(Button)findViewById(R.id.Pause4);
        mTextTimer4=(TextView)findViewById(R.id.timer_txt4);
        mProgressBar4.getProgressDrawable().setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_IN); // change la couleur de la ProgressBar en bleu

        mPause4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {// bouton passage entre les activités
                Intent intent = new Intent(Pause4.this,PompesDiamantsDifficiles.class);
                startActivity(intent);
                millisOnTimer=returnIndex;// on réinitialise la valeur du temps de départ
                mProgressBar4.setProgress(0);// on remets la valeur de ProgressBar à 0
            }
        });
        mStart4.setOnClickListener(new View.OnClickListener() {
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
    public void startTimer(){// la boucle qui va lancer le timer puis le mantenir en fonctionnement jusqu'au le moment que le temps s'écoule ou on appuie sur un autre bouton
        On=1;
        mStart4.setText("Pause");// on ecrit "Pause" sur le bouton
        mCountDownTimer = new CountDownTimer(millisOnTimer,updateTimer) { // CountDownTimer, une fonction de base de Android Studio. Il fonctionne pendent millisOnTimer temps, et refait le cycle onTick tout les updateTimer millisecondes.
            long increase;// variable qui fera varier la ProgressBar
            @Override
            public void onTick(long millisUntilFinished) {// onTick, qui s'execute tout les updateTimer secondes
                increase =(100*(updateTimer)/(returnIndex));// la valeur qui presente le pourcentage de updateTimer dans millisOnTimer (ex: 1 seconde est 3.333% de 30 secondes, increase est donc égal à 3.33 secondes
                mProgressBar4.incrementProgressBy((int)increase);// fonction de ProgressBar qui augmente la valeur de ProgressBar de tant (increase ici)
                millisOnTimer=millisUntilFinished;// on change la valeur de millisOnTimer afin que le temps "s'écoule"
                updateCountDownText();

            }
            @Override
            public void onFinish() {
                On=0;
                mStart4.setText("Start"); // on écrit "Start" sur le bouton
                mProgressBar4.setProgress(100);// une fois que le temps s'est écoulé, on doit avoir ProgressBar remplie à 100%
            }
        }.start();// lance le programme dés le debut
    }
    public void stopTimer(){
        mCountDownTimer.cancel(); //on arrete le CountDownTimer (aka startTimer())
        On=0;
        mStart4.setText("Start");
    }
    public void updateCountDownText(){
        int minutes = (int) (millisOnTimer  /1000) /60; // (int) est utilisé pour forcer une variable de se transformer dans le format de la parantese
        int seconds = (int) (millisOnTimer  /1000) % 60;
        if (seconds>9 && minutes>9) {
            String timeLeftFormatted = String.format(Locale.getDefault(), "%2d:%2d", minutes, seconds);// format est utilisé pour afficher String sous un format spécifique;
            // Locale est la fonction qui permet de déterminer la langue du affichage, et getDefault() permet de recuperer la langue du telephone
            // % est le symbole de debut de format, 2 sert a definir la longeur, d est le decimal ( pour float c'est f, par exemple)
            mTextTimer4.setText(timeLeftFormatted); // on mets ce texte dans l'endroit dedié
        }
        else if(seconds<9 && minutes>9){
            String timeLeftFormatted = String.format(Locale.getDefault(), "%2d:0%1d", minutes, seconds);// format est utilisé pour afficher String sous un format spécifique;
            // Locale est la fonction qui permet de déterminer la langue du affichage, et getDefault() permet de recuperer la langue du telephone
            // % est le symbole de debut de format, 0%1 sert a definir la longeur (%1) et le 0 sert a l'afficher, même si la valeur de secondes ou minutes n'as pas 2 chiffres
            // d est le decimal ( pour float c'est f, par exemple)
            mTextTimer4.setText(timeLeftFormatted); // on mets ce texte dans l'endroit dedié
        }
        else if (seconds > 9 && minutes < 9) {
            String timeLeftFormatted = String.format(Locale.getDefault(), "0%1d:%2d", minutes, seconds);// format est utilisé pour afficher String sous un format spécifique;
            // Locale est la fonction qui permet de déterminer la langue du affichage, et getDefault() permet de recuperer la langue du telephone
            // % est le symbole de debut de format, 0%1 sert a definir la longeur (%1) et le 0 sert a l'afficher, même si la valeur de secondes ou minutes n'as pas 2 chiffres
            // d est le decimal ( pour float c'est f, par exemple)
            mTextTimer4.setText(timeLeftFormatted);
        }
        else{
            String timeLeftFormatted = String.format(Locale.getDefault(), "0%1d:0%1d", minutes, seconds);/// format est utilisé pour afficher String sous un format spécifique;
            // Locale est la fonction qui permet de déterminer la langue du affichage, et getDefault() permet de recuperer la langue du telephone
            // % est le symbole de debut de format, 0%1 sert a definir la longeur (%1) et le 0 sert a l'afficher, même si la valeur de secondes ou minutes n'as pas 2 chiffres
            // d est le decimal ( pour float c'est f, par exemple)
            mTextTimer4.setText(timeLeftFormatted);
        }
    }
}
