package com.gtappdevelopers.directioneducareassignment.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.gtappdevelopers.directioneducareassignment.Modal.InterestModal;
import com.gtappdevelopers.directioneducareassignment.R;

import java.util.ArrayList;

public class InterestRVAdapter extends RecyclerView.Adapter<InterestRVAdapter.ViewHolder> {
    private Context context;
    private ArrayList<InterestModal> interestModalArrayList;

    public InterestRVAdapter(Context context, ArrayList<InterestModal> interestModalArrayList) {
        this.context = context;
        this.interestModalArrayList = interestModalArrayList;
    }

    @NonNull
    @Override
    public InterestRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.interest_rv_item, parent, false);
        return new InterestRVAdapter.ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull InterestRVAdapter.ViewHolder holder, int position) {
        InterestModal modal = interestModalArrayList.get(position);
        holder.iconIV.setImageResource(modal.getImgId());
        holder.titleTV.setText(modal.getTitle());
        holder.itemCV.setCardBackgroundColor(modal.getBackgroundColor());
    }

    @Override
    public int getItemCount() {
        return interestModalArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView iconIV;
        private TextView titleTV;
        private CardView itemCV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iconIV = itemView.findViewById(R.id.idIVImage);
            titleTV = itemView.findViewById(R.id.idTVtitle);
            itemCV = itemView.findViewById(R.id.idCVInterest);
        }
    }
}
