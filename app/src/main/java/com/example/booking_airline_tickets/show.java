package com.example.booking_airline_tickets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class show extends AppCompatActivity {
EditText num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        num=(EditText) findViewById(R.id.inputNum);
       String numofBooking= num.getText().toString();
        findViewById(R.id.send).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(show.this ,tableOfBooks.class);
                i.putExtra("numOfBooking",numofBooking);

                startActivity(i);
            }
        });
    }
}