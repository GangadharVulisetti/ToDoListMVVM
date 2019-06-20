package com.gangadharvulisetti.android.todolistmvvm;

import android.app.Application;

public class NoteRepository {

    private NoteDatabase mNoteDatabase;

    private NoteDao mNoteDao;

    public NoteRepository(Application application){
        mNoteDatabase = NoteDatabase.getInstance(application);
        mNoteDao = mNoteDatabase.noteDao();
    }

    public void insert(Note note){

    }

    public void update(Note note){

    }

    public void delete(Note note){

    }

    public void getAllNotes(){

    }


}
