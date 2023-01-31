package com.example.talkepoch;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //to hide the action bar present at the top
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}