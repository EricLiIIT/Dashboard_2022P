package com.example.dashboard_2022p.page;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.dashboard_2022p.MainActivity;
import com.example.dashboard_2022p.R;

// Pager equivalent
public class PageAdapter {
    private final Page[] pages; // Holds
    private final ViewPager2 viewPager;
    private final PageRecord pageRecord;

    public PageAdapter(FragmentActivity activity) {
        this.viewPager = activity.findViewById(R.id.mainPage);

        pageRecord = new PageRecord(activity.getSupportFragmentManager());
        pages = pageRecord.getPages();
    }

    public Page getPage(int page) { return pageRecord.getPage(page); }
}
