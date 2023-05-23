package com.app.logo_game;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class view_pager_Adpter extends RecyclerView.Adapter<view_pager_Adpter.holderClas>
{
    Play_Activity play_activity;
    view_pager_Adpter view_pager_adpter;
    ArrayList<String> image;
    ViewPager2 viewPager;
    Button ans_Button[];
    static StringBuffer ans=new StringBuffer();
    int t=0;
    int pos1,levels;
    int cnt=0;
    String j;

    public view_pager_Adpter(Play_Activity play_activity, ArrayList<String> image, ViewPager2 viewPager, int levels)
    {
        this.play_activity=play_activity;
        this.image=image;
        this.viewPager=viewPager;
        this.pos1=levels;
    }

    @NonNull
    @Override
    public holderClas onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        holderClas holderClas=new holderClas(LayoutInflater.from(play_activity).inflate(R.layout.view_pager_iteam,parent,false));
        t=0;
        cnt=0;

        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                t=0;
                Log.d("posss","onBindViewHolder: page position="+position);
            }
        });
        return holderClas;
    }

    @Override
    public void onBindViewHolder(@NonNull view_pager_Adpter.holderClas holder, int position)
    {
        t=0;
        System.out.println("Fun called=="+(cnt++));
        if (position==-1)
        {
            position++;
        }
        if (pos1 == 0) {
            j = image.get(position);
        }
        if (pos1 == 1) {
            j = image.get(position);
        }
        if (pos1 == 2) {
            j = image.get(position);
        }
        if (pos1 == 3) {
            j = image.get(position);
        }
        if (pos1 == 4) {
            j = image.get(position);
        }
        if (pos1 == 5) {
            j = image.get(position);
        }
        if (pos1 == 6) {
            j = image.get(position);
        }
        if (pos1 == 7) {
            j = image.get(position);
        }
        if (pos1 == 8) {
            j = image.get(position);
        }
        if (pos1 == 9) {
            j = image.get(position);
        }
        InputStream inputStream=null;
        try {
            if (levels==0) {

                inputStream = play_activity.getAssets().open("Level 1 US/" + image.get(position));
            }
            if (levels==1)
            {
                inputStream = play_activity.getAssets().open("Level 2 US/" + image.get(position));
            }
            if (levels==2) {

                inputStream = play_activity.getAssets().open("Level 3 US/" + image.get(position));
            }
            if (levels==3)
            {
                inputStream = play_activity.getAssets().open("Level 4 US/" + image.get(position));
            }
            if (levels==4) {

                inputStream = play_activity.getAssets().open("Level 5 US/" + image.get(position));
            }
            if (levels==5)
            {
                inputStream = play_activity.getAssets().open("Level 6 US/" + image.get(position));
            }
            if (levels==6) {

                inputStream = play_activity.getAssets().open("Level 7 US/" + image.get(position));
            }
            if (levels==7)
            {
                inputStream = play_activity.getAssets().open("Level 8 US/" + image.get(position));
            }
            if (levels==8) {

                inputStream = play_activity.getAssets().open("Level 9 US/" + image.get(position));
            }
            if (levels==9)
            {
                inputStream = play_activity.getAssets().open("Level 10 US/" + image.get(position));
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Drawable drawable=Drawable.createFromStream(inputStream,null);
        holder.imageView.setImageDrawable(drawable);

        holder.arrayList.clear();
        holder.linearLayout.removeAllViews();
        String[] ansarr = image.get(position).split("\\.");
        String finalans = ansarr[0];
        Toast.makeText(play_activity, ""+finalans, Toast.LENGTH_SHORT).show();
        System.out.println("Final="+finalans);
        ans_Button = new Button[finalans.length()];
        char[] ans_chararr = finalans.toCharArray();

        for (int i = 0; i < finalans.length(); i++) {
            ans_Button[i] = new Button(play_activity);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT, 1);
            layoutParams.setMargins(5, 5, 5, 5);
            ans_Button[i].setLayoutParams(layoutParams);
            ans_Button[i].setBackgroundColor(play_activity.getResources().getColor(R.color.purple_200));
            holder.linearLayout.addView(ans_Button[i]);
        }

        for (int i = 0; i < finalans.length(); i++) {
            holder.arrayList.add(""+ans_chararr[i]);
        }
        for (int i = 0; i < holder.btn.length - finalans.length(); i++) {
            Random r = new Random();
            char c = (char) (r.nextInt(26) + 'a');
            holder.arrayList.add("" + c);
        }
        Collections.shuffle(holder.arrayList);
        Collections.shuffle(holder.arrayList);
        for (int i = 0; i < holder.btn.length; i++) {
            holder.btn[i].setVisibility(View.VISIBLE);
            holder.btn[i].setText("" + holder.arrayList.get(i));
            int finalPosition = position;
            holder.btn[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    for (int i = 0; i < holder.btn.length; i++) {
                        if (holder.btn[i].getId() == view.getId()) {
                            if (!holder.btn[i].getText().toString().isEmpty()) {
                                if (t <finalans.length()) {
                                    ans_Button[t].setText(holder.btn[i].getText());
                                    holder.btn[i].setText("");
                                    holder.btn[i].setVisibility(Button.INVISIBLE);
                                    System.out.println("t=" + t);
                                    ans.append(ans_Button[t].getText().toString());
                                    System.out.println("Answer="+ans);
                                    checkWin(ans);
                                    t++;
                                }
                            }
                        }
                    }
                }

                private void checkWin(StringBuffer ans)
                {
                    System.out.println("Ans="+ans+"\tFinalAns="+finalans);
                    if(finalans.equalsIgnoreCase(String.valueOf(ans)))
                    {
                        Toast.makeText(play_activity, "Win", Toast.LENGTH_LONG).show();
                        ans.delete(0,finalans.length());
                        System.out.println("Now ans="+ans);
                        MaterialAlertDialogBuilder builder=new MaterialAlertDialogBuilder(viewPager.getContext());
                        builder.setMessage("Correct Answer...");
                        builder.setPositiveButton("Next", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                viewPager.setCurrentItem(finalPosition +1);
                            }
                        });
                        builder.show();
                    }
                }
            });
        }

    }

    @Override
    public int getItemCount() {
        return image.size();
    }

    public class holderClas extends RecyclerView.ViewHolder {
        public ImageView imageView;
        LinearLayout linearLayout;
        Button btn[]=new Button[16];
        ArrayList<String> arrayList=new ArrayList<>();

        public holderClas(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.logo);
            linearLayout=itemView.findViewById(R.id.linear);
            for (int i=0;i<btn.length;i++)
            {
                int id=play_activity.getResources().getIdentifier("b"+i,"id",play_activity.getPackageName());
                Log.d("IDD", "holderClass: "+id);
                btn[i]=itemView.findViewById(id);
            }
        }
    }
}

