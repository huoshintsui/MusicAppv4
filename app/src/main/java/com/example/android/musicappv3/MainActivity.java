package com.example.android.musicappv3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the ordinary album
        TextView ordinaryView = (TextView) findViewById(R.id.ordinary);

        // Set a click listener on that View
        ordinaryView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the ordinaryView is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link OtActivity}
                Intent ordinaryIntent = new Intent(MainActivity.this, OrdinaryActivity.class);

                // Start the new activity
                startActivity(ordinaryIntent);
            }
        });


        // Find the View that shows the how lovely album
        TextView howlovelyView = (TextView) findViewById(R.id.howlovely);

        // Set a click listener on that View
        howlovelyView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the howlovelyView is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link OtActivity}
                Intent howlovelyIntent = new Intent(MainActivity.this, HowLovelyActivity.class);

                // Start the new activity
                startActivity(howlovelyIntent);
            }
        });

    }

}
