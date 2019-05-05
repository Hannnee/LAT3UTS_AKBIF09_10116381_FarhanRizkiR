package com.hana.myself;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class DailyActivity extends Fragment {
    private CardView dailyactiv;



    public DailyActivity() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ((DrawerActivity)getActivity()).setActionTitle("Daily Activity");
        return inflater.inflate(R.layout.fragment_daily_actv, container, false);
    }

}
