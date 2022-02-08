package com.example.aadassignmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView txthomeinfo;
        txthomeinfo = findViewById(R.id.txthomeinfo);
        Intent fromhome = getIntent();
        String name = fromhome.getStringExtra("Name");
        String age = fromhome.getStringExtra("Age");
        String address = fromhome.getStringExtra("Address");
        String college = fromhome.getStringExtra("College");
        String hometitle = fromhome.getStringExtra("hometitle");

        txthomeinfo.setText("My name is " + name + ". " + "I am " + age + " years old. I stay currently in " + address + " . Currently, I am studying at " + college + " in Mumbai");
        getSupportActionBar().setTitle(hometitle);
    }
}