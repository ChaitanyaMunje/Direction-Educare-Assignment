package com.gtappdevelopers.directioneducareassignment.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.gtappdevelopers.directioneducareassignment.Modal.FinalYearModal;
import com.gtappdevelopers.directioneducareassignment.R;

import java.util.ArrayList;

public class FinalYearRvAdapter extends RecyclerView.Adapter<FinalYearRvAdapter.ViewHolder> {
    private Context context;
    private ArrayList<FinalYearModal> finalYearModalArrayList;

    public FinalYearRvAdapter(Context context, ArrayList<FinalYearModal> finalYearModalArrayList) {
        this.context = context;
        this.finalYearModalArrayList = finalYearModalArrayList;
    }

    @NonNull
    @Override
    public FinalYearRvAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.final_year_rv_item, parent, false);
        return new FinalYearRvAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FinalYearRvAdapter.ViewHolder holder, int position) {
        FinalYearModal modal = finalYearModalArrayList.get(position);
        holder.titleTV.setText(modal.getTitle());
        holder.descriptionTV.setText(modal.getDescription());
        holder.finalYearRL.setBackgroundColor(modal.getBackgroundColor());
    }

    @Override
    public int getItemCount() {
        return finalYearModalArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView titleTV,descriptionTV;
        private RelativeLayout finalYearRL;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            finalYearRL = itemView.findViewById(R.id.idRLFinalYear);
            titleTV = itemView.findViewById(R.id.idTVTitle);
            descriptionTV = itemView.findViewById(R.id.idTVDescription);
        }
    }
}
