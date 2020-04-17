package com.dimasarp.akb_tugas2

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.annotation.RequiresApi

class register : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        //actionbar
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "Register"
        actionbar.setBackgroundDrawable(getDrawable(R.drawable.ic_header))
        //set back button
        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        val pindah = findViewById(R.id.pds) as Button
        pindah.setOnClickListener{
            val intent = Intent(this, proses::class.java)
            startActivity(intent)
        }

    }
        override fun onSupportNavigateUp(): Boolean {
            onBackPressed()
            return true
    }
}
