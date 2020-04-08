package com.example.resources;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public Button enter;
    public TextView welcome;
    public ImageView illLogo;
    public Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // defining the textView variable

        final TextView welcome = findViewById(R.id.welcome);

        final ImageView illLogo = findViewById(R.id.iLL);
        // defining the ImageView logo


        // defining the button variable
        Button enter = findViewById(R.id.enter);

        enter.setOnClickListener(v -> {
            startActivity(new Intent(this, Introduction.class));

        });



    }
}
