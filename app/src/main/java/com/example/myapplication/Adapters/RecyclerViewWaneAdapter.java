package com.example.myapplication.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.Model.Wanekan;
import com.example.myapplication.R;
import com.example.myapplication.RahenaniEak;
import com.example.myapplication.RahenaniEakwanaySYE;
import com.example.myapplication.RahenaniEakwanaychwar;
import com.example.myapplication.RahenaniEakwanaydw;
import com.example.myapplication.RahenaniEakwanaypenj;

import java.util.ArrayList;

public class RecyclerViewWaneAdapter extends RecyclerView.Adapter<RecyclerViewWaneAdapter.MyViewHolder> {
    Context context;
    int postion;
    int id;
    String petTVRCString;
    Intent intent=null;
    ArrayList<Wanekan> comingData;

    public RecyclerViewWaneAdapter(Context context, ArrayList<Wanekan> comingData) {
        this.context = context;
        this.comingData = comingData;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater mInflater = LayoutInflater.from(context);
        View view;
        view = mInflater.inflate(R.layout.wanakan_list_item_design, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder myViewHolder, int i) {
        postion=i;
        myViewHolder.waneTVH.setText(comingData.get(i).getWane());
        myViewHolder.petTVH.setText(comingData.get(i).getPet());



        myViewHolder.waneCVH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                petTVRCString=String.valueOf(myViewHolder.petTVH.getText());
                switch (petTVRCString) {
                    case "د":
                        intent = new Intent(context, RahenaniEak.class);
                        context.startActivity(intent);
                        break;
                    case "ر":
                        intent = new Intent(context, RahenaniEakwanaydw.class);
                        context.startActivity(intent);
                        break;
                    case "ز":
                        intent = new Intent(context, RahenaniEakwanaySYE.class);
                        context.startActivity(intent);
                        break;
                    case "و":
                        intent = new Intent(context, RahenaniEakwanaychwar.class);
                        context.startActivity(intent);
                        break;
                     case "ڕ":
                        intent=new Intent(context, RahenaniEakwanaypenj.class);
                         context.startActivity(intent);
                        break;
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return comingData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView waneTVH;
        TextView petTVH;
        CardView waneCVH;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            waneTVH = itemView.findViewById(R.id.wane_tv);
            petTVH = itemView.findViewById(R.id.pet_tv);
            waneCVH = itemView.findViewById(R.id.wane_cv);
        }
    }
}
