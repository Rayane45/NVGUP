package com.example.nvgup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nvgup.fragments.HomeFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //injecter fragment dans la boite (fragment_container)
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_cointainer, HomeFragment())
        transaction.addToBackStack(null)
        transaction.commit()
    }
}