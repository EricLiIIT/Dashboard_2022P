package com.example.dashboard_2022p;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.example.dashboard_2022p.page.PageAdapter;
import com.example.dashboard_2022p.page.PageRecord;
import com.example.dashboard_2022p.page.adapters.Dashboard;
import com.example.dashboard_2022p.page.adapters.Logs;
import com.example.dashboard_2022p.page.adapters.Profile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager2;
    ArrayList<LiveMetrics> liveMetricsArrayList;

    PageAdapter pageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Remove top bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

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