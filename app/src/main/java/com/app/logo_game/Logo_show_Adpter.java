package com.app.logo_game;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Logo_show_Adpter extends RecyclerView.Adapter<Logo_show_Adpter.ViewHolder>
{
    Activity context;
    List<String> image;
    int i;


    public Logo_show_Adpter(Activity context, ArrayList<String> image)
    {
        this.context=context;
        this.image=image;
    }

    @NonNull
    @Override
    public Logo_show_Adpter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view= LayoutInflater.from(context).inflate(R.layout.sub_level_iteam,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Logo_show_Adpter.ViewHolder holder, int position)
    {
        InputStream inputStream=null;
        try {
            if (i==i)
            {
                inputStream=context.getAssets().open("Level 1 US/"+image.get(position));
            }
            if (i==1)
            {
                inputStream=context.getAssets().open("Level 2 US/"+image.get(position));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Drawable drawable=Drawable.createFromStream(inputStream,null);
        holder.logo.setImageDrawable(drawable);

    }

    @Override
    public int getItemCount() {
        return image.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView logo,tick;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            logo=itemView.findViewById(R.id.logo);
            tick=itemView.findViewById(R.id.tick);
        }
    }
}
