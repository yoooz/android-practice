package com.example.yooz.myapplication;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AbsListView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ScrollContinuousActivity extends AppCompatActivity implements AbsListView.OnScrollListener{
    private ListView listView;
    private int count;
    private AddListThread addListThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_continuous);
        count = 0;

        ScrollContinuousAdapter adapter = new ScrollContinuousAdapter(this,
                new ArrayList<Integer>());

        listView = findViewById(R.id.listview);
        listView.setAdapter(adapter);
        listView.setOnScrollListener(this);
        addListThread = new AddListThread(0, 0, count++);
        addListThread.start();
    }

    private class AddListThread extends Thread{
        private Handler handler;
        private int y;
        private int position;
        private int start;

        private AddListThread(int position, int y, int start){
            this.position = position;
            this.y = y;
            handler = new Handler();
            this.start = start;
        }

        @Override
        public void run() {
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            handler.post(new Runnable() {
                @Override
                public void run() {
                    ArrayList<Integer> list = new ArrayList<>();
                    for(int i = 0;i<10;i++){
                        list.add(start+i);
                    }
                    ScrollContinuousAdapter adapter = ((ScrollContinuousAdapter)listView.getAdapter());
                    adapter.addAll(list);
                    listView.setAdapter(adapter);
                    listView.setSelectionFromTop(position, y);
                }
            });
        }
    }

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {

    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        if(totalItemCount == 0){
            return ;
        }

        if(totalItemCount == firstVisibleItem + visibleItemCount && !addListThread.isAlive()) {
            int position = listView.getFirstVisiblePosition();
            int y = listView.getChildAt(0).getTop();
            addListThread = new AddListThread(position, y, count++);
            addListThread.start();
        }

    }
}
