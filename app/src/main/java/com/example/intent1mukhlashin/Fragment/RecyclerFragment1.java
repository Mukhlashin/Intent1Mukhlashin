package com.example.intent1mukhlashin.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.intent1mukhlashin.Adapter.RecyclerAdapter1;
import com.example.intent1mukhlashin.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerFragment1 extends Fragment {

    RecyclerView rv1;
    RecyclerAdapter1 adapter;


    public RecyclerFragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View layout = inflater.inflate(R.layout.fragment_recycler1, container, false);
        return
    }

}
