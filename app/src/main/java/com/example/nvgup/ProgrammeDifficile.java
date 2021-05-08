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

public class ProgrammeDifficile extends AppCompatActivity {
    private TextView tProgrammeDifficile;
    private ImageView Pompes_hindu25;
    private ImageView Jumping_jacks30;
    private ImageView Pompes_diamants25;
    private TextView  tPompes_hindu25;
    private TextView tJumping_jacks30;
    private TextView tPompes_diamants25;
    private Button mStart2;
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
        setContentView(R.layout.programme_exo_difficile);

        tProgrammeDifficile = findViewById(R.id.text_difficile);
        Pompes_hindu25= findViewById(R.id.pompes_hindu2);
        Jumping_jacks30 = findViewById(R.id.jumping_jack2);
        Pompes_diamants25= findViewById(R.id.pompesdiamants2);
        tPompes_hindu25= findViewById(R.id.nbre_pompes_hindu);
        tJumping_jacks30= findViewById(R.id.nbre_jumpingjacks);
        tPompes_diamants25 = findViewById(R.id.nbre_pompes_diamants);
        mStart2 = (Button) findViewById(R.id.Start_difficile);


        mStart2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProgrammeDifficile.this,PompesHinduDifficile.class);
                startActivity(intent);
            }
        });
    }
}
