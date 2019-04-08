package com.example.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ISayActivity extends AppCompatActivity {
    Button next;

    MediaPlayer   mediaPlayer;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.i_say_main);
        next=findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             Intent intent =new Intent(ISayActivity.this,CircleTheLetterActivity.class);
             startActivity(intent);
            }
        });

}
    public void playSoundFile(Integer fileName){
        mediaPlayer = MediaPlayer.create(this, fileName);
        mediaPlayer.start();
    }

    public void dalem(View v){
        playSoundFile(R.raw.dalem);
    }

    public void d(View v){
        playSoundFile(R.raw.d);
    }
}
