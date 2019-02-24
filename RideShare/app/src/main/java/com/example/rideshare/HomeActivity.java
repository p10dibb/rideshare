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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

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
