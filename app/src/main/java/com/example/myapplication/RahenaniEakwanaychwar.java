package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RahenaniEakwanaychwar extends AppCompatActivity {
    boolean state=false;
    Button next;
    TextView bbynawBleTV;
    MediaPlayer bbyneWBleMP;
    MediaPlayer wanayYakMP;
    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_rahinanieak_wanay_chwar );

        bbyneWBleMP = MediaPlayer.create(this, R.raw.bbena_ble);
        wanayYakMP =MediaPlayer.create(this,R.raw.waneyyak);

        wanayYakMP.start();
        next=findViewById(R.id.next);
        next.setEnabled(false);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                wanayYakMP.start();
                bbyneWBleMP.start();
            }
        },4000);
        bbynawBleTV = findViewById(R.id.bbynaw_ble_tv);
        bbynawBleTV.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                bbyneWBleMP.start();
                next.setEnabled(true);
                state=true;
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (state) {

                    Intent intent = new Intent( RahenaniEakwanaychwar.this, Rahenanidwwanaychwar.class);
                    startActivity(intent);

                }
            }
        });
    }
}
