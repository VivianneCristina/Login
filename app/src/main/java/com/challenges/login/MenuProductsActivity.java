package com.challenges.login;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class MenuProductsActivity extends AppCompatActivity {

    private TextView text;
    private SharedPreferences preferences;

    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text = findViewById(R.id.text);

        preferences = getSharedPreferences("Login", Context.MODE_PRIVATE);
        preferences.getBoolean("logado", false);


        recyclerView = findViewById(R.id.rc_list2);

        setupRecycler();

    }

        private List<Market> getProducts(){
            List<Market> products = new ArrayList<>();
            products.add(new Market("Ovo", "$5", R.drawable.produto1));
            products.add(new Market("Morango", "$5", R.drawable.produto2));
            products.add(new Market("Kiwi", "$5", R.drawable.produto3));
            products.add(new Market("Uva", "$5", R.drawable.produto4));

        return products;
    }

    private void setupRecycler(){

        LinearLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        itemAdapter = new ItemAdapter(getBaseContext(), getProducts());
        recyclerView.setAdapter(itemAdapter);

        recyclerView.addItemDecoration(
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        }
    }



