package com.example.kuis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // tambah note
        findViewById<Button>(R.id.tambah_button).setOnClickListener {
//            intent = Intent(this,Tambah:class)
        }

        // lihat note
        findViewById<Button>(R.id.lihat_button).setOnClickListener {

        }
    }
}