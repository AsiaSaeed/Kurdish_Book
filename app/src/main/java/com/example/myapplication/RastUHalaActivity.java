package com.example.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class RastUHalaActivity extends AppCompatActivity {
    Button b1r, b1h, b2r, b2h, b3r, b3h, b4r, b4h, next, backRUHA;
    ConstraintLayout chalakipenjLayout;
    LinearLayout scoreLayout;
    TextView text;
    int i;
    int scoreRUHA;
    int scoreGeneral;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rast_u_hala);
        b1r = findViewById(R.id.btn1r);
        b1h=findViewById(R.id.btn1h);
        b4r = findViewById(R.id.btn4r);
        b4h=findViewById(R.id.btn4h);

        b2h = findViewById(R.id.btn2h);
        b2r=findViewById(R.id.btn2r);

        b3h=findViewById(R.id.btn3h);
        b3r=findViewById(R.id.btn3r);

        b1r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             scoreRUHA++;
                Toast.makeText(RastUHalaActivity.this, "راستە +1", Toast.LENGTH_SHORT).show();
            }
        });

        b1h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RastUHalaActivity.this, "هەلەیە هەولدەوە", Toast.LENGTH_SHORT).show();
            }
        });

        b4r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreRUHA++;
                Toast.makeText(RastUHalaActivity.this, "راستە +1", Toast.LENGTH_SHORT).show();
            }
        });

        b4h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RastUHalaActivity.this, "هەلەیە هەولدەوە", Toast.LENGTH_SHORT).show();
            }
        });


        b3h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreRUHA++;
                Toast.makeText(RastUHalaActivity.this, "راستە +1", Toast.LENGTH_SHORT).show();
            }
        });

        b3r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RastUHalaActivity.this, "هەلەیە هەولدەوە", Toast.LENGTH_SHORT).show();
            }
        });


        b2h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreRUHA++;
                Toast.makeText(RastUHalaActivity.this, "راستە +1", Toast.LENGTH_SHORT).show();
            }
        });
        b2r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RastUHalaActivity.this, "هەلەیە هەولدەوە", Toast.LENGTH_SHORT).show();
            }
        });



        text = findViewById(R.id.tv);
        Intent intent = getIntent();
        i = intent.getIntExtra("gscore", 0);
        final MediaPlayer audio1 = MediaPlayer.create(this, R.raw.panjara);
        TextView tex = (TextView) this.findViewById(R.id.text1);
        tex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audio1.start();
            }
        });
        chalakipenjLayout = findViewById(R.id.chalaki_penj_layout);
        scoreLayout = findViewById(R.id.score_layout);

        next = findViewById(R.id.next);
        backRUHA = findViewById(R.id.back_RUHA);
        backRUHA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RastUHalaActivity.this, WanekanActivity.class);
                startActivity(intent);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=i+scoreRUHA;
                text.setText("نمرەی بەدەست هاتوو" + i);
                chalakipenjLayout.setVisibility(View.GONE);
                scoreLayout.setVisibility(View.VISIBLE);
            }
        });
    }

}