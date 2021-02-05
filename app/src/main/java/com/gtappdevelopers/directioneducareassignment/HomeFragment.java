package com.gtappdevelopers.directioneducareassignment;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gtappdevelopers.directioneducareassignment.Adapter.ExploreRVAdapter;
import com.gtappdevelopers.directioneducareassignment.Adapter.FinalYearRvAdapter;
import com.gtappdevelopers.directioneducareassignment.Adapter.LookingForRVAdapter;
import com.gtappdevelopers.directioneducareassignment.Adapter.MentorsRVAdapter;
import com.gtappdevelopers.directioneducareassignment.Adapter.QuestionRVAdapter;
import com.gtappdevelopers.directioneducareassignment.Modal.ExploreModal;
import com.gtappdevelopers.directioneducareassignment.Modal.FinalYearModal;
import com.gtappdevelopers.directioneducareassignment.Modal.LookingForModal;
import com.gtappdevelopers.directioneducareassignment.Modal.MentorsModal;
import com.gtappdevelopers.directioneducareassignment.Modal.QuestionModal;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private RecyclerView exploreRV, lookingForRV, mentorsRV, questionsRV, studentsRV;
    private ArrayList<ExploreModal> exploreModalArrayList;
    private ArrayList<LookingForModal> lookingForModalArrayList;
    private ArrayList<MentorsModal> mentorsModalArrayList;
    private ArrayList<QuestionModal> questionModalArrayList;
    private ArrayList<FinalYearModal> finalYearModalArrayList;
    private ExploreRVAdapter exploreRVAdapter;
    private LookingForRVAdapter lookingForRVAdapter;
    private MentorsRVAdapter mentorsRVAdapter;
    private QuestionRVAdapter questionRVAdapter;
    private FinalYearRvAdapter finalYearRvAdapter;
    private Resources resources;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        resources = getContext().getResources();
        exploreModalArrayList = new ArrayList<>();
        lookingForModalArrayList = new ArrayList<>();
        mentorsModalArrayList = new ArrayList<>();
        questionModalArrayList = new ArrayList<>();
        finalYearModalArrayList = new ArrayList<>();
        exploreRV = view.findViewById(R.id.idRVExplore);
        lookingForRV = view.findViewById(R.id.idRVLookingFor);
        mentorsRV = view.findViewById(R.id.idRVAwardedMentors);
        questionsRV = view.findViewById(R.id.idRVMostAskedQuestions);
        studentsRV = view.findViewById(R.id.idRVFinalYearStudents);

        exploreModalArrayList.add(new ExploreModal(resources.getString(R.string.book_session), resources.getString(R.string.session_desc), R.drawable.texture1));
        exploreModalArrayList.add(new ExploreModal(resources.getString(R.string.book_session), resources.getString(R.string.session_desc), R.drawable.texture2));
        exploreModalArrayList.add(new ExploreModal(resources.getString(R.string.book_session), resources.getString(R.string.session_desc), R.drawable.texture3));
        exploreModalArrayList.add(new ExploreModal(resources.getString(R.string.book_session), resources.getString(R.string.session_desc), R.drawable.texture4));
        exploreModalArrayList.add(new ExploreModal(resources.getString(R.string.book_session), resources.getString(R.string.session_desc), R.drawable.texture5));

        exploreRVAdapter = new ExploreRVAdapter(getContext(), exploreModalArrayList);
        LinearLayoutManager exploreRVlayoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        exploreRV.setLayoutManager(exploreRVlayoutManager);
        exploreRV.setAdapter(exploreRVAdapter);

        lookingForModalArrayList.add(new LookingForModal(R.drawable.ic_notes, resources.getString(R.string.notes), resources.getColor(R.color.orange)));
        lookingForModalArrayList.add(new LookingForModal(R.drawable.icon_1, resources.getString(R.string.jobs), resources.getColor(R.color.yellow)));
        lookingForModalArrayList.add(new LookingForModal(R.drawable.icon_2, resources.getString(R.string.clubs), resources.getColor(R.color.green)));
        lookingForModalArrayList.add(new LookingForModal(R.drawable.icon_4, resources.getString(R.string.earn_with_us), resources.getColor(R.color.pink)));
        lookingForModalArrayList.add(new LookingForModal(R.drawable.ic_places, resources.getString(R.string.places), resources.getColor(R.color.design_default_color_primary)));

        lookingForRVAdapter = new LookingForRVAdapter(getContext(), lookingForModalArrayList);
        LinearLayoutManager lookingForRVlayoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        lookingForRV.setLayoutManager(lookingForRVlayoutManager);
        lookingForRV.setAdapter(lookingForRVAdapter);

        mentorsModalArrayList.add(new MentorsModal(resources.getString(R.string.imgUrl), resources.getString(R.string.mentorName), resources.getString(R.string.mentorDescription), resources.getString(R.string.likes), resources.getColor(R.color.color1)));
        mentorsModalArrayList.add(new MentorsModal(resources.getString(R.string.imgUrl), resources.getString(R.string.mentorName), resources.getString(R.string.mentorDescription), resources.getString(R.string.likes), resources.getColor(R.color.color2)));
        mentorsModalArrayList.add(new MentorsModal(resources.getString(R.string.imgUrl), resources.getString(R.string.mentorName), resources.getString(R.string.mentorDescription), resources.getString(R.string.likes), resources.getColor(R.color.color3)));
        mentorsModalArrayList.add(new MentorsModal(resources.getString(R.string.imgUrl), resources.getString(R.string.mentorName), resources.getString(R.string.mentorDescription), resources.getString(R.string.likes), resources.getColor(R.color.color1)));

        mentorsRVAdapter = new MentorsRVAdapter(mentorsModalArrayList, getContext());
        LinearLayoutManager mentorRVlayoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        mentorsRV.setLayoutManager(mentorRVlayoutManager);
        mentorsRV.setAdapter(mentorsRVAdapter);

        questionModalArrayList.add(new QuestionModal(resources.getString(R.string.question),resources.getString(R.string.answer),resources.getString(R.string.votes)));
        questionModalArrayList.add(new QuestionModal(resources.getString(R.string.question),resources.getString(R.string.answer),resources.getString(R.string.votes)));
        questionModalArrayList.add(new QuestionModal(resources.getString(R.string.question),resources.getString(R.string.answer),resources.getString(R.string.votes)));
        questionModalArrayList.add(new QuestionModal(resources.getString(R.string.question),resources.getString(R.string.answer),resources.getString(R.string.votes)));
        questionModalArrayList.add(new QuestionModal(resources.getString(R.string.question),resources.getString(R.string.answer),resources.getString(R.string.votes)));
        questionModalArrayList.add(new QuestionModal(resources.getString(R.string.question),resources.getString(R.string.answer),resources.getString(R.string.votes)));
        questionModalArrayList.add(new QuestionModal(resources.getString(R.string.question),resources.getString(R.string.answer),resources.getString(R.string.votes)));
        questionRVAdapter = new QuestionRVAdapter(getContext(),questionModalArrayList);
        LinearLayoutManager questionRVlayoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        questionsRV.setLayoutManager(questionRVlayoutManager);
        questionsRV.setAdapter(questionRVAdapter);

        finalYearModalArrayList.add(new FinalYearModal(resources.getString(R.string.final_year_students_title),resources.getString(R.string.desc),resources.getColor(R.color.orange)));
        finalYearModalArrayList.add(new FinalYearModal(resources.getString(R.string.final_year_students_title),resources.getString(R.string.desc),resources.getColor(R.color.pink)));
        finalYearModalArrayList.add(new FinalYearModal(resources.getString(R.string.final_year_students_title),resources.getString(R.string.desc),resources.getColor(R.color.green)));
        finalYearModalArrayList.add(new FinalYearModal(resources.getString(R.string.final_year_students_title),resources.getString(R.string.desc),resources.getColor(R.color.yellow)));
        finalYearModalArrayList.add(new FinalYearModal(resources.getString(R.string.final_year_students_title),resources.getString(R.string.desc),resources.getColor(R.color.orange)));
        finalYearModalArrayList.add(new FinalYearModal(resources.getString(R.string.final_year_students_title),resources.getString(R.string.desc),resources.getColor(R.color.pink)));

        finalYearRvAdapter = new FinalYearRvAdapter(getContext(),finalYearModalArrayList);
        LinearLayoutManager finalYearRVlayoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        studentsRV.setLayoutManager(finalYearRVlayoutManager);
        studentsRV.setAdapter(finalYearRvAdapter);


        return view;
    }
}