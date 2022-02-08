package com.example.aadassignmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        TextView txtaboutusinfo;
        txtaboutusinfo = findViewById(R.id.txtaboutusinfo);

        Intent fromaboutus = getIntent();
        String favcar = fromaboutus.getStringExtra("Favourite Car");
        String favcolor = fromaboutus.getStringExtra("Favourite Colour");
        String favshoe = fromaboutus.getStringExtra("Favourite Shoe");
        String aboutustitle = fromaboutus.getStringExtra("aboutustitle");

        txtaboutusinfo.setText("I am an engineering student, currently studying for Data Science in my second year. I know how to play the keyboard and I play football and basketball. A little about my favourites, my favourite car is the "+favcar+" ,favourite coloue is "+favcolor+" and my favourite shoe brand is "+favshoe+" .");
        getSupportActionBar().setTitle(aboutustitle);
    }
}

