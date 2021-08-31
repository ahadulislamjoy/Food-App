package com.example.foodappex1.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodappex1.Domain.CategoryDomain;
import com.example.foodappex1.Domain.RecentDomain;
import com.example.foodappex1.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecentAdapter extends RecyclerView.Adapter<RecentAdapter.ViewHolder> {
    ArrayList<RecentDomain> recentDomains;

    public RecentAdapter(ArrayList<RecentDomain> recentDomains) {
        this.recentDomains = recentDomains;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate  = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_recent,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        RecentDomain current = recentDomains.get(position);
        holder.recentName.setText(current.getTitle());
        Picasso.get().load(current.getPic()).into(holder.recentPic);
    }



    @Override
    public int getItemCount() {
        return recentDomains.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView recentName;
        ImageView recentPic;
        ConstraintLayout recentMainLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            recentName = itemView.findViewById(R.id.recentNameId);
            recentPic = itemView.findViewById(R.id.recentImageViewId);
            recentMainLayout = itemView.findViewById(R.id.mainLayoutRecentId);
        }
    }
}
