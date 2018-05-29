package com.example.yooz.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MyFragment extends Fragment {
    private static final String KEY_ARG_NUMBER = "ARG_NUMBER";

    public static MyFragment newInstance(int number){
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_ARG_NUMBER, number);
        MyFragment fragment = new MyFragment();
        fragment.setArguments(bundle);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_fragment, container, false);
        int number = 0;
        Bundle bundle = getArguments();
        if(bundle != null){
            number = bundle.getInt(KEY_ARG_NUMBER);
        }
        ViewPager viewPager = view.findViewById(R.id.fragment_view_pager);
        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(this.getFragmentManager());
        adapter.add(1);
        adapter.add(2);
        adapter.add(3);
        viewPager.setAdapter(adapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int number = 0;
        Bundle bundle = getArguments();
        if(bundle != null){
            number = bundle.getInt(KEY_ARG_NUMBER);
        }
    }
}
