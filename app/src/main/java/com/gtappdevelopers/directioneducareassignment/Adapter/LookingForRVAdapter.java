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

import com.gtappdevelopers.directioneducareassignment.Modal.LookingForModal;
import com.gtappdevelopers.directioneducareassignment.R;

import java.util.ArrayList;

public class LookingForRVAdapter extends RecyclerView.Adapter<LookingForRVAdapter.ViewHolder> {
    private Context context;
    private ArrayList<LookingForModal> lookingForModalArrayList;

    public LookingForRVAdapter(Context context, ArrayList<LookingForModal> lookingForModalArrayList) {
        this.context = context;
        this.lookingForModalArrayList = lookingForModalArrayList;
    }

    @NonNull
    @Override
    public LookingForRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.looking_for_rv_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LookingForRVAdapter.ViewHolder holder, int position) {
        LookingForModal modal = lookingForModalArrayList.get(position);
        holder.iconIV.setImageResource(modal.getImgId());
        holder.lookingForCV.setCardBackgroundColor(modal.getColor());
        holder.titleTV.setText(modal.getMessageName());
    }

    @Override
    public int getItemCount() {
        return lookingForModalArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private CardView lookingForCV;
        private ImageView iconIV;
        private TextView titleTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            lookingForCV = itemView.findViewById(R.id.idCVLookingFor);
            iconIV = itemView.findViewById(R.id.idIVImageIcon);
            titleTV = itemView.findViewById(R.id.idTVIconName);
        }
    }
}
