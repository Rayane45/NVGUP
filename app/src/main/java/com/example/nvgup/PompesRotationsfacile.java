package com.example.nvgup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PompesRotationsfacile extends AppCompatActivity {

    private Button mPompesRotfacile1; //Après deuxième exo afficher le temps de pause 2

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facile2exo);

        mPompesRotfacile1=(Button)findViewById(R.id.suivant_facile2);

        mPompesRotfacile1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PompesRotationsfacile.this,Pause2.class);
                startActivity(intent);
            }
        });

    }
}
