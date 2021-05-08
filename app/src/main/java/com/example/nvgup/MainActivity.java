package com.example.nvgup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button mButtonWelcome; //on definie le m=bouton pour ouvrir la page d'acceuil de l'application
    @Override
    protected void onCreate( Bundle savedInstanceState) {//visibilité protégé pour manipuler que les objets que dans la classe
        super.onCreate(savedInstanceState);//démarer le code initiale
        setContentView(R.layout.activity_main);//affiche l'xml associer

        mButtonWelcome= (Button) findViewById(R.id.button_welcome);//assimile le bouton défini à son dientifiant xml
    
        mButtonWelcome.setOnClickListener(new View.OnClickListener() { //fonction permettant de choisir la page à ouvrir après avoir cliquer dessus
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, Home.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Merci d'avoir choisi cette application! On vous aime!", Toast.LENGTH_LONG).show();
            }
        });
    }}



