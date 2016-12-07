package com.revision.mahe.experiment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;


public class Homescreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
        Toast.makeText(getApplicationContext(), "Hello there !!", Toast.LENGTH_SHORT).show();


    }

}
