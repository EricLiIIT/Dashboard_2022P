package com.example.dashboard_2022p.page;

import android.util.Log;

import androidx.annotation.IntDef;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.dashboard_2022p.page.adapters.Dashboard;
import com.example.dashboard_2022p.page.adapters.Logs;
import com.example.dashboard_2022p.page.adapters.Profile;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Retains app pages
// PageManager equivalent
public class PageRecord extends FragmentStateAdapter {

    @Retention(RetentionPolicy.SOURCE)
    @IntDef({
            dashboard,
            logs,
            profile,
    })
    @interface PageIndex {
    }

    public static final int dashboard = 0;
    public static final int logs = 1;
    public static final int profile = 2;

    private final Page[] pages = new Page[3];

    public Page[] getPages() {
        return pages;
    }

    public Page getPage(@PageIndex int page) {
        return pages[page];
    }

    public PageRecord(@NonNull FragmentManager fragmentManager) {
        super(fragmentManager, new Lifecycle() {
            @Override
            public void addObserver(@NonNull LifecycleObserver observer) {

            }

            @Override
            public void removeObserver(@NonNull LifecycleObserver observer) {

            }

            @NonNull
            @Override
            public State getCurrentState() {
                return State.STARTED;
            }
        });

        /* Pages go here */
        pages[dashboard] = new Dashboard();
        pages[logs] = new Logs();
        pages[profile] = new Profile();
    }

    @NonNull
    @Override
    public Fragment createFragment(@PageIndex int page) {
        return pages[page];
    }

    @Override
    public int getItemCount() {
        return pages.length; // Quantity of pages
    }
}
