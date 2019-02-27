package com.example.ashimghimire.notepad.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities =  Note.class, version = 1, exportSchema = false)
public abstract class AppNoteDataBase extends RoomDatabase {


    public  abstract NoteDao noteDao();




}
