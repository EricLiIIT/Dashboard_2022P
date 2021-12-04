package com.example.dashboard_2022p.page.adapters;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

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

        // For logging
        String TAG = "Dashboard.java";

        ImageView menu_btn = rootView.findViewById(R.id.menu);
        menu_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext().getApplicationContext(), "Menu Button Pressed",
                        Toast.LENGTH_SHORT).show();
                Log.i(TAG, "Menu Button Pressed");
            }
        });
        return rootView;
    }
}
