package com.example.myapplication;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=(TabLayout)findViewById(R.id.tablayout_id);
        viewPager=(ViewPager)findViewById(R.id.viewpager_id);
        mDrawerLayout = findViewById(R.id.drawer_layout);
    //butooon ee menuuuuuuu
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu_w_24dp);

        View_Page_Adpt_c adpt_c=new View_Page_Adpt_c(getSupportFragmentManager());
        adpt_c.AddFragment(new book_tab_c(),"کتێبەکان");
        adpt_c.AddFragment(new wanakan_tab_c(),"وانەکان");
        adpt_c.AddFragment(new actv_tab_c(),"چالاکیەکان");

        viewPager.setAdapter(adpt_c);
        tabLayout.setupWithViewPager(viewPager);
    }

//   slecte menu  la page ra2ese
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}