package com.example.dashboard_2022p.page;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.example.dashboard_2022p.MainActivity;
import com.example.dashboard_2022p.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

// Pager equivalent
public class PageAdapter {
    private final Page[] pages; // Holds
    private final ViewPager2 viewPager;
    private final PageRecord pageRecord;

    public PageAdapter(FragmentActivity activity) {
        this.viewPager = activity.findViewById(R.id.mainPage);
        TabLayout tabs = activity.findViewById(R.id.tabs);

        pageRecord = new PageRecord(activity.getSupportFragmentManager());

        tabs.removeAllTabs();
        for (int i = 0; i < pageRecord.getItemCount(); i++) {
            tabs.addTab(tabs.newTab());
        }

        pages = pageRecord.getPages();

        viewPager.setAdapter(pageRecord);

        new TabLayoutMediator(tabs, viewPager, (tab, position) -> tab.setText(pageRecord.getPage(position).getTitle())).attach();
    }

    public Page getPage(int page) { return pageRecord.getPage(page); }
}
