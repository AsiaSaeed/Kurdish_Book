package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.myapplication.Adapters.RecyclerViewWaneAdapter;
import com.example.myapplication.Model.Wanekan;

import java.util.ArrayList;

public class WanekanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wanekan);
        RecyclerView recyclerView = findViewById(R.id.wane_rc);
        recyclerView.setHasFixedSize(true);
        ArrayList lessonsList=new ArrayList<Wanekan>();
        lessonsList.add(new Wanekan("وانەی ١",1,"د"));
        lessonsList.add(new Wanekan("وانەی ٢",2,"ر"));
        lessonsList.add(new Wanekan("وانەی ٣",3,"ز"));
        lessonsList.add(new Wanekan("وانەی ٤",4,"و"));
        lessonsList.add(new Wanekan("وانەی ٥",5,"ڕ"));
        lessonsList.add(new Wanekan("وانەی ٦",6,"ؤ"));
        lessonsList.add(new Wanekan("وانەی ٧",7,"ی، یا"));
        lessonsList.add(new Wanekan("وانەی ٨",8,"ئا"));
        lessonsList.add(new Wanekan("وانەی ٩",9,"ن، نا"));
        lessonsList.add(new Wanekan("وانەی ١٠",10,"ژ"));
        lessonsList.add(new Wanekan("وانەی ١١",11,"ێ"));
        lessonsList.add(new Wanekan("وانەی ١٢",12,"ب"));
        lessonsList.add(new Wanekan("وانەی ١٣",13,"س"));
        lessonsList.add(new Wanekan("وانەی ١٤",14,"وو"));
        lessonsList.add(new Wanekan("وانەی ١٥",15,"م"));
        lessonsList.add(new Wanekan("وانەی ١٦",16,"ت، تا"));
        lessonsList.add(new Wanekan("وانەی ١٧",17,"ک"));
        lessonsList.add(new Wanekan("وانەی ١٨",18,"ح"));
        lessonsList.add(new Wanekan("وانەی ١٩",19,"ش"));
        lessonsList.add(new Wanekan("وانەی ٢٠",20,"پ"));

        RecyclerViewWaneAdapter recyclerViewWaneAdapter=new RecyclerViewWaneAdapter(this,lessonsList);
        recyclerView.setAdapter(recyclerViewWaneAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
    }
}
