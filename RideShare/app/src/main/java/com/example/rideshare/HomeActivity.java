package com.example.rideshare;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button createAccountButton, signInButton;

    private Button testMapsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        testMapsButton = (Button) findViewById(R.id.testGoogleMapsButton);

        testMapsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                testMapsButtonClicked();
            }
        });

        createAccountButton = (Button) findViewById(R.id.createAccountButton);
        signInButton = (Button) findViewById(R.id.signInButton);

        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                createAccountButtonClicked();
            }
        });

        signInButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                signInButtonClicked();
            }
        });

    }

    public void testMapsButtonClicked()
    {
        Intent segueToMaps = new Intent (this, GoogleMapsActivity.class);
        startActivity(segueToMaps);
    }

    public void createAccountButtonClicked()
    {
        Intent segueToCreateAccount = new Intent(this, CreateAccountActivity.class);
        startActivity(segueToCreateAccount);
    }

    public void signInButtonClicked() {
        Intent segueToSignInPage = new Intent(this, SignInActivity.class);
        startActivity(segueToSignInPage);
    }
}
