package com.app.logo_game;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;

public class view_pager_Adpter extends RecyclerView.Adapter<view_pager_Adpter.holderClas>
{
    Play_Activity play_activity;
    view_pager_Adpter view_pager_adpter;
    ArrayList<String> image;
    ViewPager2 viewPager;
    Button ans_Button[];
    static StringBuffer ans=new StringBuffer();
    int t=0;
    int pos1;
    int cnt=0;

    public view_pager_Adpter(Play_Activity play_activity, ArrayList<String> image, ViewPager2 viewPager, int levels)
    {
        this.play_activity=play_activity;
        this.image=image;
        this.viewPager=viewPager;
        this.pos1=levels;
    }

    @NonNull
    @Override
    public holderClas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull view_pager_Adpter.holderClas holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class holderClas extends RecyclerView.ViewHolder {
        public holderClas(@NonNull View itemView) {
            super(itemView);
        }
    }
}

