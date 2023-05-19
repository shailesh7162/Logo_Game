package com.app.logo_game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class Level_Activity extends AppCompatActivity
{
    RecyclerView  levelRecycler;
    Level_Adpter level_adpter;
    ImageView backBtn1;
    ArrayList Levels=new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        levelRecycler = findViewById(R.id.levelRecycler);
        backBtn1 = findViewById(R.id.backBtn1);
        Levelsfill();

        levelRecycler.setLayoutManager(new LinearLayoutManager(this));
        level_adpter = new Level_Adpter(this,Levels);
        levelRecycler.setAdapter(level_adpter);
    }


    private void Levelsfill()
    {
        Levels.add("Level 1");
        Levels.add("Level 2");
        Levels.add("Level 3");
        Levels.add("Level 4");
        Levels.add("Level 5");
        Levels.add("Level 6");
        Levels.add("Level 7");
        Levels.add("Level 8");
        Levels.add("Level 9");
        Levels.add("Level 10");
    }

}