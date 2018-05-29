package com.example.yooz.myapplication;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SampleListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listView = new ListView(this);
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        setContentView(listView);

        String[] items = new String[] {"あいうえお", "かきくけこ",
                "さしすせそ", "たいつてと", "なにぬねの", "はひふへほ",
                "まみむめも", "やゆよ", "らりるれろ", "わをん"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getApplicationContext(),
                R.layout.simple_list_view,
                items
        );
        listView.setAdapter(adapter);

        listView.setItemChecked(2, true);
    }
}
