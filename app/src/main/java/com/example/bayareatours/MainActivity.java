package com.example.bayareatours;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set onClick listeners for all four categories
        TextView numbers = (TextView) findViewById(R.id.events);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, EventsActivity.class);
                startActivity(i);
            }
        });

        TextView family = (TextView) findViewById(R.id.hikes);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, HikingActivity.class);
                startActivity(i);
            }
        });

        TextView phrases = (TextView) findViewById(R.id.parks);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ParksActivity.class);
                startActivity(i);
            }
        });

        TextView colors = (TextView) findViewById(R.id.restaurants);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, RestaurantActivity.class);
                startActivity(i);
            }
        });
    }
}