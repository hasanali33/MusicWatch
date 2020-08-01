package com.example.stopwatchworks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class stopwatchact extends AppCompatActivity {

    Button stopwatch, fworkout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatchact);


        stopwatch = findViewById(R.id.buttonstopwatch);
        fworkout = findViewById(R.id.fworkout);



        stopwatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopwatch.setVisibility(View.GONE);
                fworkout.setVisibility(View.VISIBLE);
            }
        });

        fworkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopwatch.setVisibility(View.VISIBLE);
                fworkout.setVisibility(View.GONE);
            }
        });
    }
}
