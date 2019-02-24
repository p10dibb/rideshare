package com.example.rideshare;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class SearchResultActivity extends AppCompatActivity {
    Trips batabase[];
    String mLoc;
    List<Trips> li;
    Trips temp1 = new Trips();
    Trips temp2 = new Trips();
    Trips temp4 = new Trips();
    Trips temp3 = new Trips();
    Trips temp5 = new Trips();

    TextView mDriverName;
    TextView mDriverDesc;
    TextView mCost;
    TextView mStart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);

        mDriverName = (TextView) findViewById(R.id.driverNameTextView);
        mDriverDesc = (TextView) findViewById(R.id.DestinationAddressTextViewInResult);
        mCost = (TextView) findViewById(R.id.costTextView);
        mStart = (TextView) findViewById(R.id.StartingAddressTextViewInResult);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            mLoc = extras.getString("key");
            //mName.setText(value);
        }

        batabase = new Trips[12];
        Trips temp = new Trips();
/*
        temp.setCost(20);
        temp.setDestination("Seattle");
        temp.setStart("Pullman");
        temp.setDriverName("Joe Biffle");
        temp.setDriverReview("He is a lovley Guy with with a smooth drive style");
        li.add(temp);


        temp1.setCost(80);
        temp1.setDestination("Seattle");
        temp1.setStart("Spokane");
        temp1.setDriverName("Ronald Grubble");
        temp1.setDriverReview("We nearly died everyturn of the drive I would rate a 0/10");
        li.add(temp1);


        temp2.setCost(10);
        temp2.setDestination("Colfax");
        temp2.setStart("Pullman");
        temp2.setDriverName("Jessie Wilson");
        temp2.setDriverReview("Slow driver but safe");
        li.add(temp1);

*/
        temp3.setCost(20);
        temp3.setDestination("Pullman");
        temp3.setStart("Seattle");
        temp3.setDriverName("Trish Melnick");
        temp3.setDriverReview("Meh");
       // li.add(temp1);


        temp4.setCost(30);
        temp4.setDestination("Spokane");
        temp4.setStart("Pullman");
        temp4.setDriverName("Sammy McSamson");
        temp4.setDriverReview("Friendly Lad");
     //   li.add(temp1);


        temp5.setCost(30);
        temp5.setDestination("Pullman");
        temp5.setStart("Spokane");
        temp5.setDriverName("Diwash Biswa");
        temp5.setDriverReview("No Car just had to Walk");


        Search();

    }


    public void Search() {

        if (mLoc.equals("SpokanePullman")) {
            //setStuff
            String g = temp4.getStart();

            mStart.setText(g);
            g = "$" + temp4.getCost();
            mCost.setText(g);
            g = temp4.getDriverName();
            mDriverName.setText(g);
            g = temp4.getDriverReview();
            mDriverDesc.setText(g);

        } else if (mLoc.equals("PullmanSpokane")) ;
        //setStuff
        String g = temp5.getStart();

        mStart.setText(g);
        g = "$" + temp5.getCost();
        mCost.setText(g);
        g = temp5.getDriverName();
        mDriverName.setText(g);
        g = temp5.getDriverReview();
        mDriverDesc.setText(g);
    }

    public void SelectThisRideButtonClicked(View view) {
        Intent segueToSelectRide = new Intent(this, SelectRideActivity.class);
        startActivity(segueToSelectRide);
    }
}
