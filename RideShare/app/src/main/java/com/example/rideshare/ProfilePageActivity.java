package com.example.rideshare;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.Button;

public class ProfilePageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);



    }

    //segues to Create Ride Page
    public void createRideButtonClicked() {

    }

    public void findRideButtonClicked() {

    }

    public void GotofindRide(View view) {
        Intent segueToFindRide;
        segueToFindRide = new Intent (this, FindRideActivity.class);
        startActivity(segueToFindRide);
    }

    public void goToCreateRide(View view) {
        Intent segueToCreateRide = new Intent(this, CreateRideActivity.class);
        startActivity(segueToCreateRide);
    }
}
