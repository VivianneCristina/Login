package com.challenges.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListCartActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ItemAdapter ItemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_cart);

        recyclerView = findViewById(R.id.rc_list);

        setupRecycler();

    }
    public List<Market> getProducts(){
        List<Market> products = new ArrayList<>();
        products.add(new Market("Ovo", "$5", R.drawable.produto1));
        products.add(new Market("Morango", "$5", R.drawable.produto2));
        products.add(new Market("Kiwi", "$5", R.drawable.produto3));
        products.add(new Market("Uva", "$5", R.drawable.produto4));

        return products;
    }

    private void setupRecycler(){

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ItemAdapter = new ItemAdapter(getBaseContext(), getProducts());
        recyclerView.setAdapter(ItemAdapter);

        recyclerView.addItemDecoration(
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

}
