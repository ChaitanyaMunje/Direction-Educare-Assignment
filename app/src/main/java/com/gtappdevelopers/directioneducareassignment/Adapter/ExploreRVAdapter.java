package com.gtappdevelopers.directioneducareassignment.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gtappdevelopers.directioneducareassignment.Modal.ExploreModal;
import com.gtappdevelopers.directioneducareassignment.R;

import java.util.ArrayList;

public class ExploreRVAdapter extends RecyclerView.Adapter<ExploreRVAdapter.ViewHolder> {
    private Context context;
    private ArrayList<ExploreModal> exploreModalArrayList;

    public ExploreRVAdapter(Context context, ArrayList<ExploreModal> exploreModalArrayList) {
        this.context = context;
        this.exploreModalArrayList = exploreModalArrayList;
    }

    @NonNull
    @Override
    public ExploreRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.explore_rv_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExploreRVAdapter.ViewHolder holder, int position) {
        ExploreModal modal = exploreModalArrayList.get(position);
        holder.exploreCardRL.setBackgroundResource(modal.getImg());
        holder.headingTV.setText(modal.getTitle());
        holder.descTV.setText(modal.getDescription());
    }

    @Override
    public int getItemCount() {
        return exploreModalArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private RelativeLayout exploreCardRL;
        private TextView headingTV;
        private TextView descTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            exploreCardRL = itemView.findViewById(R.id.idRLExplore);
            headingTV = itemView.findViewById(R.id.idTVExploreTitle);
            descTV = itemView.findViewById(R.id.idTVDescription);
        }
    }
}
