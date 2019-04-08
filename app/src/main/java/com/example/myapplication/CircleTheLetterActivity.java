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

public class CircleTheLetterActivity extends AppCompatActivity implements View.OnTouchListener {
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

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_the_letter);
        ctlFirstTv = findViewById(R.id.first_cld_tv);
        ctlSecondTv = findViewById(R.id.second_cld_tv);
        ctlThirdTv = findViewById(R.id.third_cld_tv);
        ctlForthTv = findViewById(R.id.forth_cld_tv);
        ctlFirstTv.setOnTouchListener(this);
        ctlSecondTv.setOnTouchListener(this);
        ctlThirdTv.setOnTouchListener(this);
        ctlForthTv.setOnTouchListener(this);
        next=findViewById(R.id.next_ctl);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CircleTheLetterActivity.this,ToxbkawaActivity.class);
                startActivity(intent);
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

            if (selectedLetter == 'د') {

                if (comingId == R.id.first_cld_tv && tv1State) {
                    ctlScore++;
                    tv1State = false;
                    newString = comingString.replace("د","<font color=#FF0000>د</font>");
                    ctlFirstTv.setText(Html.fromHtml(newString));
                    Toast.makeText(this, "پیرۆزە هەڵبژاردنەکەت ڕاستە", Toast.LENGTH_SHORT).show();
                } else if (comingId == R.id.second_cld_tv && tv2State) {
                    ctlScore++;
                    tv2State = false;
                    newString = comingString.replace("د","<font color=#FF0000>د</font>");
                    ctlSecondTv.setText(Html.fromHtml(newString));
                    Toast.makeText(this, "پیرۆزە هەڵبژاردنەکەت ڕاستە", Toast.LENGTH_SHORT).show();
                } else if (comingId == R.id.third_cld_tv && tv3State) {
                    ctlScore++;
                    tv3State = false;
                    newString = comingString.replace("د","<font color=#FF0000>د</font>");
                    ctlThirdTv.setText(Html.fromHtml(newString));
                    Toast.makeText(this, "پیرۆزە هەڵبژاردنەکەت ڕاستە", Toast.LENGTH_SHORT).show();
                } else if (comingId == R.id.forth_cld_tv && tv4State) {
                    ctlScore++;
                    tv4State = false;
                    newString = comingString.replace("د","<font color=#FF0000>د</font>");
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