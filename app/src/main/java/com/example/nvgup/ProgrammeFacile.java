package com.example.nvgup;
//apport de toute les bibliothèques

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
    private Button mStart;//on définie le bouton pour commencer le programme facile de sport

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.programme_exo_facile);

        mStart = (Button) findViewById(R.id.Start_facile);//assimile le bouton défini à son dientifiant xml


        mStart.setOnClickListener(new View.OnClickListener() {//fonction permettant de choisir la page à ouvrir après avoir cliquer dessus
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProgrammeFacile.this,Burpeesfacile.class);//aller dans la classe BurpeesFaciles en partant de la classe ProgrammeFacile
                startActivity(intent);
            }
        });
    }
}