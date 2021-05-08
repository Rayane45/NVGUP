package com.example.nvgup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class PompesDiamantsDifficiles extends AppCompatActivity {

    private Button mdddifficile;; //Après deuxième exo afficher page d'acceuil

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.difficile3exo);

        mdddifficile=(Button)findViewById(R.id.suivant_difficile3);

        mdddifficile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PompesDiamantsDifficiles.this,Home.class);
                startActivity(intent);
            }
        });
    }
}
