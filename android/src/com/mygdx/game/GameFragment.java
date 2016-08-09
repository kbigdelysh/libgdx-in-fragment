package com.mygdx.game;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.badlogic.gdx.backends.android.AndroidFragmentApplication;

public class GameFragment extends AndroidFragmentApplication{
    private View fragView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View temp = initializeForView(new MyGdxGame());
        return temp;
    }
}

