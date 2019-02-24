package com.example.rideshare;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button = (Button) findViewById(R.id.createAccountButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                createAccountButtonClicked();
            }
        });
    }

    public void createAccountButtonClicked()
    {
        Intent segueToCreateAccount = new Intent(this, CreateAccountActivity.class);
        startActivity(segueToCreateAccount);
    }

    public void Tester(View view) {
        Intent goToCreateAccount = new Intent(this, Test2.class);
        startActivity(goToCreateAccount);
    }
}
