package com.bex.nptunes.slides;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bex.nptunes.R;

/**
 * Created by Suman on 7/22/2015.
 */
public class FourthSlide extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.intro4, container, false);
        return v;
    }
}
