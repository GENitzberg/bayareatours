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
        final ArrayList<Attraction> hikesArray = new ArrayList<>();
        hikesArray.add(new Attraction("Hidden Villa", "26870 Moody Rd.",
                R.drawable.number_two));
        hikesArray.add(new Attraction("Las Trampas", "123 Bollinger Canyon Rd.",
                R.drawable.number_two));
        hikesArray.add(new Attraction("Rancho San Antonio", "23500 Cristo Rey Dr.",
                R.drawable.number_two));
        hikesArray.add(new Attraction("The Dish", "1100 Stanford Ave.",
                R.drawable.number_two));
        hikesArray.add(new Attraction("Bay Trail", "293 Caribbean Dr.",
                R.drawable.number_two));
        hikesArray.add(new Attraction("Permanente Creek Trail ", "1019 Sierra Dr.",
                R.drawable.number_two));

        //Using the AttractionAdapter to list the event lists
        AttractionAdapter adapter = new AttractionAdapter(this, hikesArray, R.color.category_hiking);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
