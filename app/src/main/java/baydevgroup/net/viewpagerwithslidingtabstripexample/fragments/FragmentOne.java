package baydevgroup.net.viewpagerwithslidingtabstripexample.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import baydevgroup.net.viewpagerwithslidingtabstripexample.R;

/**
 * Created by cingiz-mac on 19.05.17.
 */

public class FragmentOne extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_one, container,false);
        return view;
    }

    public static FragmentOne newInstance() {
        return new FragmentOne();
    }
}
