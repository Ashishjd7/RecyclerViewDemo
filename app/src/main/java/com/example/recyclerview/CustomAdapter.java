package com.example.recyclerview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyviewHolder> //parent class reference is needed to call child class
{
    Activity activity;

    //these are instance variable
    Integer[] pictures;
    String[]  names;
    String[]  details;

    //this constructor holds local variable
    //the constructor get its data from the main activity & pass it into instance var
    public CustomAdapter(Activity activity, Integer[] pictures, String[] names, String[] details)
    {
       this.activity = activity;
       this.pictures = pictures;
       this.names = names;
       this.details = details;
    }

    @NonNull
    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View vv = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_layout,parent,false);
        MyviewHolder mvh = new MyviewHolder(vv);
        return mvh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolder holder, int position)
    {
        holder.imageView.setImageResource(pictures[position]);
        holder.t1.setText(names[position]);
        holder.t2.setText(details[position]);

    }

    @Override
    public int getItemCount()
    {
        return names.length;
    }

    public class MyviewHolder extends RecyclerView.ViewHolder
   {
       ImageView imageView;
       TextView t1,t2;

       public MyviewHolder(@NonNull View v)
       {
           super(v);
           imageView = v.findViewById(R.id.rimageView);
           t1 =v.findViewById(R.id.rtview1);
           t2 =v.findViewById(R.id.rtview2);
       }
   }
}
