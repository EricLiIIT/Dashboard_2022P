package com.example.dashboard_2022p;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.dashboard_2022p.page.PageAdapter;
import com.example.dashboard_2022p.page.PageRecord;
import com.example.dashboard_2022p.page.adapters.Dashboard;
import com.example.dashboard_2022p.page.adapters.Logs;
import com.example.dashboard_2022p.page.adapters.Profile;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager2;
    ArrayList<LiveMetrics> liveMetricsArrayList;

    PageAdapter pageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide(); // Removes top bar
        viewPager2 = findViewById(R.id.mainPage);

        // Initialization
        pageAdapter = new PageAdapter(this);

        // Page Adapter
        Dashboard dashboard = (Dashboard) pageAdapter.getPage(PageRecord.dashboard);
        Logs logs = (Logs) pageAdapter.getPage(PageRecord.logs);
        Profile profile = (Profile) pageAdapter.getPage(PageRecord.profile);
    }
}