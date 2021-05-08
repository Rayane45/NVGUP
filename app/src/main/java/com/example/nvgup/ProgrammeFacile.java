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

public class ProgrammeFacile extends AppCompatActivity {
    private TextView tProgrammeFacile;
    private ImageView Burpees10;
    private ImageView Pompesrot10;
    private ImageView Fentes10;
    private ImageView Pompes10;
    private ImageView Pompesdec10;
    private TextView  tBurpees10;
    private TextView tPompesrot10;
    private TextView tFentes10;
    private TextView tPompes10;
    private TextView tPompesdec10;
    private Button mStart;
    long TimeUper=1800000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.programme_exo_facile);

        tProgrammeFacile=findViewById(R.id.text_facile);
        Burpees10=findViewById(R.id.burpees2);
        Pompesrot10=findViewById(R.id.pompes_rotation2);
        Fentes10=findViewById(R.id.fentes2);
        Pompes10=findViewById(R.id.pompes2);
        Pompesdec10=findViewById(R.id.pompes_dec2);
        tBurpees10=findViewById(R.id.text_burpees);
        tPompesrot10=findViewById(R.id.text_pompes_rotation);
        tFentes10=findViewById(R.id.text_fentes);
        tPompes10=findViewById(R.id.text_pompes);
        tPompesdec10=findViewById(R.id.text_pompes_dec);
        mStart=(Button)findViewById(R.id.Start_facile);

        mStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProgrammeFacile.this,Timer.class);
                startActivity(intent);
            }
        });


    }
}
