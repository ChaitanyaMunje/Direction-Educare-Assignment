package com.gtappdevelopers.directioneducareassignment.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.gtappdevelopers.directioneducareassignment.HomeFragment;
import com.gtappdevelopers.directioneducareassignment.QuestionFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        if (position==0){
            fragment=new HomeFragment();
        }
        else if (position==1){
            fragment=new QuestionFragment();
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title=null;
        if (position==0){
            title="Home";
        }
        else if (position==1){
            title="Q/A";
        }
        return title;
    }
}
