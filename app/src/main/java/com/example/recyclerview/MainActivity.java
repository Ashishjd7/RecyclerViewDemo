package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;

import java.util.List;

public class MainActivity extends AppCompatActivity
{
    RecyclerView recyclerView;

    String[] names = {"A","B","C","D"};
    String[] details = {"Aaa \n 1","Bbb \n 2","Ccc \n 3","Ddd \n 4"};
    Integer[] pictures = {R.drawable.a,R.drawable.c,R.drawable.d,R.drawable.e};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rView);

        CustomAdapter ca = new CustomAdapter(this,pictures,names,details);


       // LinearLayoutManager llm = new LinearLayoutManager(this,
        // LinearLayoutManager.HORIZONTAL, false);
        
        GridLayoutManager llm = new GridLayoutManager(this,2,
                RecyclerView.VERTICAL,false);

        recyclerView.setLayoutManager(llm);
        recyclerView.setAdapter(ca);


    }
}
