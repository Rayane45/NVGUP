package com.example.nvgup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Mouvements extends AppCompatActivity {
    private Button mpageretour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mouvement_bras);

        mpageretour=(Button)findViewById(R.id.retour_page);
        mpageretour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Mouvements.this, Home.class );
                startActivity(intent);
                finish();
            }
        });
    }
}
