package id.ac.unhas.mynotes.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.ac.unhas.mynotes.R
import id.ac.unhas.mynotes.db.Note
import kotlinx.android.synthetic.main.note_layout.view.*

class NotesAdapter(val notes: List<Note>) : RecyclerView.Adapter<NotesAdapter.NoteViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
          return NoteViewHolder(
              LayoutInflater.from(parent.context)
                  .inflate(R.layout.note_layout, parent,false)
          )
    }

    override fun getItemCount() = notes.size

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.view.tv_title.text = notes[position].title
        holder.view.tv_note.text = notes[position].note
    }

    class NoteViewHolder(val view: View) : RecyclerView.ViewHolder(view)

}