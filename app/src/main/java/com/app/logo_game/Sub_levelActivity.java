package com.app.logo_game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sub_levelActivity extends AppCompatActivity
{
    RecyclerView logoRecycler;
    Sub_Level_Adpter sub_level_adpter;
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

                images=getAssets().list("Unsold image");
                image=new ArrayList<String>(Arrays.asList(images));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("imagelist="+image);


        logoRecycler.setLayoutManager(new LinearLayoutManager(this));
        sub_level_adpter= new Sub_Level_Adpter(this,image);
        logoRecycler.setAdapter(sub_level_adpter);

    }
}