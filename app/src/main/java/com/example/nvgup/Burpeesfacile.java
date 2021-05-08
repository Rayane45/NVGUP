package com.example.nvgup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Burpeesfacile extends AppCompatActivity {
    private Button mButtonfacile1; //Après première exo afficher le temps de pause 1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facile1exo);

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