package com.example.myproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewItem> {
    private List<FootballTeams> FootballTeams;
    public RecyclerViewAdapter(List<FootballTeams> FootballTeams) {
        this.FootballTeams = FootballTeams;
    }

    @NonNull
    @Override
    public RecyclerViewItem onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.teamcard, parent, false);
        return new RecyclerViewItem(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewItem holder, int position) {
        holder.id.setText(FootballTeams.get(position).getId());
        holder.name.setText(FootballTeams.get(position).getName());
        holder.location.setText(FootballTeams.get(position).getLocation());
        holder.cost.setText(FootballTeams.get(position).getCost());
        holder.size.setText(String.valueOf(FootballTeams.get(position).getSize()));
    }

    @Override
    public int getItemCount() {
        return FootballTeams.size();
    }
}