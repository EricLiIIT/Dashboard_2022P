package com.example.dashboard_2022p.page.adapters;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.dashboard_2022p.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logs extends com.example.dashboard_2022p.page.Page {

    private ViewGroup rootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @
            Nullable Bundle SavedInstanceState) {

        // For logging
        String TAG = "MyActivity";

        rootView = (ViewGroup) inflater.inflate(R.layout.logs, container, false);

        // String array to be appended
        String[] log_entry = {"Log 1", "Log 2", "Log 3"};

        // Create a list from String Array elements
        ArrayList<String> log_entry_list = new ArrayList<String>(Arrays.asList(log_entry));

        // Rewatch video for relevant comment
        // References views? (buttons & what not)
        ListView listView = (ListView) rootView.findViewById(R.id.log_list);
        Button add_log = (Button) rootView.findViewById(R.id.record_activity_btn);

        // Array adapter is used to take what's in our array and display it on the listview.
        // Listview doesn't know how to use an array, and an array can't display itself on the view
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1, log_entry_list
        );

        // DataBind ListView with items from ArrayAdapter
        listView.setAdapter(listViewAdapter);

        add_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add new Items to List
                log_entry_list.add("Log 4");
                log_entry_list.add("Pear");
                /*
                    notifyDataSetChanged ()
                        Notifies the attached observers that the underlying
                        data has been changed and any View reflecting the
                        data set should refresh itself.
                 */
                listViewAdapter.notifyDataSetChanged();
                Log.i(TAG, "Recording Activity");
            }
        });
        return rootView;
    }
    // TODO: add log detail page, code new class that includes log data
    @NonNull
    @Override
    public String getTitle() {
        return "Logs";
    }
}
