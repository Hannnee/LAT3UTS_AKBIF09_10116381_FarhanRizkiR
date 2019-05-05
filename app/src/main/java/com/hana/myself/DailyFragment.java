package com.hana.myself;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class DailyFragment extends Fragment {
    private CardView cardTop;
    private CardView cardTop1;

    public DailyFragment() {

    }




    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ((DrawerActivity)getActivity()).setActionTitle("Daily");
        View v = inflater.inflate(R.layout.fragment_daily, container, false);
        cardTop = v.findViewById(R.id.cardTop);
        cardTop1 = v.findViewById(R.id.cardTop1);
        Animation animeBottomToTop = AnimationUtils.loadAnimation(getActivity(),R.anim.anime_bottom_to_top);
        Animation animeTopToBottom = AnimationUtils.loadAnimation(getActivity(),R.anim.anime_top_to_bottom);
        Animation animeRightToleft = AnimationUtils.loadAnimation(getActivity(),R.anim.anime_right_to_left);
        Animation animeLeftToRight = AnimationUtils.loadAnimation(getActivity(),R.anim.anime_left_to_right);
        cardTop.setAnimation(animeLeftToRight);
        cardTop1.setAnimation(animeRightToleft);

        ImageView btn =(ImageView) v.findViewById(R.id.imageView);
        ImageView btnn =(ImageView) v.findViewById(R.id.imageView1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr= getFragmentManager().beginTransaction();
                fr.replace(R.id.flMain,new DailyActivity()).addToBackStack(null);
                fr.commit();
            }
        });
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr= getFragmentManager().beginTransaction();
                fr.replace(R.id.flMain,new FriendList()).addToBackStack(null);
                fr.commit();
            }
        });
        return  v ;
    }

    }


