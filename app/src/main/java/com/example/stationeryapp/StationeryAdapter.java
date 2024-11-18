package com.example.stationeryapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class StationeryAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<StationeryItem> items;

    public StationeryAdapter(Context context, ArrayList<StationeryItem> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        }

        StationeryItem currentItem = (StationeryItem) getItem(position);

        ImageView itemImage = convertView.findViewById(R.id.itemImage);
        TextView itemName = convertView.findViewById(R.id.itemName);
        TextView itemDescription = convertView.findViewById(R.id.itemDescription);

        itemImage.setImageResource(currentItem.getImageResId());
        itemName.setText(currentItem.getName());
        itemDescription.setText(currentItem.getDescription());

        return convertView;
    }
}

