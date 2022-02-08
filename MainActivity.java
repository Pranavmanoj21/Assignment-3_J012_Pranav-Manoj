package com.example.aadassignmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnhome, btnaboutus, btncourses;
        btnhome = findViewById(R.id.btnhome);
        btnaboutus = findViewById(R.id.btnaboutus);
        btncourses = findViewById(R.id.btncourses);

        Intent iHome;
        Intent iAboutUs;
        Intent iCourses;

        iHome = new Intent(MainActivity.this, Home.class);
        iAboutUs = new Intent(MainActivity.this, AboutUs.class);
        iCourses = new Intent(MainActivity.this, Courses.class);

        iHome.putExtra("Name", "Pranav Manoj");
        iHome.putExtra("Age", "20");
        iHome.putExtra("Address", "Bangalore");
        iHome.putExtra("College", "NMIMS MPSTME");
        iHome.putExtra("hometitle", "Home Page");

        iAboutUs.putExtra("Favourite Car", "Lamborghini Aventador");
        iAboutUs.putExtra("Favourite Colour", "Black");
        iAboutUs.putExtra("Favourite Shoe", "Nike");
        iAboutUs.putExtra("aboutustitle", "About Us Page");

        iCourses.putExtra("sub1", "DBMS");
        iCourses.putExtra("sub2", "AAD");
        iCourses.putExtra("sub3", "IDSA");
        iCourses.putExtra("sub4", "EVS");
        iCourses.putExtra("sub5", "STPA");
        iCourses.putExtra("sub6", "MAE");
        iCourses.putExtra("sub7", "SSDI");
        iCourses.putExtra("sub8", "PE");
        iCourses.putExtra("coursestitle", "Courses Page");

        btnhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(iHome);
            }
        });
        btnaboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(iAboutUs);
            }
        });
        btncourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(iCourses);
            }
        });
    }
}