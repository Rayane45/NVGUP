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
    private Button mButtonRetour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.fragment_home);

        mButtonBras=(Button)findViewById(R.id.button_bras);
        mButtonJambes=(Button)findViewById(R.id.button_jambes);
        mImageBras=findViewById(R.id.image_bras);
        mImageJambes=findViewById(R.id.image_jambes);
        mButtonRetour=(Button)findViewById(R.id.button_retour);

        mButtonBras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this,Mouvements.class);
                startActivity(intent);
                Toast.makeText(Home.this, "Cette couille fonctionne bien",Toast.LENGTH_LONG).show();
            }
        });
        mButtonJambes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Timer.class);
                startActivity(intent);
                Toast.makeText(Home.this, "Cette couille fonctionne pas et j'ai aucune idée pourquoi",Toast.LENGTH_LONG).show();
            }
        });
        mButtonRetour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

}}
