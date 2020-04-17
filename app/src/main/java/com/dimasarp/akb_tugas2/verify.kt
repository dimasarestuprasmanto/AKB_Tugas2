package com.dimasarp.akb_tugas2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class verify : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)
        val pindah = findViewById(R.id.send) as Button
        var intent = intent
        val name = intent.getStringExtra("Nama")
        val jdarah = intent.getStringExtra("Blood")
        pindah.setOnClickListener{
            val intent = Intent(this, user_home::class.java)
            intent.putExtra("Nama", name)
            intent.putExtra("Blood", jdarah)
            startActivity(intent)
        }
    }
}
