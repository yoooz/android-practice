package com.example.yooz.myapplication;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewFragment extends Fragment {
    private static final String KEY_ARG_NUMBER = "ARG_NUMBER";

    public static ListViewFragment newInstance(int number){
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_ARG_NUMBER, number);
        ListViewFragment fragment = new ListViewFragment();
        fragment.setArguments(bundle);

        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_view_fragment, container, false);
        int number = 0;
        Bundle bundle = getArguments();
        if(bundle != null){
            number = bundle.getInt(KEY_ARG_NUMBER);
        }
        ListView listView = view.findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getContext(),
                android.R.layout.simple_list_item_1,
                createData(number)
        );
        listView.setAdapter(adapter);

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

    public ArrayList<String> createData(int number){
        ArrayList<String> data = new ArrayList<>();
        for(int i=1;i<=20;i++){
            data.add("Item" + number + "-" + i);
        }
        return data;
    }

}
