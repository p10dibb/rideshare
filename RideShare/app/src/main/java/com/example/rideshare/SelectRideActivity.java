package com.example.rideshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelectRideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_ride);
    }

    public void TakeMeBackToMyProfilePageButtonClicked(View view) {
        Intent segueToProfile = new Intent(this, ProfilePageActivity.class);
        startActivity(segueToProfile);
    }
}
