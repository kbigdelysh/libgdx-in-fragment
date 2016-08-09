package com.mygdx.game;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.badlogic.gdx.backends.android.AndroidFragmentApplication;

public class AndroidLauncher extends FragmentActivity implements  AndroidFragmentApplication.Callbacks {
	@Override
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

        setContentView(R.layout.layout);

		GameFragment frag = new GameFragment();

		getSupportFragmentManager().beginTransaction().
                replace(R.id.content_framelayout, frag).
                commit();
	}

	@Override
	public void exit() {

	}


}
