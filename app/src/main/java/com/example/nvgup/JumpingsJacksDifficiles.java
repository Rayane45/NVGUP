package com.example.nvgup;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JumpingsJacksDifficiles extends AppCompatActivity {

    private Button mjjdifficile;; //Après deuxième exo afficher le temps de pause 4

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.difficile2exo);

        mjjdifficile=(Button)findViewById(R.id.suivant_difficile2);

        mjjdifficile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JumpingsJacksDifficiles.this,Pause4.class);
                startActivity(intent);
            }
        });
    }
}
