package com.example.m1w2d4classtasknotetakingappxml

import NoteAdapter
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.m1w2d4classtasknotetakingappxml.ui.theme.M1W2D4ClassTaskNoteTakingAppXMLTheme
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : ComponentActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: NoteAdapter
    private val notes = mutableListOf<Note>()

    // Define a request code for adding a new note
    private val REQUEST_CODE_ADD_NOTE = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
//        adapter = NoteAdapter(notes)
        recyclerView.adapter = adapter

        // Floating Action Button to add new notes
        val fab: FloatingActionButton = findViewById(R.id.fab_add_note)
        fab.setOnClickListener {
            val intent = Intent(this, AddNoteActivity::class.java)
            startActivityForResult(intent, REQUEST_CODE_ADD_NOTE) // Start activity and expect a result
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == REQUEST_CODE_ADD_NOTE && resultCode == RESULT_OK) {
            val title = data?.getStringExtra("title") ?: ""
            val content = data?.getStringExtra("content") ?: ""

            // Add the new note to your list and update RecyclerView
            val newNote = Note(title, content)
            notes.add(newNote)
            recyclerView.adapter?.notifyItemInserted(notes.size - 1) // Refresh RecyclerView
        }
    }
}
