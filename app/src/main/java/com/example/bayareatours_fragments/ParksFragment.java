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
        parksArray.add(new Attraction(getString(R.string.eagle),
                getString(R.string.eagle_address),
                R.drawable.baseline_nature_people_white_48dp));
        parksArray.add(new Attraction(getString(R.string.bowers),
                getString(R.string.bowers_address),
                R.drawable.baseline_local_florist_white_48dp));
        parksArray.add(new Attraction(getString(R.string.guad),
                getString(R.string.guad_address),
                R.drawable.baseline_nature_people_white_48dp));
        parksArray.add(new Attraction(getString(R.string.mission),
                getString(R.string.mission_address),
                R.drawable.baseline_filter_vintage_white_48dp));
        parksArray.add(new Attraction(getString(R.string.shore),
                getString(R.string.shore_address),
                R.drawable.baseline_flag_white_48dp));
        parksArray.add(new Attraction(getString(R.string.stevenson),
                getString(R.string.stevenson_address),
                R.drawable.baseline_local_florist_white_48dp));

        //Using the AttractionAdapter to list the event lists
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), parksArray, R.color.category_parks);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}