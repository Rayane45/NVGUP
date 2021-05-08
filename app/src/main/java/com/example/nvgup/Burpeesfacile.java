package com.example.nvgup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Burpeesfacile extends AppCompatActivity {
    private  TextView tBurpeesfacile;
    private ImageView tBurpeesfacile10;
    private TextView tBurpeesdesfacile;
    private Button mButtonfacile1; //Après première exo afficher le temps de pause 1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facile1exo);

        tBurpeesfacile=findViewById(R.id.nbre_burpeesfacile);
        tBurpeesfacile10=findViewById(R.id.burpees1facile);
        tBurpeesdesfacile=findViewById(R.id.text_burpeesfacile);
        mButtonfacile1=(Button)findViewById(R.id.suivant_facile1);

        mButtonfacile1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Burpeesfacile.this,Pause1.class);
                startActivity(intent);
            }
        });
    }
}