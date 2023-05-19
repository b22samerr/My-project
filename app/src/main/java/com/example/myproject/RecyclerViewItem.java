package com.example.myproject;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewItem extends RecyclerView.ViewHolder {
    public TextView id;
    public TextView name;
    public TextView location;
    public TextView size;
    public TextView cost;

    public RecyclerViewItem(@NonNull View itemView) {
        super(itemView);
        id = itemView.findViewById(R.id.item_id);
        name = itemView.findViewById(R.id.item_name);
        location = itemView.findViewById(R.id.item_location);
        size = itemView.findViewById(R.id.item_size);

    }
}