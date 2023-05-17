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
    Logo_show_Adpter logo_show_adpter;
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


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("imagelist="+image);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(Logo_show_Activity.this, LinearLayoutManager.HORIZONTAL, false);
        logoRecycler.setLayoutManager(new LinearLayoutManager(this));
        logo_show_adpter= new Logo_show_Adpter(this,image,pos);
        logoRecycler.setAdapter(logo_show_adpter);

    }
}