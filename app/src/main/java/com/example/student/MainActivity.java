package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button studentbutton;
    private Button teacherbutton;
    private Button instituebutton;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        studentbutton=(Button) findViewById(R.id.studentbutton);
        teacherbutton=(Button) findViewById(R.id.teacherbutton);
        instituebutton=(Button) findViewById(R.id.institutebutton);
        studentbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity1();
            }
        });

       teacherbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity2();
            }
        });

        instituebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity3();
            }
        });

    }
    public void openactivity1(){
        Intent intent = new Intent(this, studentview.class);
        startActivity(intent);
    }

    public void openactivity2(){
        Intent intent = new Intent(this, teacherview.class);
        startActivity(intent);
    }

    public void openactivity3(){
        Intent intent = new Intent(this, instituteview.class);
        startActivity(intent);
    }

}