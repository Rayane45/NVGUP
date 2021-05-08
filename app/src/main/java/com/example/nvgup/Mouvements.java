package com.example.nvgup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Mouvements extends AppCompatActivity {
    private Button mButtonRetour; //définition du bouton pour revenir à la page précédante
    private Button mSuivant; //définition du bouton pour aller à la page suivante


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mvt_bras_1);

        mButtonRetour=(Button)findViewById(R.id.plof);
        mSuivant=(Button)findViewById(R.id.suivant);


        mButtonRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mSuivant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mouvements.this, Mouvementsbras2.class);//aller de la page actuel Mouvements à la page MouvementsBras2
                startActivity(intent);
            }
        });

    }
}



