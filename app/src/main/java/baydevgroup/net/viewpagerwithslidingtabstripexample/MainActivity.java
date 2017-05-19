package baydevgroup.net.viewpagerwithslidingtabstripexample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.astuetz.PagerSlidingTabStrip;

import baydevgroup.net.viewpagerwithslidingtabstripexample.adapter.MyPagerAdapterTabs;
import baydevgroup.net.viewpagerwithslidingtabstripexample.fragments.FragmentOne;
import baydevgroup.net.viewpagerwithslidingtabstripexample.fragments.FragmentThree;
import baydevgroup.net.viewpagerwithslidingtabstripexample.fragments.FragmentTwo;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;

    private PagerSlidingTabStrip tabs;
    //protected MyPagerAdapterTabs adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews(){
        mViewPager = (ViewPager) findViewById(R.id.pager);
        tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);



        final Fragment[] fragments = new Fragment[] { FragmentOne.newInstance(),
                                                      FragmentTwo.newInstance(),
                                                      FragmentThree.newInstance() };

        FragmentManager fm = getSupportFragmentManager();


        mViewPager.setAdapter(new MyPagerAdapterTabs(fm));
        mViewPager.setOffscreenPageLimit(3);
        tabs.setViewPager(mViewPager);
    }


}
