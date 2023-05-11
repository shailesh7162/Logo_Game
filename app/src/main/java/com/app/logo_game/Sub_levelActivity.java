package com.app.logo_game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sub_levelActivity extends AppCompatActivity
{
    RecyclerView logoRecycler;
    Sub_Level_Adpter sub_level_adpter;
    int pos;
    List<String> image= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_level);

        pos = getIntent().getIntExtra("pos", 0);
        ((TextView)findViewById(R.id.sublevel)).setText("Level " + (pos + 1));


        logoRecycler.setLayoutManager(new LinearLayoutManager(this));
        sub_level_adpter= new Sub_Level_Adpter(this);
        logoRecycler.setAdapter(sub_level_adpter);
    }
}