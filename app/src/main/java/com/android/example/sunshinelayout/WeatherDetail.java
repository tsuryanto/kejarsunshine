package com.android.example.sunshinelayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by user on 13/08/2017.
 */

public class WeatherDetail extends AppCompatActivity {
    private TextView mTest;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_detail);

        mTest = (TextView) findViewById(R.id.tv_detail_test);
        mTest.setText("Oke");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
