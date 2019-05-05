package com.hana.myself;


import android.content.Intent;
import android.media.Image;
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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MusicFragment extends Fragment {
    private CardView cardTop;
    private CardView cardTop1;
    public MusicFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((DrawerActivity)getActivity()).setActionTitle("playlist");


        View v = inflater.inflate(R.layout.fragment_music, container, false);
        cardTop = v.findViewById(R.id.cardTop);
        cardTop1 = v.findViewById(R.id.cardTop1);

        Animation animeBottomToTop = AnimationUtils.loadAnimation(getActivity(),R.anim.anime_bottom_to_top);
        Animation animeTopToBottom = AnimationUtils.loadAnimation(getActivity(),R.anim.anime_top_to_bottom);
        Animation animeRightToleft = AnimationUtils.loadAnimation(getActivity(),R.anim.anime_right_to_left);
        Animation animeLeftToRight = AnimationUtils.loadAnimation(getActivity(),R.anim.anime_left_to_right);
        cardTop.setAnimation(animeRightToleft);
        cardTop1.setAnimation(animeTopToBottom);


        ImageView btn =(ImageView) v.findViewById(R.id.imageView);
        ImageView btnn =(ImageView) v.findViewById(R.id.imageView1);
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr= getFragmentManager().beginTransaction();
                fr.replace(R.id.flMain,new VideoList()).addToBackStack(null);
                fr.commit();
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr= getFragmentManager().beginTransaction();
                fr.replace(R.id.flMain,new MusicList()).addToBackStack(null);
                fr.commit();
            }
        });
        return  v ;
    }



    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

}
