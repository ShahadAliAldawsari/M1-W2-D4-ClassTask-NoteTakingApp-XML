package com.example.m1w2d4classtasknotetakingappxml

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher



class NoteEditorActivity : AppCompatActivity() {

    private lateinit var titleEditText: EditText
    private lateinit var contentEditText: EditText
    private lateinit var charCountText: TextView
    private lateinit var saveButton: Button
    private lateinit var cancelButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_note_editor)

        // Initialize views
        titleEditText = findViewById(R.id.title_edit_text)
        contentEditText = findViewById(R.id.content_edit_text)
        charCountText = findViewById(R.id.char_count_text)
        saveButton = findViewById(R.id.save_button)
        cancelButton = findViewById(R.id.cancel_button_id)

        // Character count update
        contentEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val charCount = contentEditText.text.length
                charCountText.text = "Character Count: $charCount"
            }

            override fun afterTextChanged(s: Editable?) {}
        })

        // Save button functionality
        saveButton.setOnClickListener {
            val title = titleEditText.text.toString()
            val content = contentEditText.text.toString()

            // Save the note (this is just a simple example, you can add saving functionality)
            // For example, save it to the database or pass it back to the main activity

            finish()  // Close the editor and return to the previous screen
        }

        // Cancel button functionality
        cancelButton.setOnClickListener {
            finish()  // Close the editor without saving
        }



    }
}