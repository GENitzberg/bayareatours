package com.example.bayareatours;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HikingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list_activity);

        //Create an array of all of the hiking trails that will appear on this view
        //All icons taken from https://material.io/resources/icons/
        final ArrayList<Attraction> hikesArray = new ArrayList<>();
        hikesArray.add(new Attraction("Hidden Villa", "26870 Moody Rd.",
                R.drawable.baseline_nature_people_white_48dp));
        hikesArray.add(new Attraction("Las Trampas", "123 Bollinger Canyon Rd.",
                R.drawable.baseline_local_florist_white_48dp));
        hikesArray.add(new Attraction("Rancho San Antonio", "23500 Cristo Rey Dr.",
                R.drawable.baseline_nature_people_white_48dp));
        hikesArray.add(new Attraction("The Dish", "1100 Stanford Ave.",
                R.drawable.baseline_directions_run_white_48dp));
        hikesArray.add(new Attraction("Bay Trail", "293 Caribbean Dr.",
                R.drawable.baseline_directions_bike_white_48dp));
        hikesArray.add(new Attraction("Permanente Creek Trail ", "1019 Sierra Dr.",
                R.drawable.baseline_filter_vintage_white_48dp));

        //Using the AttractionAdapter to list the event lists
        AttractionAdapter adapter = new AttractionAdapter(this, hikesArray, R.color.category_hiking);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
