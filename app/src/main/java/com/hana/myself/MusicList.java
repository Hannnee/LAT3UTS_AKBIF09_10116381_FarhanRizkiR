package com.hana.myself;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MusicList extends Fragment {

    public MusicList() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ((DrawerActivity)getActivity()).setActionTitle("Music List");
       View v = inflater.inflate(R.layout.fragment_music_list, container, false);
       return v;
    }

}
