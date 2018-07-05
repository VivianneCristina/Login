package com.challenges.login;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AlertController;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MenuProductsActivity extends AppCompatActivity {

    private TextView text;
    private RecyclerView recyclerView;
    private SharedPreferences preferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text = findViewById(R.id.text);

        preferences = getSharedPreferences("Login", Context.MODE_PRIVATE);
        preferences.getBoolean("logado", false);


        recyclerView = findViewById(R.id.rc_list2);

        List<Market> products = getProducts();

        List<Market> products = new ArrayList<>();
        products.add(new Market("Ovo", "$5", R.drawable.produto1));
        products.add(new Market("Morango", "$5", R.drawable.produto2));
        products.add(new Market("Kiwi", "$5", R.drawable.produto3));
        products.add(new Market("Uva", "$5", R.drawable.produto4));

        return products;
    }

    private void setupRecyclerView(){

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ItemAdapter = new ItemAdapter(getProducts());
        recyclerView.setAdapter(ItemAdapter);

        recyclerView.addItemDecoration(
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

}



