package baydevgroup.net.viewpagerwithslidingtabstripexample.adapter;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import baydevgroup.net.viewpagerwithslidingtabstripexample.R;
import baydevgroup.net.viewpagerwithslidingtabstripexample.fragments.FragmentOne;
import baydevgroup.net.viewpagerwithslidingtabstripexample.fragments.FragmentThree;
import baydevgroup.net.viewpagerwithslidingtabstripexample.fragments.FragmentTwo;

/**
 * Created by cingiz-mac on 19.05.17.
 */

public class MyPagerAdapterTabs extends FragmentPagerAdapter  {

    protected final String[] titles = {"Бани", "Строительство", "Отделка"};
    protected Fragment[]     fragments;
    protected int[]          icnns;
   

    public MyPagerAdapterTabs(FragmentManager fm) {
        super(fm);

        fragments = new Fragment[] { FragmentOne.newInstance(), FragmentTwo.newInstance(), FragmentThree.newInstance() };

        icnns = new int[] {R.drawable.icon1,
                           R.drawable.icon2,
                           R.drawable.icon3};
    }
    
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }


}


