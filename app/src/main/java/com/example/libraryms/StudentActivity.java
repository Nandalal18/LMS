package com.example.libraryms;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class StudentActivity extends AppCompatActivity {
ImageButton b1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        b1=findViewById(R.id.imageButton);
        b1.setOnClickListener(view -> {
            Intent i;
            i=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(i);
        });
    }
}