package com.example.yooz.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomPagerAdapter extends PagerAdapter{
    private Context context;
    private ArrayList<Integer> items = new ArrayList<>();

    public CustomPagerAdapter(@NonNull Context context){
        this.context = context;
    }

    public void add(@NonNull Integer item){
        items.add(item);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        TextView textView = new TextView(context);
        textView.setText("Page: " + position);
        textView.setTextSize(30);
        textView.setTextColor(items.get(position));
        textView.setGravity(Gravity.CENTER);
        container.addView(textView);
        return textView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}
