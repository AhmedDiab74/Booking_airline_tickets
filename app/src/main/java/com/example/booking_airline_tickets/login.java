package com.example.booking_airline_tickets;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {
    EditText email,password;
    Button btnlogin;
    ProgressBar bar;
   // FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //auth = FirebaseAuth.getInstance();

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        btnlogin = (Button) findViewById(R.id.loginbtn);
        bar = findViewById(R.id.bar);

        btnlogin.setOnClickListener(new View.OnClickListener() {

                                        @Override
                                        public void onClick(View view) {
                                            bar.setVisibility(View.VISIBLE);

                                            String emailvalue = email.getText().toString();
                                            String passvalue = password.getText().toString();

                                            checkValidation();


                                        }
                                    }
        );
    }
    public void checkValidation(){
        if(checkEmpty(email)){
            email.setError("Empty email");
        }
        if(checkEmpty(password)){
            password.setError("Empty password");
        }
    }

    boolean checkEmpty(EditText text){
        CharSequence str=text.getText().toString();
        return TextUtils.isEmpty(str);
    }}
