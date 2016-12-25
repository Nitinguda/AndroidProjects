package edu.niu.cs.z1760203.fragmentsandtabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by z1760203 on 3/29/2016.
 */
public class MyAdapter extends FragmentPagerAdapter {

    int numTabs;
    public MyAdapter(FragmentManager fragmentManager, int numOfTabs){
        super(fragmentManager);
        numTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                BreakfastFragment breakfastFragment = new BreakfastFragment();
                return breakfastFragment;

            case 1:
                CoffeeFragment coffeeFragment = new CoffeeFragment();
                return coffeeFragment;

            case 2:
                LunchFragment lunchFragment = new LunchFragment();
                return lunchFragment;

            case 3:
                DinnerFragment dinnerFragment = new DinnerFragment();
                return dinnerFragment;

            default:return null;
        }
    }

    @Override
    public int getCount() {
        return numTabs;
    }
}
