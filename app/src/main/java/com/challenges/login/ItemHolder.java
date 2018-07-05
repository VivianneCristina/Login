package com.challenges.login;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemHolder extends RecyclerView.ViewHolder {

    public ImageView imageProfile;
    public TextView textName;
    public Button ic_icon;

    public ItemHolder(View itemView) {
        super(itemView);
                imageProfile = itemView.findViewById(R.id.profile_image);
                textName = itemView.findViewById(R.id.tv_name);
                textName = itemView.findViewById(R.id.tv_price);
                ic_icon = itemView.findViewById(R.id.ic_delete);

    }

}
