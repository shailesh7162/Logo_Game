package com.app.logo_game;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Level_Activity extends AppCompatActivity
{
    RecyclerView  levelRecycler;
    Level_Adpter level_adpter;
    ImageView backBtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        levelRecycler=findViewById(R.id.levelRecycler);
        backBtn1=findViewById(R.id.backBtn1);

        levelRecycler.setLayoutManager(new LinearLayoutManager(Level_Activity.this));
        levelRecycler.setAdapter(level_adpter);

        backBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                finish();
            }
        });

    }
}