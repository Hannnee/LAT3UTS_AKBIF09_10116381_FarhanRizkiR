package com.hana.myself;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class Main2Activity extends AppCompatActivity {
    ViewPager viewPager;
    SliderAdapter sliderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main2);
       viewPager = (ViewPager)findViewById(R.id.viewpager);
       sliderAdapter = new SliderAdapter(this);
       viewPager.setAdapter(sliderAdapter);

    }
    public void mulai1(View view) {
        Intent intent = new Intent(Main2Activity.this, DrawerActivity.class);
        startActivity(intent);
    }
}
