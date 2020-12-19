package com.example.bayareatours;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Attr;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attraction_list_activity);

        //Create an array of all of the events that will appear on this view
        final ArrayList<Attraction> eventsArray = new ArrayList<>();
        eventsArray.add(new Attraction("Arts and Wine Festival", "222 Castro St.",
                R.drawable.number_two));
        eventsArray.add(new Attraction("Comic-Con", "123 Main St.",
                R.drawable.number_two));
        eventsArray.add(new Attraction("Plane Show", "19 Plane St.",
                R.drawable.number_two));
        eventsArray.add(new Attraction("Car Show", "4643 Faster Rd.",
                R.drawable.number_two));
        eventsArray.add(new Attraction("Farmers Market", "100 Castro St.",
                R.drawable.number_two));
        eventsArray.add(new Attraction("Spare the Air!", "Entire Bay Area",
                R.drawable.number_two));


        //Using the AttractionAdapter to list the event lists
        AttractionAdapter adapter = new AttractionAdapter(this, eventsArray, R.color.category_events);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
