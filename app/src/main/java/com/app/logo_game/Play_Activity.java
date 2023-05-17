package com.app.logo_game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Play_Activity extends AppCompatActivity
{
    TextView logo_count;
    ImageView backBtn3;
    ViewPager2 viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        logo_count=findViewById(R.id.logo_count);
        backBtn3=findViewById(R.id.backBtn3);
        viewPager=findViewById(R.id.viewPager);
    }
}