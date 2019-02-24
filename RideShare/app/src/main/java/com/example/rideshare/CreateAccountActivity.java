package com.example.rideshare;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class CreateAccountActivity extends AppCompatActivity {

    private Button createButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        createButton = (Button) findViewById(R.id.createAccountButton2);

        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                createButtonClicked();
            }
        });
    }

    public void createButtonClicked()
    {
        Intent segueToProfilePage = new Intent(this, ProfilePageActivity.class);
        startActivity(segueToProfilePage);
    }

}
