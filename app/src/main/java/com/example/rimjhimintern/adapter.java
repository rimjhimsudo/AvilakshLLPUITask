package com.example.rimjhimintern;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.MyVwHolder> {
    private Context context;
    private FitnessLst[] ftnessnameslst;
    public  adapter(Context context , FitnessLst[] ftnessnameslst){
        this.context=context;
        this.ftnessnameslst=ftnessnameslst;
    }
    @NonNull
    @Override
    public MyVwHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.fitness_items_layout, parent,false);
        return new MyVwHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.MyVwHolder holder, int position) {
       // Glide.with(context).load(R.drawable.spa).centerCrop().into(holder.img_fitness);
        holder.fitnessnames.setText(ftnessnameslst[position].getName());
        holder.img_fitness.setImageResource(ftnessnameslst[position].getImdId());
    }

    @Override
    public int getItemCount() {
        return ftnessnameslst.length;
    }
    class MyVwHolder extends RecyclerView.ViewHolder{

        TextView fitnessnames;
        ImageView img_fitness;
        public MyVwHolder(@NonNull View itemView) {
            super(itemView);
            fitnessnames=itemView.findViewById(R.id.tv_ftness);
            img_fitness=itemView.findViewById(R.id.image_ftness);

        }
    }
}
