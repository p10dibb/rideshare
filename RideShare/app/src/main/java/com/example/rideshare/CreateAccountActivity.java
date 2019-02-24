package com.example.rideshare;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;





import org.w3c.dom.Text;

public class CreateAccountActivity extends AppCompatActivity {

    TextView mFirstName;
    TextView mLastName;
    TextView mEmail;
    TextView mPassword;
    TextView mCPassword;
    Button mAddButton;

    TextView mDowntxt;
    TextView mUpTxt;
    TextView mKeyset;
    TextView mKeyget;
  //  BST mTree;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        mFirstName= (TextView) findViewById(R.id.firstNameText);
        mLastName= (TextView) findViewById(R.id.lastNameText);
        mEmail =(TextView) findViewById(R.id.emailAddressText);
        mPassword=(TextView) findViewById(R.id.passwordText);
        mCPassword=(TextView) findViewById(R.id.reEnterPasswordText);




        mKeyset=(TextView) findViewById(R.id.firstNameText);
        mUpTxt=(TextView) findViewById(R.id.passwordText);

        mAddButton=(Button) findViewById(R.id.create);



        final FirebaseDatabase database =FirebaseDatabase.getInstance();
        final DatabaseReference mRef =database.getReference("FirstWord");

        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase database =FirebaseDatabase.getInstance();
                DatabaseReference mRefl ;
                User temp=new User();

                int fail=0;
                String output="";

                if (mFirstName.getText().toString().equals("")){
                    output=output+" First Name is empty";
                    fail++;
                }
                else{
                    temp.SetFirstName(mFirstName.getText().toString());
                }
                if(mLastName.getText().toString().equals("")) {
                    output=output+ " LastName is empty";
                    fail++;
                }
                else{
                    temp.SetLastName(mLastName.getText().toString());
                }

                if(!temp.SetEmail(mEmail.getText().toString())){

                    output=output+" Email not valid";
                    fail++;
                }

                if(mPassword.getText().toString().equals(mCPassword.getText().toString())){

                    if (!temp.SetPassword(mPassword.getText().toString())){
                        output=output+" invalid Password";
                        fail++;
                    }
                }
                else{
                    output=output+ " Passwords don't match";
                    fail++;
                }

                if(fail==0){
                    // mTree.add(temp);
                    String key = temp.GetEmail();
                    String Value = temp.GetPassword();


                    String tempkey=temp.GetFirstName()+" "+temp.GetLastName();

                    String child=temp.GetPassword();
                    mRefl =database.getReference(tempkey);
                    mRefl.setValue(child);

                 // mRefl  =database.getReference(key);
                 //   mRefl.setValue(Value);


                    output="Registration succesful";

                }
                mFirstName.setText(output);


            }
        });

    }
    public void RunRegister(View view) {

    }

}

