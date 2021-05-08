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
    private TextView mTexteBras;
    private TextView mTexteJambes;
    private Button mButtonBras;
    private Button mButtonJambes;
    private ImageView mImageBras;
    private ImageView mImageJambes;
    private ImageButton mEasyprog;
    private ImageButton mHardprog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.fragment_home);

        mButtonBras=(Button)findViewById(R.id.button_bras);
        mButtonJambes=(Button)findViewById(R.id.button_jambes);
        mImageBras=findViewById(R.id.image_bras);
        mImageJambes=findViewById(R.id.image_jambes);
        mEasyprog=(ImageButton)findViewById(R.id.Easy_programme);
        mHardprog=(ImageButton)findViewById(R.id.Hard_programme);

        mButtonBras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,Mouvements.class);
                startActivity(intent);
            }
        });
        mButtonJambes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, MouvementsJambes.class);
                startActivity(intent);
            }
        });
        mEasyprog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, ProgrammeFacile.class);
                startActivity(intent);
            }
        });
        mHardprog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, ProgrammeFacile.class);
                startActivity(intent);
            }
        });

}}
