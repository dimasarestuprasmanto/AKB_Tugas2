package com.dimasarp.akb_tugas2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pindah = findViewById(R.id.register) as TextView

        pindah.setOnClickListener{
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }
    }
}
/*
Tanggal Pengerjaan 15 april 2020
Deskripsi : Membuat Login

NIM = 10117123
NAMA = Dimas Arestu Prasmanto
Kelas = IF4
 */
