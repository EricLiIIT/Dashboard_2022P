package com.example.dashboard_2022p.page.adapters;

import android.os.Bundle;
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

    Button btn;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @
            Nullable Bundle SavedInstanceState) {

        rootView = (ViewGroup) inflater.inflate(R.layout.logs, container, false);

        // array to be displayed
        String[] log_entry = {"Log 1", "Log 2", "Log 3"};

        ListView listView = (ListView) rootView.findViewById(R.id.log_list);

        // Array adapter is used to take what's in our array and display it on the listview.
        // Listview doesn't know how to use an array, and an array can't display itself on the view
        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1, log_entry
        );

        listView.setAdapter(listViewAdapter);
//        // Get reference of widgets from XML layout
//        final ListView lv = (ListView) findViewById(R.id.lv);
//        final Button btn = (Button) findViewById(R.id.btn);
//
        // Initializing a new String Array
//        String[] fruits = new String[] {
//                "Cape Gooseberry",
//                "Capuli cherry"
//        };
//
//        // Create a List from String Array elements
//        List<String> fruits_list = new ArrayList<String>(Arrays.asList(fruits));

//        // Create an ArrayAdapter from List
//        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
//                (this, android.R.layout.simple_list_item_1, fruits_list);
//
//        // DataBind ListView with items from ArrayAdapter
//        lv.setAdapter(arrayAdapter);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Add new Items to List
//                fruits_list.add("Loquat");
//                fruits_list.add("Pear");
//                /*
//                    notifyDataSetChanged ()
//                        Notifies the attached observers that the underlying
//                        data has been changed and any View reflecting the
//                        data set should refresh itself.
//                 */
////                arrayAdapter.notifyDataSetChanged();
//            }
//        });
        return rootView;
    }

    @NonNull
    @Override
    public String getTitle() {
        return "Logs";
    }
}
