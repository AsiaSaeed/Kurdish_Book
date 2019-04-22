package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class TypeLetterActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    Button next;
    Button backTTLA;

    ImageButton bard;
    ImageButton dam;
    ImageButton prd;
    ImageButton diwar;

    int scoreTTLA;
    int generalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_letter);
        scoreTTLA=4;
        next=findViewById(R.id.next);
        backTTLA=findViewById(R.id.back_ttl);
        bard=findViewById(R.id.bard);
        dam=findViewById(R.id.dam);
        prd=findViewById(R.id.prd);
        diwar=findViewById(R.id.diwar);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generalScore = generalScore + scoreTTLA;
                Toast.makeText(TypeLetterActivity.this, "پیرۆزە کۆی گشتی: " + generalScore + " نمرە", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(TypeLetterActivity.this,RastUHalaActivity.class);
                intent.putExtra("gscore",generalScore);
                startActivity(intent);
            }
        });

        backTTLA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TypeLetterActivity.this, WanekanActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (view.getId()){
            case R.id.bard:

                break;
            case R.id.dam:
                break;
            case R.id.prd:
                break;
            case R.id.diwar:
                break;
        }
    }
}
