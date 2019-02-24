package com.example.rideshare;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.Button;

public class ProfilePageActivity extends AppCompatActivity {
    private Button createRideButton, findRideButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        createRideButton = (Button) findViewById(R.id.createRideButton);
        findRideButton = (Button) findViewById(R.id.findRideButton);

        createRideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createRideButtonClicked();
            }
        });

        findRideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createRideButtonClicked();
            }
        });
    }

    //segues to Create Ride Page
    public void createRideButtonClicked() {
        Intent segueToCreateRide = new Intent(this, CreateRideActivity.class);
        startActivity(segueToCreateRide);
    }

    public void findRideButtonClicked() {
        Intent segueToFindRide = new Intent (this, FindRideActivity.class);
        startActivity(segueToFindRide);
    }
}
