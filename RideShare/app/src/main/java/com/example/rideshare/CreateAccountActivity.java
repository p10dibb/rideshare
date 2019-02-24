package com.example.rideshare;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class CreateAccountActivity extends AppCompatActivity {

    TextView mFirstName;
    TextView mLastName;
    TextView mEmail;
    TextView mPassword;
    TextView mCPassword;
    BST mTree;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
        mFirstName= (TextView) findViewById(R.id.firstNameText);
        mLastName= (TextView) findViewById(R.id.lastNameText);
        mEmail =(TextView) findViewById(R.id.emailAddressText);
        mPassword=(TextView) findViewById(R.id.passwordText);
        mCPassword=(TextView) findViewById(R.id.reEnterPasswordText);
       mTree =new BST();
    }

    public void RunRegister(View view) {
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
             mTree.add(temp);
             output="Registration succesful";
         }
        Toast toast =Toast.makeText(this,output,Toast.LENGTH_LONG);
            toast.show();
    }
}
