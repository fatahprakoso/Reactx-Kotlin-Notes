package com.example.kuis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.kuis.Data.NoteController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val noteController = NoteController()

        // tambah note
        findViewById<Button>(R.id.tambah_button).setOnClickListener {
            intent = Intent(this,Tambah::class.java)
            startActivity(intent)
        }

        // lihat note
        findViewById<Button>(R.id.lihat_button).setOnClickListener {
            intent = Intent(this, Lihat::class.java)
            startActivity(intent)
        }


    }
}