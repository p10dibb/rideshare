package com.example.rideshare;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.Button;
import android.os.Bundle;

public class SignInActivity extends AppCompatActivity {

    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        loginButton = (Button) findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                loginButtonClicked();
            }
        });
    }

    public void loginButtonClicked()
    {
        Intent segueToProfilePage = new Intent(this, ProfilePageActivity.class);
        startActivity(segueToProfilePage);
    }
}
