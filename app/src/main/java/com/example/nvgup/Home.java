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

public class Home extends AppCompatActivity {

    private Button mButtonBras;  //on définie le bouton qui va permettre d'avoir la page de l'ensemble des exercices de bras
    private Button mButtonJambes; //on définie le bouton qui va permettre d'avoir la page de l'ensemble des exercices de jambes
    private ImageButton mEasyprog; //on définie l'image bouton pour "entrer" dans le programme facile
    private ImageButton mHardprog; //on définie l'image bouton pour "entrer" dans le programme difficile

    @Override
    protected void onCreate(Bundle savedInstanceState) { //visibilité protégé pour manipuler que les objets que dans la classe
       super.onCreate(savedInstanceState); //mettre le code initiale (onCreate execute le code a l'intérieur au chargement de la page)
       setContentView(R.layout.fragment_home); //afficher l'xml associer

        mButtonBras=(Button)findViewById(R.id.button_bras); //assimile le bouton défini à son dientifiant xml
        mButtonJambes=(Button)findViewById(R.id.button_jambes); //assimile le bouton défini à son dientifiant xml
        mEasyprog=(ImageButton)findViewById(R.id.Easy_programme); //assimile l'image bouton défini à son dientifiant xml
        mHardprog=(ImageButton)findViewById(R.id.Hard_programme); //assimile l'image bouton défini à son dientifiant xml

        mButtonBras.setOnClickListener(new View.OnClickListener() { //fonction permettant de choisir la page à ouvrir après avoir cliquer dessus
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,Mouvements.class); //aller dans la classe Mouvements en partant de la classe ci c'est-à-dire home
                startActivity(intent);
            }
        });
        mButtonJambes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, MouvementsJambes.class);//aller dans la classe MouvementsJambes en partant de la classe home
                startActivity(intent);
            }
        });
        mEasyprog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, ProgrammeFacile.class); //aller dans la classe ProgrammeFacile en partant de la classe home
                startActivity(intent);
            }
        });
        mHardprog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, ProgrammeDifficile.class);//aller dans la classe ProgrammeDifficile en partant de la classe home
                startActivity(intent);
            }
        });

}}
