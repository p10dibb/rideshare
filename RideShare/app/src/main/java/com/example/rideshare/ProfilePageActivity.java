package com.example.rideshare;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.Button;

public class ProfilePageActivity extends AppCompatActivity {
    private Button findRideButton;
    private Button createRideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        //createRideButton = (Button) findViewById(R.id.createRideButton);
        findRideButton = (Button) findViewById(R.id.findRideButton);
        createRideButton = (Button) findViewById(R.id.createRideButton);

        findRideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findRideButtonClicked();
            }
        });

        createRideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createRideButtonClicked();
            }
        });
    }

    //segues to Find Ride page
    public void findRideButtonClicked() {
        Intent segueToFindRide = new Intent(this, FindRideActivity.class);
        startActivity(segueToFindRide);
    }

    //segues to Create Ride Page
    public void createRideButtonClicked() {
        Intent segueToCreateRide = new Intent(this, CreateRideActivity.class);
        startActivity(segueToCreateRide);
    }
}
