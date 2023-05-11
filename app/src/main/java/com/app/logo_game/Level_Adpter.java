package com.app.logo_game;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Level_Adpter extends RecyclerView.Adapter<Level_Adpter.ViewHolder>
{
    Context context;
    String[] number={"1","2","3","4","5","6","7","8","9","10"};
    int i;

    public Level_Adpter(Context context)
    {
        this.context=context;

    }
    @NonNull
    @Override
    public Level_Adpter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
       view= LayoutInflater.from(context).inflate(R.layout.level_iteam,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Level_Adpter.ViewHolder holder, int position) {
        holder.levelTxtv.setText("LEVEL"+number[position]);
        holder.levelTxtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context,Sub_levelActivity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return number.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView level,levelTxtv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            levelTxtv=itemView.findViewById(R.id.levelTxtv);
            level=itemView.findViewById(R.id.level);
        }
    }
}
