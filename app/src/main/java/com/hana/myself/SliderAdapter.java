package com.hana.myself;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.content.Context;

import static android.view.animation.AnimationUtils.*;

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;
    public int[] imageArray = {R.drawable.image_1,R.drawable.image_2,R.drawable.image_3,R.drawable.image_4};
    public String[] tittleArray = {"MyApps","Self","Tell Everything","Save"};
    public String[] deskriptionarray = {"Let's Tell About Me","Know Your Self","Tell Everything in Here","Save Your Life Story Here"};
    public int[] backgroundarray = {Color.rgb(39,174,96)
                                        ,Color.rgb(239,85,85)
                                        ,Color.rgb(110,49,89)
                                        ,Color.rgb(1,188,212)};

    public SliderAdapter (Context context)
    {
    this.context = context;
    }
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view==object);
    }

    @Override
    public int getCount() {
        return tittleArray.length;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slider,container,false);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.relative);
        ImageView imageView = (ImageView)view.findViewById(R.id.slideimg);
        TextView t1_title = (TextView)view.findViewById(R.id.txtTitle);
        TextView t2_desc = (TextView)view.findViewById(R.id.txtDescription);
        relativeLayout.setBackgroundColor(backgroundarray[position]);
        imageView.setImageResource(imageArray[position]);
        t1_title.setText(tittleArray[position]);
        t2_desc.setText(deskriptionarray[position]);
        container.addView(view);
        return view;

    }
}
