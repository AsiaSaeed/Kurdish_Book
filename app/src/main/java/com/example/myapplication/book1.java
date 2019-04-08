package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class book1 extends AppCompatActivity {
PDFView bookone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book1);
        bookone=(PDFView)findViewById(R.id.pdfv);
        bookone.fromAsset("warzi1.pdf").load();

    }
}
