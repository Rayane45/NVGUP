package com.example.nvgup;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class Fentesfacile extends AppCompatActivity {

    private TextView tFentesfacile;
    private ImageView tFentesfacile10;
    private TextView tFentesdesfacile;
    private Button mFentesfacile1; //Après troisième exo fini retour à la page d'acceuil

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facile3exo);

        tFentesfacile=findViewById(R.id.nbre_fentesfacile);
        tFentesfacile10=findViewById(R.id.fentesfacile);
        tFentesdesfacile=findViewById(R.id.text_fentesfacile);
        mFentesfacile1=(Button)findViewById(R.id.terminé1);

        mFentesfacile1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fentesfacile.this,Home.class);
                startActivity(intent);
            }
        });

    }
}
