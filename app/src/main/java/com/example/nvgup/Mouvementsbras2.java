package com.example.nvgup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Mouvementsbras2 extends AppCompatActivity {
    private Button mPrecedant;
    private Button mAcceuil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mvt_bras_2);

        mPrecedant = findViewById(R.id.précèdent);
        mAcceuil = findViewById(R.id.acceuil);

        mPrecedant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mouvementsbras2.this, Mouvements.class);
                startActivity(intent);
                Toast.makeText(Mouvementsbras2.this, "Daniil est con2", Toast.LENGTH_LONG ).show();
            }
        });

        mAcceuil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mouvementsbras2.this, Home.class);
                startActivity(intent);
                Toast.makeText(Mouvementsbras2.this, "Daniil est con3", Toast.LENGTH_LONG ).show();
            }
        });
    }
}
