package com.example.rideshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SearchResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
    }

    public void SelectThisRideButtonClicked(View view) {
        Intent segueToSelectRide = new Intent(this, SelectRideActivity.class);
        startActivity(segueToSelectRide);
    }
}
