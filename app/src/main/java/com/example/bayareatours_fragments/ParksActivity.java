package com.example.bayareatours_fragments;

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

        setContentView(R.layout.activity_catalog);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new ParksFragment())
                .commit();
    }
}
