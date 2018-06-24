package com.example.yooz.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FakeHiddenMenuActivity extends AppCompatActivity implements View.OnClickListener{
    private ScrollView scrollView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_hidden_menu);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                createItems()
        );

        findViewById(R.id.text_view).setOnClickListener(this);

        scrollView = findViewById(R.id.scroll_view);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });
    }

    private List<String> createItems(){
        List<String> result = new ArrayList<>();
        for(int i = 0;i<100; i++){
            result.add("item ---" + i);
        }

        return result;
    }

    @Override
    public void onClick(View v) {

        if(scrollView.getScrollY() == 0) {
            scrollView.setScrollY(442);

        }else {
            scrollView.setScrollY(0);
        }
        Toast.makeText(this, String.valueOf(scrollView.getScrollY()), Toast.LENGTH_SHORT).show();
    }
}



