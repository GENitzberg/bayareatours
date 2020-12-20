package com.example.bayareatours_fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EventsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_catalog);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, new EventsFragment())
                    .commit();
        }
}
