package com.example.pas_34_10rpl1;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView mTitleTv, mDescTv;
    ImageView mImageTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ActionBar actionBar = getSupportActionBar();

        mTitleTv = findViewById(R.id.TitleView);
        mDescTv = findViewById(R.id.DescriptionView);
        mImageTv = findViewById(R.id.ImageView);

        Intent intent = getIntent();

        String mTitle = intent.getStringExtra("iTitle");
        String mDesc = intent.getStringExtra("iDesc");

        byte[] mBytes = getIntent().getByteArrayExtra("iImage");
        Bitmap bitmap = BitmapFactory.decodeByteArray(mBytes, 0, mBytes.length);

        actionBar.setTitle(mTitle);

        System.out.println(mImageTv);
        mTitleTv.setText(mTitle);
        mDescTv.setText(mDesc);
        mImageTv.setImageBitmap(bitmap);



    }
}