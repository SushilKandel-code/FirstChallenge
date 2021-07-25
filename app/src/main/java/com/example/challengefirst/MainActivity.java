package com.example.challengefirst;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

public class MainActivity extends AppCompatActivity {

    TextInputEditText firstname, lastname, email;
    MaterialButton register;
    MaterialTextView nameTextView, lastnameTextView, emailTextView;
    TextInputLayout fnameLayout, lnameLayout, emailLayout;
    MaterialToolbar toolbar;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //---------------Toolbar----------------



        //----------TextInputEditText--------------------
        firstname = findViewById(R.id.textInputEditText1);
        lastname = findViewById(R.id.lastname);
        email = findViewById(R.id.email);

        //------------Button--------------------
        register = findViewById(R.id.register);

        //-------------MaterialTextView----------------
        nameTextView = findViewById(R.id.TextViewFirstName);
        lastnameTextView = findViewById(R.id.TextViewLastName);
        emailTextView = findViewById(R.id.TextViewEmail);

        //-------------TextInputLayout-----------------------
        fnameLayout = findViewById(R.id.fnamelayout);
        lnameLayout = findViewById(R.id.lnamelayout);
        emailLayout = findViewById(R.id.emailLayout);

        //-----------Button Onclick Function------------------

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname = firstname.getText().toString();
                String lname = lastname.getText().toString();
                String emailText = email.getText().toString();

                if(fname.isEmpty()){
                    fnameLayout.setError("First Name Required");
                } else if(lname.isEmpty()) {
                 lnameLayout.setError("Last Name Required");
                } else if(emailText.isEmpty()){
                    emailLayout.setError("Email Required");
                }
                else{
                    nameTextView.setText("First Name:" + fname);
                    lastnameTextView.setText("Last Name:" + lname);
                    emailTextView.setText("Email:" + emailText);
                    firstname.setText("");
                    lastname.setText("");
                    email.setText("");
                }
                if(!fname.isEmpty()) {
                    fnameLayout.setError("");
                }
                if(!lname.isEmpty()){
                    lnameLayout.setError("");
                }
                if(!emailText.isEmpty()){
                    emailLayout.setError("");
                }
            }
        });

    }



}