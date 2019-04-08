package com.example.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CircleTheWordActivity extends AppCompatActivity {
    TextView t2,t3,t1;
    CardView firstCardView;
    CardView secondCardView;
    CardView thirdCardView;
    CardView fourthCardView;

    Button next;

    private boolean secondState =true;
    private boolean thirdState =true;
    private boolean fourthState =true;


    public int scroeCircleTheWord=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_the_word);
        final MediaPlayer audio1=MediaPlayer.create(this,R.raw.parda);
        final MediaPlayer audio2=MediaPlayer.create(this,R.raw.darga);
        final MediaPlayer audio3=MediaPlayer.create(this,R.raw.amad);
        final MediaPlayer audio4=MediaPlayer.create(this,R.raw.panjara);

        next=findViewById(R.id.next);
        next.setEnabled(false);
        firstCardView=findViewById(R.id.card_one);
        secondCardView=findViewById(R.id.card_two);
        thirdCardView=findViewById(R.id.card_three);
        fourthCardView=findViewById(R.id.card_four);

        t2=findViewById(R.id.txt2);
        t3=findViewById(R.id.txt3);
        t1=findViewById(R.id.txt1);
        firstCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audio1.start();
                t1.setBackgroundResource(R.drawable.background);
                if(fourthState){
                    scroeCircleTheWord++;
                    fourthState =false;
                    if (scroeCircleTheWord==3)
                        next.setEnabled(true);
                }

            }
        });


        secondCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audio2.start();
                t2.setBackgroundResource(R.drawable.background);
                if(secondState){
                    scroeCircleTheWord++;
                    secondState =false;
                    if (scroeCircleTheWord==3)
                        next.setEnabled(true);
                }
            }
        });
        thirdCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audio3.start();
                t3.setBackgroundResource(R.drawable.background);
                if(thirdState){
                    scroeCircleTheWord++;
                    thirdState =false;
                    if (scroeCircleTheWord==3)
                        next.setEnabled(true);
                }

            }
        });
        fourthCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audio4.start();

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(CircleTheWordActivity.this,ISayActivity.class);
                startActivity(intent);
            }
      });
    }
}
