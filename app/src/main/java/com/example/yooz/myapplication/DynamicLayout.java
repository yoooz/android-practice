package com.example.yooz.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DynamicLayout extends AppCompatActivity implements View.OnClickListener{

    private LinearLayout layout;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_layout);

        layout = findViewById(R.id.linear_layout);
        setupLayout();

    }

    private void setupLayout(){
        findViewById(R.id.add).setOnClickListener(this);
        findViewById(R.id.remove).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.add:
                counter+=1;
                TextView view = new TextView(this);
                view.setText("counter :" + counter);
                view.setWidth(layout.getWidth());
                view.setGravity(Gravity.CENTER_HORIZONTAL);
                layout.addView(view);
                break;
            case R.id.remove:
                if(counter > 0){
                    layout.removeViewAt(counter);
                    counter-=1;
                }
                break;
        }
    }


}
