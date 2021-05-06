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
            public void onClick(View view) {
                // ovuerture de l'activité AjoutEtudiant
                Intent intent = new Intent(MainActivity.this, Home.class);
                startActivity(intent);
            }
        });
    }
    public void newActivity(){
        Intent intent=new Intent(this, Home.class);
        startActivity(intent);
    }
}



//package com.example.nvgup
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import com.example.nvgup.fragments.HomeFragment
//
//class MainActivity : AppCompatActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        //injecter fragment dans la boite (fragment_container)
//        val transaction = supportFragmentManager.beginTransaction()
//        transaction.replace(R.id.fragment_cointainer, HomeFragment())
//        transaction.addToBackStack(null)
//        transaction.commit()
//    }
//}