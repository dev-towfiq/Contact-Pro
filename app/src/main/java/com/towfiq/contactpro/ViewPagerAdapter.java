package com.towfiq.contactpro;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> firstFragment = new ArrayList<>();
    private final List<String> firstTitle= new ArrayList<>();

    public ViewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);

    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return firstFragment.get(position);
    }
    @Override
    public int getCount() {
        return firstTitle.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return firstTitle.get(position);
    }

    public void addFragment(Fragment fragment, String title) {
        firstFragment.add(fragment);
        firstTitle.add(title);
    }
}




