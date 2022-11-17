package com.example.kuis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kuis.Adapter.NoteAdapter
import com.example.kuis.Data.Note
import com.example.kuis.Data.SingletonController
import io.reactivex.rxjava3.kotlin.subscribeBy
import java.util.*

class Lihat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lihat)

        findViewById<Button>(R.id.back_lihat).setOnClickListener {
            finish()
        }

        var list:LinkedList<Note> = LinkedList()

        var adapter = NoteAdapter(list)

        // penggunaan subscriber untuk digunakan pada recycle view
        SingletonController.getController().getObservable().subscribeBy(
            onNext = {
                adapter = NoteAdapter(it)
            },
            onComplete = {}
        )
        
        val rNote = findViewById<RecyclerView>(R.id.noteRView)

        rNote.adapter = adapter
        rNote.layoutManager=LinearLayoutManager(this)
    }
}