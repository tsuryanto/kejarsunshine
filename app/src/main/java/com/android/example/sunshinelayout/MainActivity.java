package com.android.example.sunshinelayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mWeatherDay, mWeatherTemperature, mWeatherStatus;
    private ImageView mWeatherIcon;
    private LinearLayoutManager layoutManager;
    private RecyclerView mWeatherRv;
    private WeatherAdapter mWeatherAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mWeatherRv = (RecyclerView) findViewById(R.id.rv_weather_list);
        mWeatherIcon = (ImageView) findViewById(R.id.iv_weather_icon);
        mWeatherDay = (TextView) findViewById(R.id.tv_weather_day);
        mWeatherTemperature = (TextView) findViewById(R.id.tv_weather_temperature);
        mWeatherStatus = (TextView) findViewById(R.id.tv_weather_status);

        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
//        layoutManager = new GridLayoutManager(this, 1, LinearLayoutManager.VERTICAL, false);
        mWeatherRv.setLayoutManager(layoutManager);
        mWeatherRv.setHasFixedSize(true);
        mWeatherAdapter = new WeatherAdapter();
        mWeatherRv.setAdapter(mWeatherAdapter);
    }

}
