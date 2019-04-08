package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class wanakan_tab_c extends Fragment {
View view;
    CardView course1;


    public wanakan_tab_c(){


    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view =inflater.inflate(R.layout.wanakan_tab_c,container,false);

        course1= view.findViewById(R.id.cardone);
       course1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(view.getContext(),RahenaniEak.class);
               startActivity(intent);
           }
       });
        return view;
    }
}
