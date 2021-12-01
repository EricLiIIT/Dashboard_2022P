package com.example.dashboard_2022p.page.adapters;

import android.content.Context;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.dashboard_2022p.MainActivity;
import com.example.dashboard_2022p.R;

public class Profile extends com.example.dashboard_2022p.page.Page {

    private ViewGroup rootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @
            Nullable Bundle SavedInstanceState) {
        rootView = (ViewGroup) inflater.inflate(R.layout.profile, container, false);

        String TAG = "MyActivity";

        ImageView wet_btn = (ImageView) rootView.findViewById(R.id.wet);
        ImageView dry_btn = (ImageView) rootView.findViewById(R.id.dry);
        ImageView turbo_btn = (ImageView) rootView.findViewById(R.id.turbo);
        ImageView enduro_btn = (ImageView) rootView.findViewById(R.id.endurance);
        ImageView agility_btn = (ImageView) rootView.findViewById(R.id.agility);

        wet_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // How to get context for toast message?
                Log.i(TAG,"Wet Profile Enabled");
            }
        });

        dry_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // How to get context for toast message?
                Log.i(TAG,"Dry Profile Enabled");
            }
        });

        turbo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // How to get context for toast message?
                Log.i(TAG,"Pedal to the metal");
            }
        });

        enduro_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // How to get context for toast message?
                Log.i(TAG,"Enduro Profile Enabled");
            }
        });

        agility_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // How to get context for toast message?
                Log.i(TAG,"Agility Profile Enabled");
            }
        });

        return rootView;
    }

    @NonNull
    @Override
    public String getTitle() {
        return "Profile";
    }

}
