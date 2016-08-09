package com.mygdx.game;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.badlogic.gdx.backends.android.AndroidFragmentApplication;

/**
 * Created by kamran.shamloo on 2016-08-08.
 */
public class GameFragment extends AndroidFragmentApplication{
    private View fragView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        //fragView = inflater.inflate(R.layout.layout, container, false);
        //debugTextView = (TextView)fragView.findViewById(R.id.debug_overlay_text);
        //return fragView;
        View temp =initializeForView(new MyGdxGame());
        return temp;
    }
}

