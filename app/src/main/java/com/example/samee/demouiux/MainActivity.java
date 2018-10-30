package com.example.samee.demouiux;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        vp.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(vp);
    }


    class MyPagerAdapter extends FragmentPagerAdapter {
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }


        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "TAB 1";
                case 1:
                    return "TAB 2";
                case 2:
                    return "TAB 3";
            }
            return "";
        }

        @Override
        public Fragment getItem(int i) {
            switch (i) {
                case 0:
                    return new FragmentA();
                case 1:
                    return new FragmentB();
                case 2:
                    return new FragmentC();
            }
            return null;
        }



        @Override
        public int getCount() {
            return 3;
        }
    }

}

