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

        String TAG = "Profile.java";

        ImageView wet_btn = rootView.findViewById(R.id.wet);
        ImageView dry_btn = rootView.findViewById(R.id.dry);
        ImageView turbo_btn = rootView.findViewById(R.id.turbo);
        ImageView enduro_btn = rootView.findViewById(R.id.endurance);
        ImageView agility_btn = rootView.findViewById(R.id.agility);

        // TODO: pair buttons with values on Teensy
        wet_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext().getApplicationContext(), "Wet Profile Enabled",
                        Toast.LENGTH_SHORT).show();
                Log.i(TAG,"Wet Profile Enabled");
            }
        });

        dry_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext().getApplicationContext(), "Dry Profile Enabled",
                        Toast.LENGTH_SHORT).show();
                Log.i(TAG,"Dry Profile Enabled");
            }
        });

        turbo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext().getApplicationContext(), "PEDAL TO THE METAL",
                        Toast.LENGTH_SHORT).show();
                Log.i(TAG,"Pedal to the metal");
            }
        });

        // Optimize battery discharge
        enduro_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext().getApplicationContext(), "Enduro Profile Enabled",
                        Toast.LENGTH_SHORT).show();
                Log.i(TAG,"Enduro Profile Enabled");
            }
        });

        agility_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext().getApplicationContext(), "Agility Profile Enabled",
                        Toast.LENGTH_SHORT).show();
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
