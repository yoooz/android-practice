package com.example.yooz.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupLayout();

    }

    private void setupLayout() {
        findViewById(R.id.next).setOnClickListener(this);
        findViewById(R.id.web).setOnClickListener(this);
        findViewById(R.id.send).setOnClickListener(this);
        findViewById(R.id.linear_layout).setOnClickListener(this);
        findViewById(R.id.dynamic_layout).setOnClickListener(this);
        findViewById(R.id.scroll_layout).setOnClickListener(this);
        findViewById(R.id.button_list).setOnClickListener(this);
        findViewById(R.id.map).setOnClickListener(this);
        findViewById(R.id.sample_list_view).setOnClickListener(this);
        findViewById(R.id.simple_list_view_2).setOnClickListener(this);
        findViewById(R.id.fragment).setOnClickListener(this);
        findViewById(R.id.view_pager).setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.next:
                intent = new Intent(MainActivity.this, NextActivity.class);
                startActivity(intent);
                break;
            case R.id.web:
                Uri uri = Uri.parse("https://www.google.com/");
                intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                break;
            case R.id.send:
                intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, "Hello Send Action");
                intent.setType("text/plain");
                startActivity(intent);
                break;
            case R.id.linear_layout:
                intent = new Intent(MainActivity.this, LinearLayoutActivity.class);
                startActivity(intent);
                break;
            case R.id.dynamic_layout:
                intent = new Intent(MainActivity.this, DynamicLayout.class);
                startActivity(intent);
                break;
            case R.id.scroll_layout:
                intent = new Intent(MainActivity.this, Scroll.class);
                startActivity(intent);
                break;
            case R.id.button_list:
                intent = new Intent(MainActivity.this, ButtonListActivity.class);
                startActivity(intent);
                break;
            case R.id.map:
                intent = new Intent(MainActivity.this, MapActivity.class);
                startActivity(intent);
                break;
            case R.id.sample_list_view:
                intent = new Intent(this, SampleListViewActivity.class);
                startActivity(intent);
                break;
            case R.id.simple_list_view_2:
                intent = new Intent(this, SimpleAdapter2Activity.class);
                startActivity(intent);
                break;
            case R.id.fragment:
                intent = new Intent(this, FragmentPagerActivity.class);
                startActivity(intent);
                break;
            case R.id.view_pager:
                intent = new Intent(this, MyPager.class);
                startActivity(intent);
                break;
        }
    }
}
