package com.example.yooz.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ScrollContinuousAdapter extends ArrayAdapter {
    private ArrayList<Integer> list;
    private LayoutInflater inflater;

    public ScrollContinuousAdapter(@NonNull Context context, ArrayList<Integer> list){
        super(context, 0, list);
        this.list = list;
        inflater = LayoutInflater.from(context);


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = inflater.inflate(R.layout.scroll_continuous_item, parent, false);

        TextView textView = ((TextView)view.findViewById(R.id.number));
        textView.setText(String.valueOf(getItem(position)));

        return view;
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public void addAll(@NonNull Collection collection) {
        list.addAll((ArrayList<Integer>)collection);
    }



    @Override
    public void add(@Nullable Object object) {
        list.add((Integer)object);
    }
}
