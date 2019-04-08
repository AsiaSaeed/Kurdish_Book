package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class book_tab_c extends Fragment {
    @Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {

        //Pass your layout xml to the inflater and assign it to rootView.
        View rootView = inflater.inflate(R.layout.book_tab, container, false);
        Context   context = rootView.getContext(); // Assign your rootView to context



        CardView cardView=(CardView)rootView.findViewById(R.id.cardone);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent( getActivity(),book1.class );
                startActivity( intent );
            }
        });

        CardView cardtwo=(CardView)rootView.findViewById(R.id.cardtwo);
        cardtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent( getActivity(),book2.class );
                startActivity( intent );
            }
        });


        return rootView;

    }

}