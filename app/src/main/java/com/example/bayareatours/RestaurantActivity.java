package com.example.bayareatours;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list_activity);

        //Create an array of all of the hiking trails that will appear on this view
        //All icons taken from https://material.io/resources/icons/
        final ArrayList<Attraction> restaurantsArray = new ArrayList<>();
        restaurantsArray.add(new Attraction("Teaspoon", "134-A Castro St.",
                R.drawable.baseline_wine_bar_white_48dp));
        restaurantsArray.add(new Attraction("Oren's Hummus", "126 Castro St.",
                R.drawable.baseline_restaurant_white_48dp));
        restaurantsArray.add(new Attraction("Opa!", "110 Lincoln Ave.",
                R.drawable.baseline_flag_white_48dp));
        restaurantsArray.add(new Attraction("Crepevine", "367 University Ave.",
                R.drawable.baseline_restaurant_white_48dp));
        restaurantsArray.add(new Attraction("Cafe 220", "220 University Ave.",
                R.drawable.baseline_sentiment_satisfied_alt_white_48dp));
        restaurantsArray.add(new Attraction("Italian Deli", "9873 Main St.",
                R.drawable.baseline_restaurant_white_48dp));

        //Using the AttractionAdapter to list the event lists
        AttractionAdapter adapter = new AttractionAdapter(this, restaurantsArray,
                R.color.category_restaurants);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
