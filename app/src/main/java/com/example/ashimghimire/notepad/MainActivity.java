package com.example.ashimghimire.notepad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.ashimghimire.notepad.data.AppNoteDataBase;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //AppNoteDataBase appNoteDataBase;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //appNoteDataBase = Room.databaseBuilder(getApplicationContext(),
          //                                AppNoteDataBase.class, "table_note").build();
        findView();

    }



    private void findView() {
        findViewById(R.id.add_note_btn).setOnClickListener(this);
    }


    
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.add_note_btn:
                startActivity(new Intent(MainActivity.this, EditorActivity.class));
                break;
        }
    }







}
