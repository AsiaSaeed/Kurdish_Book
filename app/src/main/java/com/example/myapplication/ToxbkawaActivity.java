package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.myapplication.Model.Wanekan;

import static com.example.myapplication.R.id.normal;

public class ToxbkawaActivity extends AppCompatActivity {

    private PaintView paintView;
    Button next;
    Button backTA;
    int scoreTA;
    int generalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toxbkawa);
        Intent intent = getIntent();
        generalScore = intent.getIntExtra("scoreCTLA", 0);

        backTA = findViewById(R.id.back_ta);
        backTA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ToxbkawaActivity.this, WanekanActivity.class);
                startActivity(intent);
            }
        });

        paintView = (PaintView) findViewById(R.id.paintView);
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        paintView.init(metrics);

        next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTA++;
                generalScore=generalScore+scoreTA;
                Toast.makeText(ToxbkawaActivity.this, "پیرۆزە کۆی گشتی: " + generalScore + " نمرە", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ToxbkawaActivity.this, BalonActivity.class);
                intent.putExtra("scoreTA",generalScore);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case normal:
                paintView.normal();
                return true;
            case R.id.emboss:
                paintView.emboss();
                return true;
            case R.id.blur:
                paintView.blur();
                return true;
            case R.id.clear:
                paintView.clear();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}