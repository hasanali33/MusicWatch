package com.example.stopwatchworks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Menu extends AppCompatActivity {
    TextView onMind;
    Button bstopwatch, btodo, bmoney;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        bstopwatch = findViewById(R.id.buttonstopwatch);
        bmoney = findViewById(R.id.buttonmoney);
        btodo = findViewById(R.id.buttontodo);



        bstopwatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        bmoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        }


    }
}
