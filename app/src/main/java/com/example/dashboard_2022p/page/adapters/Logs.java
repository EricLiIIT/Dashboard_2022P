package com.example.dashboard_2022p.page.adapters;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.dashboard_2022p.R;

import java.util.ArrayList;
import java.util.Arrays;

public class Logs extends com.example.dashboard_2022p.page.Page {

    private ViewGroup rootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @
            Nullable Bundle SavedInstanceState) {

        // For logging
        String TAG = "Logs.java";

        rootView = (ViewGroup) inflater.inflate(R.layout.logs, container, false);

        // String array to be appended
        String[] log_entry = {"Log 1", "Log 2", "Log 3"};

        // Create a list from String Array elements
        ArrayList<String> log_entry_list = new ArrayList<String>(Arrays.asList(log_entry));

        // Rewatch video for relevant comment
        // References views? (buttons & what not)
        ListView listView = rootView.findViewById(R.id.log_list);
        Button add_log = rootView.findViewById(R.id.record_activity_btn);

        // Array adapter is used to take what's in our array and display it on the listview.
        // Listview doesn't know how to use an array, and an array can't display itself on the view
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1, log_entry_list
        );

        // DataBind ListView with items from ArrayAdapter
        listView.setAdapter(listViewAdapter);

        // Select detailed log view
        // https://www.youtube.com/watch?v=kCJv5YWHRXQ
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext().getApplicationContext(),
                        log_entry[position],
                        Toast.LENGTH_SHORT).show();

                // Start Map activity
                Intent log_detail_intent = new Intent(getContext().getApplicationContext(), LogMap.class);
//                Intent log_detail_intent = new Intent(getContext().getApplicationContext(), LogDetail.class);
//                EditText editText = (EditText) rootView.findViewById(R.id.log_entry[position]);
                // Start map activity next to log in empty space (priority)
                // add another button to view details
                startActivity(log_detail_intent);
            }
        });

        // Record Activity
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
