package com.example.booking_airline_tickets;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class signup extends AppCompatActivity {
    private Button registerButton;
    EditText email,password;
    private TextView SignInTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        registerButton = findViewById(R.id.signupbtn);
        SignInTextView = findViewById(R.id.accountbtn);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        SignInTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signup.this, login.class);
                startActivity(intent);

            }
        });
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(signup.this, MainActivity.class);
                startActivity(intent);
                checkValidation();

            }
        });
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