package com.example.pas_34_10rpl1;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class Holder extends RecyclerView.ViewHolder {

    ImageView mimageView;
    TextView mTitle, mDesc;

    public Holder(@NonNull View itemView) {
        super(itemView);

        this.mimageView = itemView.findViewById(R.id.Imagetv);
        this.mTitle = itemView.findViewById(R.id.txt_Title);
        this.mDesc = itemView.findViewById(R.id.txt_Description);

    }
}
