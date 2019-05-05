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

public class ProfileFragment extends Fragment {

    public ProfileFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ((DrawerActivity)getActivity()).setActionTitle("Profile");
        View v = inflater.inflate(R.layout.fragment_profile, container, false);
        CardView btn =(CardView) v.findViewById(R.id.cardTop);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fr= getFragmentManager().beginTransaction();
                fr.replace(R.id.flMain,new HomeFragment()).addToBackStack(null);
                fr.commit();
            }
        });
        return  v ;
    }

}
