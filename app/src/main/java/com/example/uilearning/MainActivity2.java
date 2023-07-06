package com.example.uilearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button1 = findViewById(R.id.next1);
        button1.setOnClickListener(v -> yougoback());
    }
    public void yougoback(){
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}