package com.example.pas_34_10rpl1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.security.AccessController;
import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Holder> {

    Context c;
    ArrayList<Model> models;

    public Adapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row, null);
        return new Holder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {

        holder.mTitle.setText(models.get(i).getTitle());
        holder.mDesc.setText(models.get(i).getDesc());
        holder.mimageView.setImageResource(models.get(i).getImg());

    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}