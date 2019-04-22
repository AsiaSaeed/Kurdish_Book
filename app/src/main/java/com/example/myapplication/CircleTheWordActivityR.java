package com.example.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CircleTheWordActivityR extends AppCompatActivity {
    TextView t1,t2,t3,t4;
    Button b3;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_the_word_r);
        final MediaPlayer audio1=MediaPlayer.create(this,R.raw.bbena_ble);
        TextView tex=(TextView)this.findViewById(R.id.tx);
        tex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audio1.start();
            }
        });

        final MediaPlayer audio2=MediaPlayer.create(this,R.raw.d);
        TextView tex1=(TextView)this.findViewById(R.id.txt);
        tex1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audio2.start();
            }
        });
        final MediaPlayer audio3=MediaPlayer.create(this,R.raw.parda);
        ImageView tex2=(ImageView) this.findViewById(R.id.parda);
        tex2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audio3.start();
            }
        });
        final MediaPlayer audio4=MediaPlayer.create(this,R.raw.darga);
        ImageView tex3=(ImageView) this.findViewById(R.id.darga);
        tex3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audio4.start();
            }
        });
        final MediaPlayer audio5=MediaPlayer.create(this,R.raw.amad);
        ImageView tex4=(ImageView) this.findViewById(R.id.amad);
        tex4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audio5.start();
            }
        });
        final MediaPlayer audio6=MediaPlayer.create(this,R.raw.panjara);
        ImageView tex5=(ImageView) this.findViewById(R.id.panjara);
        tex5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audio6.start();
            }
        });
        t1=(TextView) findViewById(R.id.txt1);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
                   /* public void onClick(View v) {

                        }
                    }*/
            public void onClick(View v) {

                i++;
                Handler handler=new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(i==1){
                            t1.setBackgroundResource(R.drawable.background);
                        }

                        i=0;
                    }
                },500);
            }
        });
        //*****************************************************
        t2=(TextView) findViewById(R.id.txt2);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
                   /* public void onClick(View v) {

                        }
                    }*/
            public void onClick(View v) {

                i++;
                Handler handler=new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(i==1){
                            t2.setBackgroundResource(R.drawable.background);
                        }

                        i=0;
                    }
                },500);
            }
        });
        //*****************************************************
        t3=(TextView) findViewById(R.id.txt3);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
                   /* public void onClick(View v) {

                        }
                    }*/
            public void onClick(View v) {

                i++;
                Handler handler=new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(i==1){
                            t3.setBackgroundResource(R.drawable.background);
                        }
                        else if(i==2){

                        }
                        i=0;
                    }
                },500);
            }
        });
        //*****************************************************
        t4=(TextView) findViewById(R.id.txt4);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
                   /* public void onClick(View v) {

                        }
                    }*/
            public void onClick(View v) {

                i++;
                Handler handler=new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(i==1){
                            t4.setBackgroundResource(R.drawable.background);
                        }

                        i=0;
                    }
                },500);
            }
        });
        //*****************************************************
        //awa bo next buttona
        b3=(Button)this.findViewById(R.id.btn) ;
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CircleTheWordActivityR.this,CircleTheLetterActivityR.class);
                startActivity(intent);
            }
        });
    }
}
