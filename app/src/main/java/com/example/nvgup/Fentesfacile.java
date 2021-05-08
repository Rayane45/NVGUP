package com.example.nvgup;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class Fentesfacile extends AppCompatActivity {


    private Button mFentesfacile1; //Après troisième exo fini retour à la page d'acceuil

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.facile3exo);

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
