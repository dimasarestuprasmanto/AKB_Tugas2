package com.dimasarp.akb_tugas2

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_register.*

class register : AppCompatActivity() {

    var Blood_Type: String? = null


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
        val Nama = findViewById<EditText>(R.id.username)
        val jenis_darah = resources.getStringArray(R.array.darah)

        val bloodt = findViewById<Spinner>(R.id.darah_user)
        if (bloodt != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item, jenis_darah
            )
            bloodt.adapter = adapter

            bloodt.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    Blood_Type = bloodt.getSelectedItem().toString();
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    // kosong
                }
            }
        }


        pds.setOnClickListener {
            val name = Nama.text.toString()
            var jdarah = Blood_Type.toString()

            if(name.isEmpty())
            {
                Toast.makeText(this,"Username Tidak Boleh Kosong", Toast.LENGTH_SHORT ).show()
                return@setOnClickListener
            }

            if(jdarah.equals("Blood Type"))
            {
                Toast.makeText(this,"Golongan Darah Harus di isi", Toast.LENGTH_SHORT ).show()
                return@setOnClickListener
            }


            if(setuju.isChecked())
            {
                val intent = Intent(this, proses::class.java)
                intent.putExtra("Nama", name)
                intent.putExtra("Blood", jdarah)
                startActivity(intent)
            }
            else
            {
                Toast.makeText(this,"Silahkan Centang Agree with Terms and Conditions Terlebih Dahulu",Toast.LENGTH_SHORT).show();
            }
        }

    }
        override fun onSupportNavigateUp(): Boolean {
            onBackPressed()
            return true
    }
}
