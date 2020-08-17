package com.example.andy.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView list = findViewById(R.id.list);
        ArrayList<SubjectData> arrayList = new ArrayList<SubjectData>();


        arrayList.add(new SubjectData("Lite App One", "APP_345345", "Start 1231"));
        arrayList.add(new SubjectData("Lite App Two", "APP_345345", "Start 1232"));
        arrayList.add(new SubjectData("Lite App Three", "APP_345345", "Start 1233"));
        arrayList.add(new SubjectData("Lite App Four", "APP_345345", "Start 1234"));
        arrayList.add(new SubjectData("Lite App Five", "APP_345345", "Start 1235"));
        arrayList.add(new SubjectData("Lite App Six", "APP_345345", "Start 1236"));
        arrayList.add(new SubjectData("Lite App Six", "APP_345345", "Start 1236"));
        arrayList.add(new SubjectData("Lite App Six", "APP_345345", "Start 1236"));
        arrayList.add(new SubjectData("Lite App Six", "APP_345345", "Start 1236"));
        arrayList.add(new SubjectData("Lite App Six", "APP_345345", "Start 1236"));

        CustomAdapter customAdapter = new CustomAdapter(this, arrayList);
        list.setAdapter(customAdapter);
    }
}
