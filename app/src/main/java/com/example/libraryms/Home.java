package com.example.libraryms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Home extends AppCompatActivity {
Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Spinner x=findViewById(R.id.spinner_languages);
        ArrayAdapter<CharSequence>adapter= ArrayAdapter.createFromResource(this, R.array.languages, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        b1=findViewById(R.id.add);
        x.setAdapter(adapter);
        b1.setOnClickListener(view -> {
            Intent i;
            i=new Intent(getApplicationContext(),Add.class);
            startActivity(i);
        });
        b2=findViewById(R.id.delete);
        b2.setOnClickListener(view -> {
            Intent i;
            i=new Intent(getApplicationContext(),Delete.class);
            startActivity(i);
        });
        b3=findViewById(R.id.update);
        b3.setOnClickListener(view -> {
            Intent i;
            i=new Intent(getApplicationContext(),Update.class);
            startActivity(i);
        });

    }
}