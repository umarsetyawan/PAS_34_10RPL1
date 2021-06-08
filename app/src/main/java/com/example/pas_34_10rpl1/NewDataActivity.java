package com.example.pas_34_10rpl1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;


public class NewDataActivity extends AppCompatActivity {

    RecyclerView mrecyclerView;
    Adapter adapter;
    EditText Name;
    EditText Number;
    Button Addbtn;
    String name;
    String number;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_data);
        Context c;

        Name = (EditText)findViewById(R.id.text_name_input);
        Number = (EditText)findViewById(R.id.text_number_input);
        Addbtn = (Button)findViewById(R.id.addbtn);

//        mrecyclerView = findViewById(R.id.rvdata);
//        mrecyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        adapter = new Adapter(this, getList());
//        mrecyclerView.setAdapter(adapter);





        Addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = Name.getText().toString();
                number = Number.getText().toString();
                if (name.isEmpty() || number.isEmpty()){
                    Toast.makeText(NewDataActivity.this, "Tolong isi Nama dan Nomor HP", Toast.LENGTH_SHORT ).show();
                }else {
                    MainActivity.models.add(new Model(name, number, R.drawable.user));
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }
            }
        });


    }
}