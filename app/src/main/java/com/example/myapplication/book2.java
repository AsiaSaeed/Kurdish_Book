package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class book2 extends AppCompatActivity {
PDFView b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book2);

        b=(PDFView)findViewById(R.id.pdfv);
        b.fromAsset("warzi2.pdf").load();

    }
}
