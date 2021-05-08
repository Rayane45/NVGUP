package com.example.nvgup;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PompesHinduDifficile extends AppCompatActivity {

    private Button mPompesHindudifficile;; //Après première exo afficher le temps de pause 3

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.difficile1exo);

        mPompesHindudifficile=(Button)findViewById(R.id.suivant_difficile1);

        mPompesHindudifficile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PompesHinduDifficile.this,Pause3.class);
                startActivity(intent);
            }
        });
    }
}
