package com.example.stopwatchworks;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView welcomeSubText;
    TextView welcomeText;
    Button button;
    Animation atg, welcomesubgone, buttongone;
    ImageView businessMan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        welcomeSubText = findViewById(R.id.welcomeSubText);
        welcomeText = findViewById(R.id.welcomeText);
        businessMan = findViewById(R.id.businessman);

        // loads animation
        atg = AnimationUtils.loadAnimation(this, R.anim.atg);
        buttongone = AnimationUtils.loadAnimation(this, R.anim.buttongone);
        welcomesubgone = AnimationUtils.loadAnimation(this, R.anim.welcomesubgone);

        // starts the animation immediately
        businessMan.startAnimation(atg);
        button.startAnimation(buttongone);
        welcomeText.startAnimation(welcomesubgone);
        welcomeSubText.startAnimation(welcomesubgone);






        // import font to use
        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/MLight.ttf");
        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MMedium.ttf");
        Typeface MRegular = Typeface.createFromAsset(getAssets(), "fonts/MRegular.ttf");

        // font onto each xml file

        button.setTypeface(MMedium);
        welcomeSubText.setTypeface(MLight);
        welcomeText.setTypeface(MMedium);


    }
}
