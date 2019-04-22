package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CircleTheLetterActivityR extends AppCompatActivity implements View.OnTouchListener {
    TextView ctlFirstTv;
    TextView ctlSecondTv;
    TextView ctlThirdTv;
    TextView ctlForthTv;
    private boolean tv1State = true;
    private boolean tv2State = true;
    private boolean tv3State = true;
    private boolean tv4State = true;
    public int ctlScore;
    Button next;
    Button backCTLA;
    int generalScore;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_the_letter_r);
        backCTLA = findViewById(R.id.back_ctla);
        Intent intent = getIntent();
        generalScore = intent.getIntExtra("scoreISA", 0);
        ctlFirstTv = findViewById(R.id.first_cld_tv);
        ctlSecondTv = findViewById(R.id.second_cld_tv);
        ctlThirdTv = findViewById(R.id.third_cld_tv);
        ctlForthTv = findViewById(R.id.forth_cld_tv);
        ctlFirstTv.setOnTouchListener(this);
        ctlSecondTv.setOnTouchListener(this);
        ctlThirdTv.setOnTouchListener(this);
        ctlForthTv.setOnTouchListener(this);
        backCTLA = findViewById(R.id.back_ctla);
        next = findViewById(R.id.next_ctl);
        backCTLA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CircleTheLetterActivityR.this, WanekanActivity.class);
                startActivity(intent);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ctlScore == 3) {
                    generalScore = generalScore + ctlScore;
                    Toast.makeText(CircleTheLetterActivityR.this, "پیرۆزە کۆی گشتی: " + generalScore + " نمرە", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(CircleTheLetterActivityR.this, ISayRActivity.class);
                    intent.putExtra("scoreCTLA", generalScore);
                    startActivity(intent);
                }
                else
                    Toast.makeText(CircleTheLetterActivityR.this, " هەولبدەوە" , Toast.LENGTH_SHORT).show();
            }
        });

    }

    @SuppressLint("ClickableViewAccessibility")
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        Layout layout = ((TextView) v).getLayout();
        int x = (int) event.getX();
        int y = (int) event.getY();


        if (layout != null) {
            int line = layout.getLineForVertical(y);
            int offset = layout.getOffsetForHorizontal(line, x);
            String comingString = String.valueOf(layout.getText());
            String newString;
            int comingId = v.getId();
            char selectedLetter = comingString.charAt(offset);

            if (selectedLetter == 'ر') {

                if (comingId == R.id.first_cld_tv && tv1State) {
                    ctlScore++;
                    tv1State = false;
                    newString = comingString.replace("ر", "<font color=#FF0000>ر</font>");
                    ctlFirstTv.setText(Html.fromHtml(newString));
                    Toast.makeText(this, "پیرۆزە هەڵبژاردنەکەت ڕاستە", Toast.LENGTH_SHORT).show();
                } else if (comingId == R.id.second_cld_tv && tv2State) {
                    ctlScore++;
                    tv2State = false;
                    newString = comingString.replace("ر", "<font color=#FF0000>ر</font>");
                    ctlSecondTv.setText(Html.fromHtml(newString));
                    Toast.makeText(this, "پیرۆزە هەڵبژاردنەکەت ڕاستە", Toast.LENGTH_SHORT).show();
                } else if (comingId == R.id.third_cld_tv && tv3State) {
                    ctlScore++;
                    tv3State = false;
                    newString = comingString.replace("ر", "<font color=#FF0000>ر</font>");
                    ctlThirdTv.setText(Html.fromHtml(newString));
                    Toast.makeText(this, "پیرۆزە هەڵبژاردنەکەت ڕاستە", Toast.LENGTH_SHORT).show();
                } else if (comingId == R.id.forth_cld_tv && tv4State) {
                    ctlScore++;
                    tv4State = false;
                    newString = comingString.replace("ر" +
                            "" +
                            "" +
                            "", "<font color=#FF0000>ر</font>");
                    ctlForthTv.setText(Html.fromHtml(newString));
                    Toast.makeText(this, "پیرۆزە هەڵبژاردنەکەت ڕاستە", Toast.LENGTH_SHORT).show();
                }
            } else {

                if (comingId == R.id.first_cld_tv && tv1State)
                    Toast.makeText(this, "هەوڵ بدەوە داواکراو پیتی " + selectedLetter + " نەبوو", Toast.LENGTH_SHORT).show();
                else if (comingId == R.id.second_cld_tv && tv2State)
                    Toast.makeText(this, "هەوڵ بدەوە داواکراو پیتی " + selectedLetter + " نەبوو", Toast.LENGTH_SHORT).show();
                else if (comingId == R.id.third_cld_tv && tv3State)
                    Toast.makeText(this, "هەوڵ بدەوە داواکراو پیتی " + selectedLetter + " نەبوو", Toast.LENGTH_SHORT).show();
                else if (comingId == R.id.forth_cld_tv && tv4State)
                    Toast.makeText(this, "هەوڵ بدەوە داواکراو پیتی " + selectedLetter + " نەبوو", Toast.LENGTH_SHORT).show();
            }
        }
        return true;
    }
}