package com.example.foodappex1.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodappex1.Domain.PopularDomain;
import com.example.foodappex1.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.Viewholder> {
    ArrayList<PopularDomain> popularDomains;

    public PopularAdapter(ArrayList<PopularDomain> popularDomains) {
        this.popularDomains = popularDomains;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_popular,parent,false);
        return new Viewholder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        PopularDomain current = popularDomains.get(position);
        holder.title.setText(current.getTitle());
        holder.fee.setText(String.valueOf(current.getFee()));
       //holder.addBtn.setText(current.getNumberInCart());
        Picasso.get().load(current.getPic()).into(holder.pic);

    }

    @Override
    public int getItemCount() {
        return popularDomains.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        TextView title,fee;
        ImageView pic;
        TextView addBtn;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.titleTextViewId);
            fee = itemView.findViewById(R.id.feeTextViewId);
            pic = itemView.findViewById(R.id.imageViewId);
            addBtn = itemView.findViewById(R.id.addButtonId);
        }
    }
}
