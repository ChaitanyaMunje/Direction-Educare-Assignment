package com.gtappdevelopers.directioneducareassignment.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gtappdevelopers.directioneducareassignment.Modal.QuestionModal;
import com.gtappdevelopers.directioneducareassignment.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class QuestionRVAdapter extends RecyclerView.Adapter<QuestionRVAdapter.ViewHolder> {
    private Context context;
    private ArrayList<QuestionModal> questionModalArrayList;

    public QuestionRVAdapter(Context context, ArrayList<QuestionModal> questionModalArrayList) {
        this.context = context;
        this.questionModalArrayList = questionModalArrayList;
    }

    @NonNull
    @Override
    public QuestionRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.questions_rv_item, parent, false);
        return new QuestionRVAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuestionRVAdapter.ViewHolder holder, int position) {
        QuestionModal modal = questionModalArrayList.get(position);
        holder.questionTV.setText(modal.getQuestion());
        holder.answerTV.setText(modal.getAnswer());
        holder.votesTV.setText(modal.getVotes());

    }

    @Override
    public int getItemCount() {
        return questionModalArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView questionTV, answerTV, votesTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            questionTV = itemView.findViewById(R.id.idTVQuestion);
            answerTV = itemView.findViewById(R.id.idTVAnswer);
            votesTV = itemView.findViewById(R.id.idTVVotes);
        }
    }
}
