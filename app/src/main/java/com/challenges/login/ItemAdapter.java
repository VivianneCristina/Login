package com.challenges.login;

import android.content.ClipData;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemHolder> {

    private List<Market> products;
    private Context context;

    public ItemAdapter(List<Market> products) {
        this.products = products;
    }

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ItemHolder(LayoutInflater.from(parent.getContext())
        .inflate(R.layout.layout_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {

        Market product = products.get(position);

        holder.textName.setText(product.getNome());

        holder.textName.setText(product.getValor());
        holder.imageProfile.setImageResource(product.getImage());
        holder.ic_icon.setOnClickListener(new View.OnClickListener() {

    });

}

    @Override
    public int getItemCount() {
        return products != null ? products.size() : 0;
    }

}

