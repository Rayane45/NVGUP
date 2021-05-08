package com.example.nvgup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button mButtonWelcome;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonWelcome= (Button) findViewById(R.id.button_welcome);
    
        mButtonWelcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, Home.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Merci d'avoir choisi cette application! On vous aime!", Toast.LENGTH_LONG).show();
            }
        });
    }}



