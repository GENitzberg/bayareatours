package com.example.bayareatours_fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksFragment extends Fragment {

    public ParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.attraction_list_activity, container, false);

        //Create an array of all of the hiking trails that will appear on this view
        //All icons taken from https://material.io/resources/icons/
        final ArrayList<Attraction> parksArray = new ArrayList<>();
        parksArray.add(new Attraction("Eagle Park", "234 Shoreline Ave.",
                R.drawable.baseline_nature_people_white_48dp));
        parksArray.add(new Attraction("Bowers Park", "2894 Cabrillo Ave.",
                R.drawable.baseline_local_florist_white_48dp));
        parksArray.add(new Attraction("Guadalupe River Park", "438 Coleman Ave.",
                R.drawable.baseline_nature_people_white_48dp));
        parksArray.add(new Attraction("Mission City Memorial Park", "420 Winchester Blvd.",
                R.drawable.baseline_filter_vintage_white_48dp));
        parksArray.add(new Attraction("Shoreline Park", "8934 Shoreline Ave.",
                R.drawable.baseline_flag_white_48dp));
        parksArray.add(new Attraction("Stevenson Park", "750 San Pierre Rd.",
                R.drawable.baseline_local_florist_white_48dp));

        //Using the AttractionAdapter to list the event lists
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), parksArray, R.color.category_parks);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}