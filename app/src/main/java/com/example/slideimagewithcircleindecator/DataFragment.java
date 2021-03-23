package com.example.slideimagewithcircleindecator;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.slideimagewithcircleindecator.Adapter.Adapter;
import com.example.slideimagewithcircleindecator.Model.DataModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DataFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DataFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ViewPager viewPager;
    ArrayList<DataModel> dataHolder;

    public DataFragment() {
        // Required empty public constructor
    }


    public static DataFragment newInstance(String param1, String param2) {
        DataFragment fragment = new DataFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.fragment_data, container, false);
        viewPager= view.findViewById(R.id.viewPager);
        viewPager.setAdapter(new Adapter(this));
        dataHolder = new ArrayList<>();
        DataModel ob1 = new DataModel(R.drawable.slide1);
        dataHolder.add(ob1);
        DataModel ob2 = new DataModel(R.drawable.slide2);
        dataHolder.add(ob2);
        DataModel ob3 = new DataModel(R.drawable.slide3);
        dataHolder.add(ob3);

        return  view;
    }
}