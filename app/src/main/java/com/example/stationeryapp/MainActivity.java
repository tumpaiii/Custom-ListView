package com.example.stationeryapp;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView stationeryListView = findViewById(R.id.stationeryListView);

        // Sample data
        ArrayList<StationeryItem> items = new ArrayList<>();
        items.add(new StationeryItem("Notebook", "A5-sized ruled notebook", R.drawable.notebook));
        items.add(new StationeryItem("Pen", "Blue ink ballpoint pen", R.drawable.pen));
        items.add(new StationeryItem("Eraser", "Non-dust eraser", R.drawable.eraser));

        // Set adapter
        StationeryAdapter adapter = new StationeryAdapter(this, items);
        stationeryListView.setAdapter(adapter);
    }
}
