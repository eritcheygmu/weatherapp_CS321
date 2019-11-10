package com.example.weatherapp_cs321;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(new CustomPagerAdapter(this));

        /*
        SuggestionCalculation suggestCalc = new SuggestionCalculation();
        //TODO dummy data:
        suggestCalc.suggestion(65,15,15,6,"sunny");
        //feed output to somehow restrict pages output to viewpager.
         */

    }
}
