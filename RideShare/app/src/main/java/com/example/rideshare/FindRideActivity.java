package com.example.rideshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FindRideActivity extends AppCompatActivity {

    TextView mLoc;
    TextView mDest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_ride);
                mLoc=(TextView) findViewById(R.id.findRideButtonInFindRidePage);
                mDest=(TextView)findViewById(R.id.destinationAddressTextEdit);
    }

    public void SearchRide(View view) {
        String send=mDest.getText().toString()+mLoc.getText().toString();

        Intent segueToCreateRide = new Intent(this, SearchResultActivity.class);
        startActivity(segueToCreateRide);
    }
}
