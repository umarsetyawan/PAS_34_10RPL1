package com.example.pas_34_10rpl1;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class Holder extends RecyclerView.ViewHolder implements View.OnClickListener {

    ImageView mImageView;
    TextView mTitle, mDesc;
    ItemClickListener itemClickListener;

    Holder(@NonNull View itemView) {
        super(itemView);

        this.mImageView = itemView.findViewById(R.id.Imagetv);
        this.mTitle = itemView.findViewById(R.id.txt_Name);
        this.mDesc = itemView.findViewById(R.id.txt_Description);

        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        this.itemClickListener.onItemListener(v, getLayoutPosition());

    }

    public void setItemClickListener(ItemClickListener ic){

        this.itemClickListener = ic;
    }
}
