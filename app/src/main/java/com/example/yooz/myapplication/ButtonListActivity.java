package com.example.yooz.myapplication;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

public class ButtonListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_list);

        Toolbar myToolBar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolBar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Button List");
        actionBar.setDisplayHomeAsUpEnabled(true);

        LinearLayout parent = findViewById(R.id.scroll_content);
        LayoutInflater inf = LayoutInflater.from(this);

        for(int i=0;i<20;i++){
            inf.inflate(R.layout.scroll_child, parent, true);
        }
    }
}
