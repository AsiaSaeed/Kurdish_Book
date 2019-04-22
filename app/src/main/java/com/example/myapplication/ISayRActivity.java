package com.example.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ISayRActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE ="com.example.lenovo.dalem_d" ;
    public int score=0;
    Button next;
    boolean incremented=true;
    MediaPlayer   mediaPlayer;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isay_r);
        next=findViewById(R.id.button);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ISayRActivity.this, BrgaActivity.class);
                if(score==3) {
                    startActivity(intent);
                }
            }
        });

    }


    public void playSoundFile(Integer fileName){
        mediaPlayer = MediaPlayer.create(this, fileName);
        mediaPlayer.start();
    }

    public void dalem(View v){
        playSoundFile(R.raw.dalem);
    }

    public void d(View v){
        playSoundFile(R.raw.d);
        if(score<=3) {
            score++;
        }
    }
}
