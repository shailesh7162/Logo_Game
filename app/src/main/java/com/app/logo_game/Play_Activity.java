package com.app.logo_game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Play_Activity extends AppCompatActivity
{
    ViewPager2 viewPager;
    ArrayList<String> image;
    String[] images = new String[0];
    int pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        viewPager=findViewById(R.id.viewPager);
        int levels=getIntent().getIntExtra("pos",0);

        String images[];
        try {
            if (pos==0)
            {
                images = getAssets().list("Level 1 US/");
                image = new ArrayList<String>(Arrays.asList(images));
            }
            if (pos==1) {
                images = getAssets().list("Level 2 US/");
                image = new ArrayList<String>(Arrays.asList(images));
            }
            if (pos==2)
            {
                images = getAssets().list("Level 3 US/");
                image = new ArrayList<String>(Arrays.asList(images));
            }
            if (pos==3) {
                images = getAssets().list("Level 4 US/");
                image = new ArrayList<String>(Arrays.asList(images));
            }
            if (pos==4)
            {
                images = getAssets().list("Level 5 US/");
                image = new ArrayList<String>(Arrays.asList(images));
            }
            if (pos==5) {
                images = getAssets().list("Level 6 US/");
                image = new ArrayList<String>(Arrays.asList(images));
            }
            if (pos==6)
            {
                images = getAssets().list("Level 7 US/");
                image = new ArrayList<String>(Arrays.asList(images));
            }
            if (pos==7) {
                images = getAssets().list("Level 8 US/");
                image = new ArrayList<String>(Arrays.asList(images));
            }
            if (pos==8)
            {
                images = getAssets().list("Level 9 US/");
                image = new ArrayList<String>(Arrays.asList(images));
            }
            if (pos==9) {
                images = getAssets().list("Level 10 US/");
                image = new ArrayList<String>(Arrays.asList(images));
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("imagelist="+image);
        viewPager.setAdapter(new view_pager_Adpter(this,image,viewPager,levels));

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);

            }
        });

    }
}