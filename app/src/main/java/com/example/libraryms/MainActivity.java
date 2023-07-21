package com.example.libraryms;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button b1,b2;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.login);
        b1.setOnClickListener(view -> {
            Intent i;
            i=new Intent(getApplicationContext(),StudentActivity.class);
            startActivity(i);
        });
        b2=findViewById(R.id.home);
        b2.setOnClickListener(view -> {
            Intent i1;
            i1=new Intent(getApplicationContext(),Home.class);
            startActivity(i1);
        });


    }
}