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

public class FragmentTwo extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_two, container,false);
        return view;
    }

    public static FragmentTwo newInstance() {
        return new FragmentTwo();
    }
}
