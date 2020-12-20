package com.example.bayareatours_fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HikingFragment extends Fragment {

    public HikingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.attraction_list_activity, container, false);

        //Create an array of all of the hiking trails that will appear on this view
        //All icons taken from https://material.io/resources/icons/
        final ArrayList<Attraction> hikesArray = new ArrayList<>();
        hikesArray.add(new Attraction(getString(R.string.villa),
                getString(R.string.villa_address),
                R.drawable.baseline_nature_people_white_48dp));
        hikesArray.add(new Attraction(getString(R.string.las),
                getString(R.string.las_address),
                R.drawable.baseline_local_florist_white_48dp));
        hikesArray.add(new Attraction(getString(R.string.rancho),
                getString(R.string.rancho_address),
                R.drawable.baseline_nature_people_white_48dp));
        hikesArray.add(new Attraction(getString(R.string.dish),
                getString(R.string.dish_address),
                R.drawable.baseline_filter_vintage_white_48dp));
        hikesArray.add(new Attraction(getString(R.string.bay),
                getString(R.string.bay_address),
                R.drawable.baseline_nature_people_white_48dp));
        hikesArray.add(new Attraction(getString(R.string.perm),
                getString(R.string.perm_address),
                R.drawable.baseline_sentiment_satisfied_alt_white_48dp));

        //Using the AttractionAdapter to list the event lists
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), hikesArray, R.color.category_hiking);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;

    }
}