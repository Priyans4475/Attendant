package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class loginpage extends AppCompatActivity {
          private TextView tv;
          private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        TextView tv=(TextView)findViewById(R.id.signuptext);
        Button button=findViewById(R.id.button2);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                { openactivity4();}
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(loginpage.this, "Not Created account yet !! ", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void openactivity4(){
        Intent intent = new Intent(this ,MainActivity.class);
        startActivity(intent);
    }
}