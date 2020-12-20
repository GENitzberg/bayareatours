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
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), hikesArray, R.color.category_hiking);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);


        return rootView;

    }
}