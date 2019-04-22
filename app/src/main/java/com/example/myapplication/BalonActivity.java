package com.example.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BalonActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    Button nextBA;
    int scoreBalon;
    int generalScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balon);
        Intent intent=getIntent();
        generalScore=intent.getIntExtra("scoreTA",0);

        nextBA=findViewById(R.id.next_ba);
        nextBA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreBalon++;
                generalScore=generalScore+scoreBalon;
                Toast.makeText(BalonActivity.this, "پیرۆزە کۆی گشتی: " + generalScore + " نمرە", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(BalonActivity.this,SelectTheLetterActivity.class);
                intent.putExtra("scoreBA",generalScore);
                startActivity(intent);
            }
        });
    }
    public void playSoundFile(Integer fileName){
        mediaPlayer = MediaPlayer.create(this, fileName);
        mediaPlayer.start();
    }

    public void rangakanble(View v){

            playSoundFile(R.raw.rangakan_bbenaw_ble);


    }
    public void mor(View v){

        playSoundFile(R.raw.purple);
    }
    public void sur(View v){

        playSoundFile(R.raw.red);
    }
    public void narnje(View v){

        playSoundFile(R.raw.orange);

    }
    public void pamayi(View v){

        playSoundFile(R.raw.pink);

    }
    public void zard(View v){

        playSoundFile(R.raw.yellow);

    }
    public void sawz(View v){

        playSoundFile(R.raw.green);

    }
}
