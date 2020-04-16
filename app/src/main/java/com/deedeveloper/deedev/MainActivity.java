package com.deedeveloper.deedev;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.LinearLayout;

import com.deedeveloper.deedev.Adapters.ItemAdapters;
import com.deedeveloper.deedev.Models.ItemModels;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView1);

        ArrayList <ItemModels> list = new ArrayList<>();

        list.add(new ItemModels(R.drawable.splash_logo, "img 1"));
        list.add(new ItemModels(R.drawable.splash_logo, "img 2"));
        list.add(new ItemModels(R.drawable.splash_logo, "img 3"));
        list.add(new ItemModels(R.drawable.splash_logo, "img 4"));
        list.add(new ItemModels(R.drawable.splash_logo, "img 5"));
        list.add(new ItemModels(R.drawable.splash_logo, "img 6"));
        list.add(new ItemModels(R.drawable.splash_logo, "img 7"));
        list.add(new ItemModels(R.drawable.splash_logo, "img 8"));

        ItemAdapters adapters = new ItemAdapters(list,this);
        recyclerView.setAdapter(adapters);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4);
        recyclerView.setLayoutManager(gridLayoutManager);

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);

//        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false);
//        recyclerView.setLayoutManager(layoutManager);

    }
}
