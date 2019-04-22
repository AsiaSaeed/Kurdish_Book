package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SelectTheLetterActivity extends AppCompatActivity {
    Button next;
    Button backSTLA;
    int scoreSTLA;
    int generalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_the_letter);
        Intent intent = getIntent();
        generalScore = intent.getIntExtra("scoreBA", 0);

        next = findViewById(R.id.next);
        backSTLA = findViewById(R.id.back_stla);
        setTitle("dev2qa.com - Android Set TextView Foreground Background Color Example.");
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generalScore = generalScore + scoreSTLA;
                Toast.makeText(SelectTheLetterActivity.this, "پیرۆزە کۆی گشتی: " + generalScore + " نمرە", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SelectTheLetterActivity.this, TypeLetterActivity.class);
                startActivity(intent);
            }
        });
        backSTLA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SelectTheLetterActivity.this, WanekanActivity.class);
                startActivity(intent);
            }
        });
        // Get the textview object.
        final TextView d = (TextView) findViewById(R.id.d);
        final TextView d2 = (TextView) findViewById(R.id.d2);
        final TextView d3 = (TextView) findViewById(R.id.d3);
        final TextView d4 = (TextView) findViewById(R.id.d4);
        final TextView d5 = (TextView) findViewById(R.id.d5);
        // Get set text view foreground color button and make button text as normal.
        TextView setForeGroundColord = (TextView) findViewById(R.id.d);
        setForeGroundColord.setAllCaps(false);
        setForeGroundColord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scoreSTLA < 5)
                    scoreSTLA++;
                d.setTextColor(Color.RED);


            }
        });

        TextView setForeGroundColord2 = (TextView) findViewById(R.id.d2);
        setForeGroundColord2.setAllCaps(false);
        setForeGroundColord2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scoreSTLA < 5)
                    scoreSTLA++;
                d2.setTextColor(Color.RED);

            }
        });


        TextView setForeGroundColord3 = (TextView) findViewById(R.id.d3);
        setForeGroundColord3.setAllCaps(false);
        setForeGroundColord3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scoreSTLA < 5)
                    scoreSTLA++;
                d3.setTextColor(Color.RED);

            }
        });
        TextView setForeGroundColord4 = (TextView) findViewById(R.id.d4);
        setForeGroundColord4.setAllCaps(false);
        setForeGroundColord4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scoreSTLA < 5)
                    scoreSTLA++;
                d4.setTextColor(Color.RED);

            }
        });

        TextView setForeGroundColord5 = (TextView) findViewById(R.id.d5);
        setForeGroundColord5.setAllCaps(false);
        setForeGroundColord5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (scoreSTLA < 5)
                    scoreSTLA++;
                d5.setTextColor(Color.RED);

            }
        });
    }
}
