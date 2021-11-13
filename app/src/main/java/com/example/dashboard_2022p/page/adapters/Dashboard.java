package com.example.dashboard_2022p.page.adapters;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.dashboard_2022p.R;

public class Dashboard extends com.example.dashboard_2022p.page.Page {
    @NonNull
    @Override
    public String getTitle() {
        return "Dashboard";
    }

    private ViewGroup rootView;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @
            Nullable Bundle SavedInstanceState) {
        rootView = (ViewGroup) inflater.inflate(R.layout.dashboard, container, false);
        return rootView;
    }
}
