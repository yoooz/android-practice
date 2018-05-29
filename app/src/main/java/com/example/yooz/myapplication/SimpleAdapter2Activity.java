package com.example.yooz.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleAdapter2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listView = new ListView(this);
        setContentView(listView);

        if(listView != null){
            SimpleAdapter adapter = new SimpleAdapter(
                    this,
                    getListData(),
                    R.layout.simple_list_item_2,
                    new String[] {"no", "name"},
                    new int[]{android.R.id.text1, android.R.id.text2}
            );
            listView.setAdapter(adapter);
        }
    }


    private List<Map<String, String>> getListData(){
        List<Map<String, String>> listData = new ArrayList<>();
        listData.add(getMapData(new String[][]{{"no", "01"}, {"name", "あいうえお"}}));
        listData.add(getMapData(new String[][]{{"no", "02"}, {"name", "かきくけこ"}}));
        listData.add(getMapData(new String[][]{{"no", "03"}, {"name", "さしすせそ"}}));
        listData.add(getMapData(new String[][]{{"no", "04"}, {"name", "たちつてと"}}));
        listData.add(getMapData(new String[][]{{"no", "05"}, {"name", "なにぬねの"}}));
        listData.add(getMapData(new String[][]{{"no", "06"}, {"name", "はひふへほ"}}));
        listData.add(getMapData(new String[][]{{"no", "07"}, {"name", "まみむめも"}}));
        listData.add(getMapData(new String[][]{{"no", "08"}, {"name", "やゆよ"}}));
        listData.add(getMapData(new String[][]{{"no", "09"}, {"name", "らりるれろ"}}));
        listData.add(getMapData(new String[][]{{"no", "10"}, {"name", "わをん"}}));
        return listData;
    }

    private Map<String, String> getMapData(String[][] values){
        Map<String, String> map = new HashMap<>();
        for(String[] value: values) {
            map.put(value[0], value[1]);
        }
        return map;
    }
}
