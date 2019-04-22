package com.example.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class RahenanidwActivity extends AppCompatActivity {
    Button next;
    Button back;
    int scoreRahenanidw;
    int generalScore;
    RadioButton firstRadioButton;
    RadioButton secondRadioButton;
    RadioButton thirdRadioButton;
    RadioButton fourthRadioButton;
    CardView firstCardView;
    CardView secondCardView;
    CardView thirdCardView;
    CardView fourthCardView;

    MediaPlayer audio1;
    MediaPlayer audio2;
    MediaPlayer audio3;
    MediaPlayer audio4;
    MediaPlayer nawyWenakanBleMP;
    MediaPlayer baznayZherWenakanRangbkaMP;
    Intent intent;
    TextView nawyWenakanBleTV;
    TextView baznayZherWenakanRangbkaTV;
    boolean state1 = true;
    boolean state2 = true;
    boolean state3 = true;
    boolean state4 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rahinanidw);

        Intent intentP = getIntent();
        generalScore = intentP.getIntExtra("scoreR1A", 0);

        next = findViewById(R.id.next);
        back = findViewById(R.id.back_r2a);

        nawyWenakanBleTV = findViewById(R.id.nawi_wenakan_ble);
        nawyWenakanBleMP = MediaPlayer.create(this, R.raw.nawy_wenakan_ble);
        baznayZherWenakanRangbkaTV = findViewById(R.id.baznay_zher_wenakan_rangbka_tv);

        audio1 = MediaPlayer.create(this, R.raw.parda);
        audio2 = MediaPlayer.create(this, R.raw.darga);
        audio3 = MediaPlayer.create(this, R.raw.amad);
        audio4 = MediaPlayer.create(this, R.raw.panjara);

        firstCardView = findViewById(R.id.card_one);
        secondCardView = findViewById(R.id.card_two);
        thirdCardView = findViewById(R.id.card_three);
        fourthCardView = findViewById(R.id.card_four);

        firstRadioButton = findViewById(R.id.parda_rb);
        secondRadioButton = findViewById(R.id.darga_rb);
        thirdRadioButton = findViewById(R.id.amad_rb);
        fourthRadioButton = findViewById(R.id.panjara_rb);
        nawyWenakanBleMP.start();
        firstCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audio1.start();
            }
        });


        secondCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audio2.start();
            }
        });
        thirdCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audio3.start();
            }


        });
        fourthCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                audio4.start();
            }
        });


//        baznayZherWenakanRangbkaMP=MediaPlayer.create(this,R.raw.);
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                nawyWenakanBleMP.start();
//                baznayZherWenakanRangbkaMP.start();
//            }
//        },4000);

        nawyWenakanBleTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nawyWenakanBleMP.start();

            }
        });

//        back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(RahenanidwActivity.this, WanekanActivity.class);
//                startActivity(intent);
//            }
        //      });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (state1 && firstRadioButton.isChecked()) {
                    if (firstRadioButton.isChecked())
                        state1 = false;
                    scoreRahenanidw++;
                    firstRadioButton.setEnabled(false);
                }
                if (state2 && secondRadioButton.isChecked()) {
                    state2 = false;
                    scoreRahenanidw++;
                    secondRadioButton.setEnabled(false);
                }
                if (state3 && thirdRadioButton.isChecked()) {
                    state3 = false;
                    scoreRahenanidw++;
                    thirdRadioButton.setEnabled(false);
                }
                if (fourthRadioButton.isChecked() && state4) {
                    Toast.makeText(RahenanidwActivity.this, "پەنجەرە د ی تیا نیە هەولدەوە", Toast.LENGTH_SHORT).show();
                    fourthRadioButton.setChecked(false);
                    state4 = false;
                }


                if (scoreRahenanidw == 3 && !(fourthRadioButton.isChecked()) && state4) {
                    generalScore = generalScore + scoreRahenanidw;
                    Toast.makeText(RahenanidwActivity.this, "پیرۆزە +3 نمرە" + " کۆی گشتی: " + generalScore + " نمرە ", Toast.LENGTH_SHORT).show();
                    intent = new Intent(RahenanidwActivity.this, SplitActivity.class);
                    intent.putExtra("scoreRahenaniDw", generalScore);
                    startActivity(intent);
                }  else if (scoreRahenanidw == 3 && (fourthRadioButton.isChecked())) {
                    state4 = true;
                    next.setEnabled(true);
                    Toast.makeText(RahenanidwActivity.this, "هەموو وەڵامە راستەکانت دۆزیەوە،بەلام پەنجەرە د ی تیا نیە", Toast.LENGTH_SHORT).show();
                }else if (scoreRahenanidw < 3 && !(fourthRadioButton.isChecked())) {
                    state4=true;
                    Toast.makeText(RahenanidwActivity.this, "هەموو وەڵامە راستەکانت نەدۆزیەوە، دوبارە هەولدەوە", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
