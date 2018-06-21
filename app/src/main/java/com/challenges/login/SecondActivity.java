package com.challenges.login;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView text;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text = findViewById(R.id.text);
        preferences = findViewById(R.id.);

        preferences = getSharedPreferences("Login", Context.MODE_PRIVATE););

    }
}
