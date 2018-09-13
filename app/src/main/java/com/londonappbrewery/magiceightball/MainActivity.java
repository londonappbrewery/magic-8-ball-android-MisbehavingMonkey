package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // link imageview from .xml to java code
        final ImageView ballDisplay = findViewById(R.id.image_eightBall);

        // link button from.xml to java code
        Button askButton = findViewById(R.id.askButton);

        // create array to hold ball images
        final int[] ballArray = new int[]{
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,         };


        // set button listener for click which then generates random number
        // then limits to upper level of array
        // pulls image for array value based on random number and updates imageview
        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(5);
                ballDisplay.setImageResource(ballArray[number]);
            }
        });



    }

}

