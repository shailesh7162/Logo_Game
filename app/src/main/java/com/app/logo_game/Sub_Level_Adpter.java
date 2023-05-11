package com.app.logo_game;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Sub_Level_Adpter extends RecyclerView.Adapter<Sub_Level_Adpter.ViewHolder>
{
    Activity context;
    List<String> image= new ArrayList<>();
    int pos;


    public Sub_Level_Adpter(Sub_levelActivity context) {
    }


    @NonNull
    @Override
    public Sub_Level_Adpter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull Sub_Level_Adpter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
