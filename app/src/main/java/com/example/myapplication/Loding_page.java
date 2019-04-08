package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class Loding_page extends AppCompatActivity {
private  int  stout= 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_loding_page );
        new Handler(  ).postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent intent =new Intent( Loding_page.this, MainActivity.class );
          startActivity( intent );
          finish();
            }
        },stout);
    }
}
