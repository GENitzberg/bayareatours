package com.example.bayareatours;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import org.w3c.dom.Attr;

import java.util.ArrayList;
import java.util.List;


public class AttractionAdapter extends ArrayAdapter<Attraction> {

    int mBackgroundColor;
    private static final String LOG_TAG = AttractionAdapter.class.getSimpleName();
    public AttractionAdapter(Activity context, ArrayList<Attraction> attractions, int backgroundColor) {
        super(context, 0, attractions);
        mBackgroundColor = backgroundColor;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check if existing view is being reused, otherwise inflate the value
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.attraction_list,
                    parent, false);
        }
        //Get the Attraction object located at this position in the list
        Attraction currentAttraction = getItem(position);
        //Find the right TextView
        TextView attractionTextView = (TextView) listItemView.findViewById(R.id.attraction_name_text_view);
        //Set the text in the view
        attractionTextView.setText(currentAttraction.getAttraction());
        //Find the right TextView
        TextView addressTextView = (TextView) listItemView.findViewById(R.id.attraction_address_text_view);
        //Set the text in the view
        addressTextView.setText(currentAttraction.getAttractionAddress());
        //Find the right ImageView
        ImageView attractionImageView = (ImageView) listItemView.findViewById(R.id.attraction_image_view);
        //Check whether the word has an image
        if(currentAttraction.hasImage()) {
            //Set the image in the view
            attractionImageView.setImageResource(currentAttraction.getAttractionImage());
            attractionImageView.setVisibility(View.VISIBLE);
        }
        else
            attractionImageView.setVisibility(View.GONE);
        //Set the background color according to attraction category selected
        View textContainer = listItemView.findViewById(R.id.textLayout);
        int color = ContextCompat.getColor(getContext(), mBackgroundColor);
        textContainer.setBackgroundColor(color);
        //Return the whole list item layout
        return listItemView;
    }

}
