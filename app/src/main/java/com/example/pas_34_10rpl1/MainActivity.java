package com.example.pas_34_10rpl1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mrecyclerView;
    Adapter adapter;
    public static final ArrayList<Model> models = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton plusbtn = findViewById(R.id.plusbtn);
        plusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NewDataActivity.class);
                startActivity(intent);
            }
        });

        mrecyclerView = findViewById(R.id.rvdata);
        mrecyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new Adapter(this, models);
        mrecyclerView.setAdapter(adapter);

        adapter.notifyDataSetChanged();

    }
}