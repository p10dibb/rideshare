package com.example.rideshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SearchResultActivity extends AppCompatActivity {
    Trips database[];
    String mLoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String mLoc = extras.getString("key");
            //mName.setText(value);
        }

        database=new Trips[12];
        Trips temp=new Trips();

        temp.setCost(20);
        temp.setDestination("Seattle");
        temp.setStart("Pullman");
        temp.setDriverName("Joe Biffle");
        temp.setDriverReview("He is a lovley Guy with with a smooth drive style");
        database[0]=temp;


        temp.setCost(80);
        temp.setDestination("Seattle");
        temp.setStart("Spokane");
        temp.setDriverName("Ronald Grubble");
        temp.setDriverReview("We nearly died everyturn of the drive I would rate a 0/10");
        database[1]=temp;

        temp.setCost(10);
        temp.setDestination("Colfax");
        temp.setStart("Pullman");
        temp.setDriverName("Jessie Wilson");
        temp.setDriverReview("Slow driver but safe");
        database[2]=temp;

        temp.setCost(20);
        temp.setDestination("Pullman");
        temp.setStart("Spokane");
        temp.setDriverName("Trish Melnick");
        temp.setDriverReview("Meh");
        database[3]=temp;

        temp.setCost(30);
        temp.setDestination("Spokane");
        temp.setStart("Pullman");
        temp.setDriverName("Sammy McSamson");
        temp.setDriverReview("Friendly Lad");
        database[4]=temp;




    }


    private void Search(){
        for (int i=0; i<5;i++){
            if(mLoc.equals(database[i].getDestination()+database[i].getStart())){

                //setStuff

            }
        }
    }

    public void SelectThisRideButtonClicked(View view) {
        Intent segueToSelectRide = new Intent(this, SelectRideActivity.class);
        startActivity(segueToSelectRide);
    }
}
