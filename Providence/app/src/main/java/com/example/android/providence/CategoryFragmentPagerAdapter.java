package com.example.android.providence;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;

    //private String tabTitles[] = new String[] { "Food", "History", "Events", "Entertainment" };
    private Context mContext;

    public CategoryFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public CategoryFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
          return new FoodFragment();
        } else if (position == 1) {
            return new HistoryFragment();
        } else if (position == 2) {
            return new EventsFragment();
        } else {
            return new EntertainmentFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        if (position == 0) {
            return mContext.getResources().getString(R.string.category_food);
        } else if (position == 1) {
            return mContext.getResources().getString(R.string.category_history);
        } else if (position == 2) {
            return mContext.getResources().getString(R.string.category_events);
        } else {
            return mContext.getResources().getString(R.string.category_entertainment);
        }
    }

}
