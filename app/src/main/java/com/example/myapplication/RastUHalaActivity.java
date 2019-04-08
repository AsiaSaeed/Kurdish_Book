package com.example.myapplication;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class RastUHalaActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;
    LinearLayout chalakipenjLayout;
    LinearLayout scoreLayout;
    TextView text;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rast_u_hala);

        final MediaPlayer audio1=MediaPlayer.create(this,R.raw.panjara);
        TextView tex=(TextView)this.findViewById(R.id.text1);
        tex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audio1.start();
            }
        });
        chalakipenjLayout =findViewById(R.id.chalaki_penj_layout);
        scoreLayout =findViewById(R.id.score_layout);

        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
        b3=(Button)findViewById(R.id.btn3);
        b4=(Button)findViewById(R.id.btn4);
        b5=(Button)findViewById(R.id.next);
        b1.setOnClickListener(new View.OnClickListener() {
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
                            b1.setBackgroundResource(R.drawable.right);}
                        else if (i==2){
                            b1.setBackgroundResource(R.drawable.d);}
                        i=0;
                    }
                },500);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
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
                            b2.setBackgroundResource(R.drawable.right);}
                        else if (i==2){
                            b2.setBackgroundResource(R.drawable.d);}
                        i=0;
                    }
                },500);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
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
                            b3.setBackgroundResource(R.drawable.right);}
                        else if (i==2){
                            b3.setBackgroundResource(R.drawable.d);}
                        i=0;
                    }
                },500);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
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
                            b4.setBackgroundResource(R.drawable.right);}
                        else if (i==2){
                            b4.setBackgroundResource(R.drawable.d);}
                        i=0;
                    }
                },500);
            }
        });
        //awa bo next buttona
         b5.setOnClickListener(new View.OnClickListener() {
         @Override
          public void onClick(View v) {
             chalakipenjLayout.setVisibility(View.GONE);
             scoreLayout.setVisibility(View.VISIBLE);
             }
         });

         }

}