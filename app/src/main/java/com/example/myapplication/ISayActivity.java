package com.example.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ISayActivity extends AppCompatActivity implements View.OnClickListener {
    Button next;
    Button backISA;
    Button firstLetterTV;
    Button secondLetterTV;
    Button thirdLetterTv;
    Button dalemBtn;
    int dalemScore;
    int generalScore;
    boolean firstState = true;
    boolean secondState = true;
    boolean thirdState = true;
    MediaPlayer theLetterTVMP;
    MediaPlayer dalemTVMP;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.i_say_main);
        dalemTVMP=MediaPlayer.create(this,R.raw.dalem);
        dalemTVMP.start();
        theLetterTVMP =MediaPlayer.create(this,R.raw.d);
        firstLetterTV = findViewById(R.id.d1);
        secondLetterTV = findViewById(R.id.d2);
        thirdLetterTv = findViewById(R.id.d3);
        dalemBtn=findViewById(R.id.dalem_btn);
        dalemBtn.setOnClickListener(this);
        firstLetterTV.setOnClickListener(this);
        secondLetterTV.setOnClickListener(this);
        thirdLetterTv.setOnClickListener(this);

        Intent intent = getIntent();
        generalScore = intent.getIntExtra("CTWAsocre", 0);
        next = findViewById(R.id.next);
        backISA=findViewById(R.id.back_isa);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dalemScore == 3) {
                    generalScore = generalScore + dalemScore;
                    Toast.makeText(ISayActivity.this, "پیرۆزە کۆی گشتی: " + generalScore + " نمرە", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(ISayActivity.this, CircleTheLetterActivity.class);
                    intent.putExtra("scoreISA",generalScore);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(ISayActivity.this, "ببورە گوێت لەهەموو پیتەکان نەگرت " , Toast.LENGTH_SHORT).show();

                }
            }
        });
        backISA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ISayActivity.this,WanekanActivity.class);
                startActivity(intent);
            }
        });

    }

    public void playSoundFile(Integer fileName) {

    }

    public void dalem(View v) {
        playSoundFile(R.raw.dalem);
    }

    public void d(View v) {
        playSoundFile(R.raw.d);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.d1 && firstState) {
            firstState = false;
            dalemScore++;
        }
        if (v.getId() == R.id.d2 && secondState) {
            secondState = false;
            dalemScore++;
        }
        if (v.getId() == R.id.d3 && thirdState) {
            thirdState = false;
            dalemScore++;
        }
        if (v.getId()==R.id.d1||v.getId()==R.id.d2||v.getId()==R.id.d3)
            theLetterTVMP.start();

        if (v.getId()==R.id.d)
            theLetterTVMP.start();
        if (v.getId()==R.id.dalem_btn)
            dalemTVMP.start();

    }
}
