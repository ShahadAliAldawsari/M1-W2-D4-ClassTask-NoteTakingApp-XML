package com.example.m1w2d4classtasknotetakingappxml

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AddNoteActivity : AppCompatActivity() {

    private lateinit var titleInput: EditText
    private lateinit var contentInput: EditText
    private lateinit var saveButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_note_activity)

        titleInput = findViewById(R.id.title_id)
        contentInput = findViewById(R.id.content_id)
        saveButton = findViewById(R.id.save_button)


        saveButton.setOnClickListener {
            val newTitle = titleInput.text.toString()
            val newContent = contentInput.text.toString()

            val intent = Intent()
            intent.putExtra("new_title", newTitle)
            intent.putExtra("new_content", newContent)
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}