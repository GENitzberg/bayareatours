package com.example.bayareatours_fragments;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class EventsFragment extends Fragment {

    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list_activity, container, false);

        //Create an array of all of the events that will appear on this view
        //All icons taken from https://material.io/resources/icons/
        //Number_two icon from the Miwok App example is used for Farmers Market icon
        final ArrayList<Attraction> eventsArray = new ArrayList<>();
        eventsArray.add(new Attraction("Arts and Wine Festival", "222 Castro St.",
                R.drawable.baseline_wine_bar_white_48dp));
        eventsArray.add(new Attraction("Comic-Con", "123 Main St.",
                R.drawable.baseline_sentiment_satisfied_alt_white_48dp));
        eventsArray.add(new Attraction("Plane Show", "19 Plane St.",
                R.drawable.baseline_flight_takeoff_white_48dp));
        eventsArray.add(new Attraction("Car Show", "4643 Faster Rd.",
                R.drawable.baseline_directions_car_white_48dp));
        eventsArray.add(new Attraction("Farmers Market", "100 Castro St.",
                R.drawable.number_two));
        eventsArray.add(new Attraction("Spare the Air!", "Entire Bay Area",
                R.drawable.baseline_nature_people_white_48dp));

        //Using the AttractionAdapter to list the event lists
        AttractionAdapter adapter = new AttractionAdapter((AppCompatActivity) getActivity(), eventsArray, R.color.category_events);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}