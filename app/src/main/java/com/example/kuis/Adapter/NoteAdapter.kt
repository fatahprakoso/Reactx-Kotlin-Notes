package com.example.kuis.Adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kuis.Data.Note
import com.example.kuis.R
import java.util.*

class NoteAdapter(var note: List<Note>) : RecyclerView.Adapter<NoteAdapter.NoteViewHolder>() {
    inner class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.note, parent, false)
        return NoteViewHolder(view)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.itemView.apply {
            findViewById<TextView>(R.id.dataTitle).text = note[position].title
            findViewById<TextView>(R.id.dataContent).text = note[position].getShortContent()
        }
    }

    override fun getItemCount(): Int {
        return note.size
    }

}