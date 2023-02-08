package com.example.bmicalculator;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class viewPagerMessengerAdapter extends FragmentPagerAdapter {


    public viewPagerMessengerAdapter(@NonNull FragmentManager fm) {

        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return  new ChatSectionFragment();
        } else if (position==1) {
            return new statusSectionFragment();
        } else {//postiion==2 condition true
            return new callSectionFragment() ;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "Chats";
        } else if (position==1) {
            return "Status";
        } else {
            return "Calls";
        }
    }

}
