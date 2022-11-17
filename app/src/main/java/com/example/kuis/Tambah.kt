package com.example.kuis

import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.kuis.Data.SingletonController
import io.reactivex.rxjava3.kotlin.subscribeBy

class Tambah : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah)

        findViewById<Button>(R.id.back_tambah_button).setOnClickListener {
            finish()
        }

        findViewById<Button>(R.id.create_tambah_button).setOnClickListener {
            val titleInput = findViewById<EditText>(R.id.title_input)
            val contentInput = findViewById<EditText>(R.id.content_input)

            if(titleInput.text.toString().equals("") || titleInput.text.toString().equals(null)){
                Toast.makeText(this,"Input the title!",Toast.LENGTH_LONG).show()
            }

            else if(contentInput.text.toString().equals("") || contentInput.text.toString().equals(null)){
                Toast.makeText(this,"Input the content!",Toast.LENGTH_LONG).show()
            }

            else{
                val title = titleInput.text.toString()
                val content = contentInput.text.toString()

                // event yang membuat subscriber ter-emit
                SingletonController.getController().addData(title,content)

                Toast.makeText(this,"success!",Toast.LENGTH_LONG).show()
                finish()

            }
        }
    }
}