package com.example.aadassignmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Courses extends AppCompatActivity {

    ArrayList<String> courses = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        ListView txtcoursesinfo;
        txtcoursesinfo = findViewById(R.id.txtcoursesinfo);

        courses.add("IDSA");
        courses.add("STPA");
        courses.add("EVS");
        courses.add("MAE");
        courses.add("SSDI");
        courses.add("DBMS");
        courses.add("PHYSICS");
        courses.add("CHEMISTRY");
        courses.add("BIOLOGY");
        courses.add("MATHEMATICS-1");
        courses.add("MATHEMATICS-2");
        courses.add("HEALTH STUDIES");
        courses.add("PHYSICAL EDUCATION");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, courses);
        txtcoursesinfo.setAdapter(adapter);
          }
            }

