package com.challenges.login;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.util.Config;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText user, senha;
    private Button salvar;

    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = findViewById(R.id.editUser);
        senha = findViewById(R.id.editSenha);
        salvar = findViewById(R.id.saveBtn);

        init();

        salvar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editor.putString("", user.getText().toString()).commit();
            }
        });

        salvar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                editor.putString("", senha.getText().toString()).commit();
            }
        });

    }
    private void init () {
       preferences = getSharedPreferences("Login", Context.MODE_PRIVATE);
       editor = preferences.edit();
    }
}
