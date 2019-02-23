package com.example.rideshare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    BST mTree;
    TextView mPassword;
    TextView mCPassword;
    TextView mFirstName;
    TextView mLastName;
    TextView mEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTree=new BST();
    }

    public void RunRegister(View view) {


    }
}
