package com.hana.myself;



import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.support.v7.widget.CardView;
import android.view.animation.AnimationUtils;

/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment {
    private CardView cardTop;
    private CardView cardTop1;
    private CardView cardTop2;
    private CardView cardTop4;
    private CardView cardTop3;
    private HomeFragment.OnFragmentInteractionListener mListener;
    public GalleryFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((DrawerActivity)getActivity()).setActionTitle("Gallery");
        View v = inflater.inflate(R.layout.fragment_gallery, container, false);
        cardTop = v.findViewById(R.id.cardTop);
        cardTop1 = v.findViewById(R.id.cardTop1);
        cardTop2 = v.findViewById(R.id.cardTop2);
        cardTop4 = v.findViewById(R.id.cardTop4);
        cardTop3 = v.findViewById(R.id.cardTop3);
        Animation animeBottomToTop = AnimationUtils.loadAnimation(getActivity(),R.anim.anime_bottom_to_top);
        Animation animeTopToBottom = AnimationUtils.loadAnimation(getActivity(),R.anim.anime_top_to_bottom);
        Animation animeRightToleft = AnimationUtils.loadAnimation(getActivity(),R.anim.anime_right_to_left);
        Animation animeLeftToRight = AnimationUtils.loadAnimation(getActivity(),R.anim.anime_left_to_right);
        cardTop.setAnimation(animeLeftToRight);
        cardTop1.setAnimation(animeBottomToTop);
        cardTop2.setAnimation(animeRightToleft);
        cardTop4.setAnimation(animeLeftToRight);
        cardTop3.setAnimation(animeRightToleft);

        return  v ;
    }

}
