package edu.niu.cs.z1760203.fragmentsandtabs;

import android.app.Activity;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("Breakfast"));
        tabLayout.addTab(tabLayout.newTab().setText("Coffee"));
        tabLayout.addTab(tabLayout.newTab().setText("Lunch"));
        tabLayout.addTab(tabLayout.newTab().setText("Dinner"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //Layout manager that allows the user to flip left and right through pages of data.
        final ViewPager viewPager = (ViewPager)findViewById(R.id.pager);

        //The Adapter provides access to the data items.
        MyAdapter adapter = new MyAdapter(getSupportFragmentManager(),tabLayout.getTabCount());

        viewPager.setAdapter(adapter);

        //addOnPageChangeListener - Add a listener that will be invoked whenever the page changes or is incrementally scrolled.
        //TabLayoutOnPageChangeListener - tokeep the tabs in sync with the pages
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        //that will handle switching to and from tabs.
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            //Called when a tab enters the selected state.
            public void onTabSelected(TabLayout.Tab tab) {
                //Set the currently selected page.
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            //Called when a tab exits the selected state.
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            //Called when a tab that is already selected is chosen again by the user.
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }//onCreate ends here
}
