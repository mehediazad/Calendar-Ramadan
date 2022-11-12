package com.example.ramadan_time;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdopter extends RecyclerView.Adapter<MyAdopter.MyViewHolder> {

    private ArrayList<User> ramadanList;

    public MyAdopter(ArrayList<User> ramadanList) {
        this.ramadanList = ramadanList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView ramadanNoTextview, monthNameTextView, dayNameTextView, sheheriTextView, ifterTextView;

        public MyViewHolder(@NonNull final View itemView) {
            super(itemView);
            ramadanNoTextview = itemView.findViewById(R.id.txtRamadanNo);
            monthNameTextView = itemView.findViewById(R.id.txtMonth);
            dayNameTextView   = itemView.findViewById(R.id.txtDay);
            sheheriTextView   = itemView.findViewById(R.id.txtSeheri);
            ifterTextView     = itemView.findViewById(R.id.txtIftar);

        }
    }

    @NonNull
    @Override
    public MyAdopter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.childlayout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdopter.MyViewHolder holder, int position) {

        User user = ramadanList.get(position);

        holder.ramadanNoTextview.setText(String.valueOf (user.getRamadanNo()));
        holder.monthNameTextView.setText(user.getMonthName());
        holder.dayNameTextView.setText(user.getDayName());
        holder.sheheriTextView.setText(user.getSheheriTime());
        holder.ifterTextView.setText(user.getIfterTime());

    }

    @Override
    public int getItemCount() {
        return ramadanList.size();
    }

}
