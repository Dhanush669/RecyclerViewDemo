package com.example.recyclerviewdemo;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{
    List<ModelClass> modellist;
    Context context;

    public RecyclerAdapter() {
    }

    public RecyclerAdapter(List<ModelClass> modellist, Context context) {
        this.modellist = modellist;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerlayout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.contnumber.setText(modellist.get(position).getContactnumber());
        holder.contname.setText(modellist.get(position).getContactname());
        Glide.with(context).load(modellist.get(position).getContactphoto()).centerCrop()
                .into(holder.contphoto);

    }

    @Override
    public int getItemCount() {
        return modellist.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView contphoto;
        TextView contname,contnumber;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            contname=itemView.findViewById(R.id.contactname);
            contphoto=itemView.findViewById(R.id.contactimage);
            contnumber=itemView.findViewById(R.id.contactnumber);
        }
    }
}
