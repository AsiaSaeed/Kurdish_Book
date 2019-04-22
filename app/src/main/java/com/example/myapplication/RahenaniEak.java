package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RahenaniEak extends AppCompatActivity {
    boolean state = false;
    Button next;
    Button backR1A;
    TextView bbynawBleTV;
    MediaPlayer bbyneWBleMP;
    MediaPlayer wanayYakMP;
    MediaPlayer cherokiAmadMP;
    ImageView amadIV;
    public int scoreR1A;
    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rahinanieak);


        bbyneWBleMP = MediaPlayer.create(this, R.raw.bbena_ble);
        wanayYakMP = MediaPlayer.create(this, R.raw.waneyyak);
        cherokiAmadMP = MediaPlayer.create(this, R.raw.amad_cherok);

        next = findViewById(R.id.next);
        backR1A =findViewById(R.id.back_r1a);

        bbynawBleTV = findViewById(R.id.bbynaw_ble_tv);
        next.setEnabled(false);

        amadIV=findViewById(R.id.amad_iv);



        amadIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cherokiAmadMP.start();
                next.setEnabled(true);
                state = true;
            }
        });
        wanayYakMP.start();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                bbyneWBleMP.start();
            }
        }, 3000);

        bbynawBleTV.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                bbyneWBleMP.start();
            }
        });


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (state) {
                    Toast.makeText(RahenaniEak.this, "پیرۆزە +2 نمرە", Toast.LENGTH_SHORT).show();
                    state=false;
                    scoreR1A=2;
                    Intent intent = new Intent(RahenaniEak.this, RahenanidwActivity.class);
                    intent.putExtra("scoreR1A",scoreR1A);
                    startActivity(intent);
                }
            }
        });
        backR1A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RahenaniEak.this, WanekanActivity.class);
                startActivity(intent);
            }
        });


    }
}
