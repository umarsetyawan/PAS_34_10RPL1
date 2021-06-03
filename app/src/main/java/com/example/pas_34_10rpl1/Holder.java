package com.example.pas_34_10rpl1;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class Holder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView mTitle, mDesc;

    public Holder(@NonNull View itemView) {
        super(itemView);

        this.imageView.findViewById(R.id.Image);
        this.mTitle.findViewById(R.id.Title);
        this.mDesc.findViewById(R.id.Description);

    }
}
