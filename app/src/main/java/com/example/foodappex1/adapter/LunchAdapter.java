package com.example.foodappex1.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodappex1.Domain.LunchDomain;
import com.example.foodappex1.R;
import com.squareup.picasso.Picasso;

import java.lang.invoke.ConstantCallSite;
import java.util.ArrayList;

public class LunchAdapter extends RecyclerView.Adapter<LunchAdapter.ViewHolder> {
    ArrayList<LunchDomain> lunchDomains;

    public LunchAdapter(ArrayList<LunchDomain> lunchDomains) {
        this.lunchDomains = lunchDomains;
    }

    @NonNull
    @Override
    public LunchAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_lunch,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull LunchAdapter.ViewHolder holder, int position) {
        LunchDomain current = lunchDomains.get(position);
        holder.lunchName.setText(current.getTitle());
        Picasso.get().load(current.getPic()).into(holder.lunchPic);

    }

    @Override
    public int getItemCount() {
        return lunchDomains.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView lunchName;
        ImageView lunchPic;
        ConstraintLayout mainLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            lunchName = itemView.findViewById(R.id.lunchNameId);
            lunchPic = itemView.findViewById(R.id.lunchImageViewId);
            mainLayout = itemView.findViewById(R.id.mainLayoutId);
        }
    }
}
