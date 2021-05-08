package com.example.nvgup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MouvementsJambes extends AppCompatActivity {
    private ImageView mJumpingjack;
    private ImageView mFentes;
    private ImageView mSquatSaut;
    private TextView mJumpingText;
    private TextView mFentesText;
    private TextView mSquatTex;
    private Button mRetourJambes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mvt_jambes);

        mJumpingjack = findViewById(R.id.jumping_jack);
        mFentes = findViewById(R.id.fentes);
        mSquatSaut = findViewById(R.id.squat_saut);
        mJumpingText = findViewById(R.id.text_jumping_jack);
        mFentesText = findViewById(R.id.text_fentes);
        mSquatTex = findViewById(R.id.text_squat);
        mRetourJambes = (Button) findViewById(R.id.retour_jambes);

        mRetourJambes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MouvementsJambes.this, Home.class);
                startActivity(intent);
            }
        });
    }
}
