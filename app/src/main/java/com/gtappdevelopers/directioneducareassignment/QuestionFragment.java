package com.gtappdevelopers.directioneducareassignment;

import android.content.res.Resources;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gtappdevelopers.directioneducareassignment.Adapter.ExploreRVAdapter;
import com.gtappdevelopers.directioneducareassignment.Adapter.InterestRVAdapter;
import com.gtappdevelopers.directioneducareassignment.Modal.ExploreModal;
import com.gtappdevelopers.directioneducareassignment.Modal.InterestModal;
import com.gtappdevelopers.directioneducareassignment.Modal.QuestionModal;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class QuestionFragment extends Fragment {

    private RecyclerView exploreRV,interestRV;
    private ArrayList<ExploreModal> exploreModalArrayList;
    private ArrayList<InterestModal> interestModalArrayList;
    private Resources resources;
    private ExploreRVAdapter exploreRVAdapter;
    private InterestRVAdapter interestRVAdapter;

    public QuestionFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_question, container, false);
        resources = getContext().getResources();
        exploreModalArrayList = new ArrayList<>();
        interestModalArrayList = new ArrayList<>();
        interestRV = view.findViewById(R.id.idRVQuestions);
        exploreRV = view.findViewById(R.id.idRVExplore);

        exploreModalArrayList.add(new ExploreModal(resources.getString(R.string.book_session), resources.getString(R.string.session_desc), R.drawable.texture1));
        exploreModalArrayList.add(new ExploreModal(resources.getString(R.string.book_session), resources.getString(R.string.session_desc), R.drawable.texture2));
        exploreModalArrayList.add(new ExploreModal(resources.getString(R.string.book_session), resources.getString(R.string.session_desc), R.drawable.texture3));
        exploreModalArrayList.add(new ExploreModal(resources.getString(R.string.book_session), resources.getString(R.string.session_desc), R.drawable.texture4));
        exploreModalArrayList.add(new ExploreModal(resources.getString(R.string.book_session), resources.getString(R.string.session_desc), R.drawable.texture5));

        exploreRVAdapter = new ExploreRVAdapter(getContext(), exploreModalArrayList);
        LinearLayoutManager exploreRVlayoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        exploreRV.setLayoutManager(exploreRVlayoutManager);
        exploreRV.setAdapter(exploreRVAdapter);

        interestModalArrayList.add(new InterestModal(R.drawable.icon_1,resources.getString(R.string.academic_counselor),resources.getColor(R.color.interest_color_1)));
        interestModalArrayList.add(new InterestModal(R.drawable.icon_4,resources.getString(R.string.college_guide),resources.getColor(R.color.interest_color_2)));
        interestModalArrayList.add(new InterestModal(R.drawable.icon_2,resources.getString(R.string.academic_counselor),resources.getColor(R.color.interest_color_3)));
        interestModalArrayList.add(new InterestModal(R.drawable.icon_1,resources.getString(R.string.academic_counselor),resources.getColor(R.color.interest_color_4)));

        interestRVAdapter = new InterestRVAdapter(getContext(),interestModalArrayList);
        GridLayoutManager manager = new GridLayoutManager(getContext(),2);
        interestRV.setLayoutManager(manager);
        interestRV.setAdapter(interestRVAdapter);


        return view;
    }
}