package com.app.logo_game;

import androidx.appcompat.app.AppCompatActivity;
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
    int i;
    ArrayList<String> image= new ArrayList<>();
    Button backBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_level);
        logoRecycler=findViewById(R.id.logoRecycler);
        i=getIntent().getIntExtra("i",0);

        String images[];
        try {
            if (i==0) {
                images = getAssets().list("Level 1 US");
                image = new ArrayList<String>(Arrays.asList(images));
            }
            if (i==1)
            {
                images = getAssets().list("Level 2 US");
                image = new ArrayList<String>(Arrays.asList(images));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("imagelist="+image);


        logoRecycler.setLayoutManager(new LinearLayoutManager(this));
        sub_level_adpter= new Logo_show_Adpter(this,image);
        logoRecycler.setAdapter(sub_level_adpter);

    }
}