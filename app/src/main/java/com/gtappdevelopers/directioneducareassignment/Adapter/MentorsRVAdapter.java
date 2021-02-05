package com.gtappdevelopers.directioneducareassignment.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.gtappdevelopers.directioneducareassignment.Modal.MentorsModal;
import com.gtappdevelopers.directioneducareassignment.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MentorsRVAdapter extends RecyclerView.Adapter<MentorsRVAdapter.ViewHolder> {
    private ArrayList<MentorsModal> mentorsModalArrayList;
    private Context context;

    public MentorsRVAdapter(ArrayList<MentorsModal> mentorsModalArrayList, Context context) {
        this.mentorsModalArrayList = mentorsModalArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public MentorsRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.awarded_mentors_rv_item, parent, false);
        return new MentorsRVAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MentorsRVAdapter.ViewHolder holder, int position) {
        MentorsModal modal = mentorsModalArrayList.get(position);
        holder.mentorsCV.setCardBackgroundColor(modal.getBackgroundColor());
        holder.mentorTV.setText(modal.getTeacherName());
        holder.mentorDescriptionTV.setText(modal.getTeacherDescription());
        holder.likesTV.setText(modal.getLikes());
        Picasso.get().load(modal.getImgUrl()).into(holder.mentorIV);
    }

    @Override
    public int getItemCount() {
        return mentorsModalArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private CardView mentorsCV;
        private CircleImageView mentorIV;
        private TextView mentorTV, mentorDescriptionTV, likesTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mentorsCV = itemView.findViewById(R.id.idCVMentors);
            mentorIV = itemView.findViewById(R.id.idCIVTeacher);
            mentorTV = itemView.findViewById(R.id.idTVProfessorName);
            mentorDescriptionTV = itemView.findViewById(R.id.idTVDescription);
            likesTV = itemView.findViewById(R.id.idTVlikes);
        }
    }
}
