package com.example.nvgup.fragments;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.nvgup.Home;
import com.example.nvgup.MainActivity;
import com.example.nvgup.Mouvements;
import com.example.nvgup.R;

public class MouvementsBras2 extends AppCompatActivity {
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
                Intent intent = new Intent(MouvementsBras2.this, Mouvements.class);
                startActivity(intent);
                Toast.makeText(MouvementsBras2.this, "Daniil est con2", Toast.LENGTH_LONG ).show();
            }
        });

        mAcceuil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MouvementsBras2.this, Home.class);
                startActivity(intent);
                Toast.makeText(MouvementsBras2.this, "Daniil est con3", Toast.LENGTH_LONG ).show();
            }
        });
    }
}