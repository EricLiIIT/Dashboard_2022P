package com.example.dashboard_2022p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LiveMetricsAdapter extends RecyclerView.Adapter<LiveMetricsAdapter.ViewHolder> {

    ArrayList<LiveMetrics> liveMetricsArrayList;

    public LiveMetricsAdapter(ArrayList<LiveMetrics> liveMetricsArrayList) {
        this.liveMetricsArrayList = liveMetricsArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.logs,parent, false);

        return new ViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return liveMetricsArrayList.size();
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        LiveMetrics liveMetrics = liveMetricsArrayList.get(position);

        holder.textView.setText(liveMetrics.textView);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);
        }
    }

}
