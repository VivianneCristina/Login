package com.challenges.login;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView text;
    private Button logout;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text = findViewById(R.id.text);
        logout = findViewById(R.id.logoutBtn);

        preferences = getSharedPreferences("Login", Context.MODE_PRIVATE);

    }
    @Override
    public void onClick(View v) {
        SharedPreferences preferences = .getSharedPreferences("Sair", Context.MODE_PRIVATE);
        SharedPreferences.Editor saveEdit = save.edit();
        SharedPreferences.Editor clear = saveEdit.clear();
        saveEdit.apply();

    }

}
