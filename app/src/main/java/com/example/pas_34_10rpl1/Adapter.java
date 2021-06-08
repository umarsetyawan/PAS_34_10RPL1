package com.example.pas_34_10rpl1;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayOutputStream;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Objects;

public class Adapter extends RecyclerView.Adapter<Holder> {

    Context c;
    ArrayList<Model> models = new ArrayList<>();

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

        holder.mTitle.setText(MainActivity.models.get(i).getName());
        holder.mDesc.setText(MainActivity.models.get(i).getDesc());
        holder.mImageView.setImageResource(models.get(i).getImg());

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemListener(View v, int Position) {

                String gTitle = models.get(Position).getName();
                String gDesc = models.get(Position).getDesc();
                BitmapDrawable bitmapDrawable = (BitmapDrawable) holder.mImageView.getDrawable();

                Bitmap bitmap = bitmapDrawable.getBitmap();
                ByteArrayOutputStream stream = new ByteArrayOutputStream();

                bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
                byte[] bytes = stream.toByteArray();

                Intent intent = new Intent(c, DetailActivity.class);
                intent.putExtra("iTitle", gTitle);
                intent.putExtra("iDesc", gDesc);
                intent.putExtra("iImage", bytes);
                c.startActivity(intent);

            }
        });

    }



    @Override
    public int getItemCount() {
        return models.size();
    }
}
