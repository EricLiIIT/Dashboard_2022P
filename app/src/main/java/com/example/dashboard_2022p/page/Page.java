package com.example.dashboard_2022p.page;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public abstract class Page extends Fragment {

    public abstract @NonNull
    String getTitle();

    public void onPageChange(boolean enter) {

    }
}
