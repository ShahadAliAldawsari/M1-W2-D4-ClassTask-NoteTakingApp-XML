<h1>Note Taking App</h1>

<h2>Description</h2>
This is a simple Android note-taking app that allows users to create, view, and manage notes. The app utilizes a RecyclerView to display notes, an Add Note Activity for creating new notes, and a Note Editor Activity for editing them. The project follows an XML-based UI alongside Jetpack Compose.<br>

<h2>Features</h2>
- Add new notes with a title and content<br>
- View a list of saved notes<br>
- Edit and update existing notes<br>
- Character count display for note content<br>
- User-friendly UI with Material Design elements<br>

<h2>Project Structure</h2>
app/src/main/java/com/example/m1w2d4classtasknotetakingappxml/<br>
│── MainActivity.kt              # Main screen with RecyclerView<br>
│── AddNoteActivity.kt           # Activity for adding a new note<br>
│── NoteEditorActivity.kt        # Activity for editing an existing note<br>
│── NoteAdapter.kt               # Adapter for RecyclerView<br>
│── Note.kt                      # Data class representing a Note<br>
│<br>
res/layout/
│── activity_main.xml            # Layout for MainActivity<br>
│── add_note_activity.xml        # Layout for AddNoteActivity<br>
│── activity_note_editor.xml     # Layout for NoteEditorActivity<br>
│── note_item.xml                # Layout for individual note items in RecyclerView<br>

<h2>Installation and Running Instructions</h2>
1- Clone this repository or download the project.<br>
2- Open the project in Android Studio.<br>
3- Connect a physical device or start an emulator.<br>
4- Build and run the application.<br>

<h2>How to UseHow to Use</h2>
1- Add a Note: Click on the floating action button (+) in the MainActivity to open the Add Note screen.<br>
2- Save a Note: Enter the title and content, then click the "Save" button.<br>
3- View Notes: The saved notes will be displayed in a list on the main screen.<br>
4- Edit Notes: Select a note to open it in the editor, modify it, and save the changes.<br>

<h2>Dependencies</h2>
- Implement a local database for persistent storage<br>
- Add note deletion functionality<br>
- Improve UI with animations<br>
