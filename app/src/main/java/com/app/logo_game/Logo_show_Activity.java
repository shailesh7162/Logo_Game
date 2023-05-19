package com.app.logo_game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Logo_show_Activity extends AppCompatActivity
{
    RecyclerView logoRecycler;
    Logo_show_Adpter sub_level_adpter;
    int pos;
    ArrayList<String> image= new ArrayList<>();
    Button backBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo_show);
        logoRecycler=findViewById(R.id.logoRecycler);
        pos=getIntent().getIntExtra("pos",0);
        System.out.println("logo show pos =="+pos);

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


        logoRecycler.setLayoutManager(new LinearLayoutManager(this));
        logoRecycler.setLayoutManager(new GridLayoutManager(Logo_show_Activity.this, 2));
        sub_level_adpter= new Logo_show_Adpter(this,image,pos);
        logoRecycler.setAdapter(sub_level_adpter);

    }
}