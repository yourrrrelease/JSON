package com.example.json;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
//
//        Student student = new Student("atikah", "atikah@gmail.com", 20);
//
//        //serialization
//        String json = gson.toJson(student);
        //deserialization
        String data = "{\"age\":20,\"email\":\"atikah@gmail.com\",\"name\":\"atikah\"}";
        Student student = gson.fromJson(data, Student.class);
        Log.d(TAG, student.toString());
    }
}