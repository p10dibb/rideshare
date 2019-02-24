package com.example.rideshare;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SignInActivity extends AppCompatActivity {

    private Button loginButton;
    TextView mNameLog;
    TextView mPasswordLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        loginButton = (Button) findViewById(R.id.loginButton);
        mNameLog=(TextView) findViewById(R.id.signInName);
        mPasswordLog=(TextView) findViewById(R.id.signInPasswordText);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                FirebaseDatabase database =FirebaseDatabase.getInstance();
                DatabaseReference mRefd ;
                String tempkey=mNameLog.getText().toString();
                mRefd =database.getReference(tempkey);
                mRefd.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String Password =String.valueOf(dataSnapshot.getValue());

                        if(Password.equals("null")){
                            mNameLog .setText("you are not Registered");
                        }
                        else if(mPasswordLog.getText().toString().equals(Password)){
                            loginButtonClicked();
                        }
                        else{
                            mNameLog.setText("incorrect Password");
                        }

                      //  mPasswordLog .setText(childvalue);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });








                //loginButtonClicked();
            }
        });
    }

    public void loginButtonClicked()
    {
        Intent segueToProfilePage = new Intent(this, ProfilePageActivity.class);
        startActivity(segueToProfilePage);
    }

    public void Skip(View view) {
        Intent segueToProfilePage = new Intent(this, ProfilePageActivity.class);
        startActivity(segueToProfilePage);
    }
}
