package com.example.ashimghimire.notepad.data;


import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface NoteDao {



    @Query("SELECT * FROM table_note ORDER BY  notePriority DESC ")
    List<Note> getAllNotes();

    @Insert
    void insert (Note note);

    @Update
    void update(Note note);

    @Delete
    void  delete(Note note);
}
