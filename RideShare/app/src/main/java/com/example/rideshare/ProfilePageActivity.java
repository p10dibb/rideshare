package com.example.rideshare;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ProfilePageActivity extends AppCompatActivity {
    TextView mName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);
        mName=(TextView) findViewById(R.id.fullNameTextView);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("key");
            mName.setText(value);
            //The key argument here must match that used in the other activity
        }


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
        Intent segueToCreateRide = new Intent(this, CreateAccountActivity.class);
        startActivity(segueToCreateRide);
    }
}
