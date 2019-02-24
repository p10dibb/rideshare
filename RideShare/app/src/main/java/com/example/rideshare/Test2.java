package com.example.rideshare;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Test2 extends AppCompatActivity {

    TextView mDowntxt;
    TextView mUpTxt;
    TextView mKeyset;
    TextView mKeyget;
    Button mAddButton,mRemoveButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        mDowntxt=(TextView) findViewById(R.id.downtxt) ;
        mAddButton=(Button) findViewById(R.id.upBut);
         mRemoveButton =(Button) findViewById(R.id.downbut);
         mKeyset=(TextView) findViewById(R.id.Keyset);
         mKeyget= (TextView) findViewById(R.id.keyget);

        mUpTxt=(TextView) findViewById(R.id.uptxt);
        final FirebaseDatabase database =FirebaseDatabase.getInstance();
        final DatabaseReference mRef =database.getReference("FirstWord");

        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database =FirebaseDatabase.getInstance();
                 DatabaseReference mRefl ;
                String tempkey=mKeyset.getText().toString();
                mRefl =database.getReference(tempkey);
                String child=mUpTxt.getText().toString();
                mRefl.setValue(child);
            }
        });
        mRemoveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database =FirebaseDatabase.getInstance();
                DatabaseReference mRefd ;
                String tempkey=mKeyget.getText().toString();
                mRefd =database.getReference(tempkey);
                mRefd.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String childvalue =String.valueOf(dataSnapshot.getValue());
                        mDowntxt .setText(childvalue);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });



    }




}
