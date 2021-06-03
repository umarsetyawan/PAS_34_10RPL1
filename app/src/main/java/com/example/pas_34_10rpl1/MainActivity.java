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
        mrecyclerView.setAdapter(adapter);

    }

    private ArrayList<Model> getList() {
        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("Profile");
        m.setDesc("This is profile description..");
        m.setImg(R.drawable.user);
        models.add(m);

        m = new Model();
        m.setTitle("cart");
        m.setDesc("This is cart description..");
        m.setImg(R.drawable.cart);
        models.add(m);

        m = new Model();
        m.setTitle("setting");
        m.setDesc("This is setting description..");
        m.setImg(R.drawable.settings);
        models.add(m);

        return models;
    }
}