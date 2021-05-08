package com.example.nvgup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.nvgup.fragments.MouvementsBras2;

public class Mouvements extends AppCompatActivity {
    private Button mButtonRetour;
    private Button mSuivant;
    private ImageView mPompes;
    private ImageView mBurpees;
    private ImageView mPompesdec;
    private ImageView mPompeshin;
    private TextView mPompesText;
    private TextView mBurpeesText;
    private TextView mPompesdecText;
    private TextView mPompeshinText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mvt_bras_1);

        mButtonRetour=findViewById(R.id.plof);
        mSuivant=findViewById(R.id.suivant);
        mPompes=findViewById(R.id.pompes);
        mBurpees=findViewById(R.id.burpees);
        mPompesdec=findViewById(R.id.pompes_dec);
        mPompeshin=findViewById(R.id.pompes_hindu);
        mPompesText=findViewById(R.id.text_pompes);
        mBurpeesText=findViewById(R.id.text_burpees);
        mPompesdecText=findViewById(R.id.text_pompes_dec);
        mPompeshinText=findViewById(R.id.text_pompes_hindu);

        mButtonRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mouvements.this, Home.class);
                startActivity(intent);
                Toast.makeText(Mouvements.this, "Daniil est con", Toast.LENGTH_LONG ).show();
            }
        });
        mSuivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mouvements.this, MouvementsBras2.class);
                startActivity(intent);
                Toast.makeText(Mouvements.this, "Daniil est idiot", Toast.LENGTH_LONG ).show();
            }
        });

    }
}



