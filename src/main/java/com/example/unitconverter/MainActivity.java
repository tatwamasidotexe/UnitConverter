package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton timeBtn, lengthBtn, tempBtn, massBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timeBtn = findViewById(R.id.timeBtn_id);
        lengthBtn = findViewById(R.id.lengthBtn_id);
        tempBtn = findViewById(R.id.tempBtn_id);
        massBtn = findViewById(R.id.massBtn_id);

        timeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, TimeCalculator.class);
                startActivity(in);
            }
        });
        lengthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, LengthCalculator.class);
                startActivity(in);
            }
        });
        tempBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, TempCalculator.class);
                startActivity(in);
            }
        });
        massBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, MassCalculator.class);
                startActivity(in);
            }
        });
    }
}