package com.example.bayareatours;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ParksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list_activity);

        //Create an array of all of the hiking trails that will appear on this view
        final ArrayList<Attraction> parksArray = new ArrayList<>();
        parksArray.add(new Attraction("Eagle Park", "234 Shoreline Ave.",
                R.drawable.number_two));
        parksArray.add(new Attraction("Bowers Park", "2894 Cabrillo Ave.",
                R.drawable.number_two));
        parksArray.add(new Attraction("Guadalupe River Park", "438 Coleman Ave.",
                R.drawable.number_two));
        parksArray.add(new Attraction("Mission City Memorial Park", "420 Winchester Blvd.",
                R.drawable.number_two));
        parksArray.add(new Attraction("Shoreline Park", "8934 Shoreline Ave.",
                R.drawable.number_two));
        parksArray.add(new Attraction("Stevenson Park", "750 San Pierre Rd.",
                R.drawable.number_two));

        //Using the AttractionAdapter to list the event lists
        AttractionAdapter adapter = new AttractionAdapter(this, parksArray, R.color.category_parks);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
