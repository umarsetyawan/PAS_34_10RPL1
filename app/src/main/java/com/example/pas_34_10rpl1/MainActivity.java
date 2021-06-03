package com.example.pas_34_10rpl1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mrecyclerView;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mrecyclerView = findViewById(R.id.rvdata);
        mrecyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new Adapter(this, getList());

    }

    private ArrayList<Model> getList() {
        ArrayList<Model> models = new ArrayList<>();
        models m = new Model();

    }
}