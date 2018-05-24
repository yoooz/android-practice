package com.example.yooz.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class Scroll extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);
        LinearLayout scroll = findViewById(R.id.scroll);
        LayoutInflater inf = LayoutInflater.from(this);
        for(int i=0;i<100;i++){
            inf.inflate(R.layout.scroll_child, scroll, true);

        }
    }
}
