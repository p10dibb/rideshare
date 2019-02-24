package com.example.rideshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FindRideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_ride);
    }

    public void SearchRide(View view) {
        Intent segueToCreateRide = new Intent(this, SearchResultActivity.class);
        startActivity(segueToCreateRide);
    }
}
