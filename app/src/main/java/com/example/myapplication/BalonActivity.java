package com.example.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BalonActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton pink;
    ImageButton yellow;
    ImageButton red;
    ImageButton purple;
    ImageButton green;
    ImageButton orange;

    Button next;

    MediaPlayer pinkA;
    MediaPlayer yellowA;
    MediaPlayer redA;
    MediaPlayer purpleA;
    MediaPlayer greenA;
    MediaPlayer orangeA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balon);

        next=findViewById(R.id.next);

        pink=findViewById(R.id.pink);
        yellow=findViewById(R.id.yellow);
        red=findViewById(R.id.red);
        purple=findViewById(R.id.purple);
        green=findViewById(R.id.green);
        orange=findViewById(R.id.orange);


        pinkA=MediaPlayer.create(this,R.raw.pink);
        yellowA=MediaPlayer.create(this,R.raw.yellow);
        redA=MediaPlayer.create(this,R.raw.red);
        purpleA=MediaPlayer.create(this,R.raw.purple);
        greenA=MediaPlayer.create(this,R.raw.green);
        orangeA=MediaPlayer.create(this,R.raw.orange);


        pink.setOnClickListener(this);
        yellow.setOnClickListener(this);
        red.setOnClickListener(this);
        purple.setOnClickListener(this);
        green.setOnClickListener(this);
        orange.setOnClickListener(this);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BalonActivity.this,SelectTheLetterActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.pink:
                pinkA.start();
                break;
            case R.id.yellow:
                yellowA.start();
                break;
            case R.id.red:
                redA.start();
                break;
            case R.id.purple:
                purpleA.start();
                break;
            case R.id.green:
                greenA.start();
                break;
            case R.id.orange:
                orangeA.start();
                break;
        }
    }
}
