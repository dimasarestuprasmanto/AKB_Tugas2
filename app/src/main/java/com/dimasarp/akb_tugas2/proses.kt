package com.dimasarp.akb_tugas2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class proses : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proses)
        val pindah = findViewById(R.id.vry) as Button
        pindah.setOnClickListener{
            val intent = Intent(this, verify::class.java)
            startActivity(intent)
        }
    }
}
