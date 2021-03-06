package com.challenges.login;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        init();

        if (preferences.getBoolean("logado", false)) {
            initActivity2();

        } else {
            user = findViewById(R.id.editUser);
            senha = findViewById(R.id.editSenha);
            salvar = findViewById(R.id.saveBtn);

            salvar.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    editor.putString("User", user.getText().toString()).commit();
                    editor.putString("Senha", senha.getText().toString()).commit();
                    editor.putBoolean("logado", true).commit();
                    Toast.makeText(LoginActivity.this, "Usuário foi criado", Toast.LENGTH_SHORT).show();
                    initActivity2();
                }
            });
        }
    }
    private void init () {
       preferences = getSharedPreferences("Login", Context.MODE_PRIVATE);
       editor = preferences.edit();
       editor.apply();
    }

    private void initActivity2 () {
        Intent intentLogin = new Intent (LoginActivity.this, MenuProductsActivity.class);
        startActivity(intentLogin);

    }
}
