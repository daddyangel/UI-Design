package com.example.uilearning;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.next);
        button.setOnClickListener(v -> opennext());

    }
    public void opennext() {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}
