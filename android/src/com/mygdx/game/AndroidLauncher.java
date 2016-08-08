package com.mygdx.game;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.FragmentActivity;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.badlogic.gdx.backends.android.AndroidFragmentApplication;
import com.mygdx.game.MyGdxGame;

import java.nio.channels.OverlappingFileLockException;


public class AndroidLauncher extends FragmentActivity implements  AndroidFragmentApplication.Callbacks {
	@Override
	public void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);


		GameFragment frag = new GameFragment();
        //OverlayFragment overlay = new OverlayFragment();

		getSupportFragmentManager().beginTransaction().
                add(R.id.content_framelayout, frag).
                commit();


//        debugOverlayFragment = new DebugOverlayFragment();
//        getFragmentManager().beginTransaction().
//                add(R.id.debug_overlay_fragment_framelayout, debugOverlayFragment).
//                commit();
//		trans.replace(android.R.id.content, fragment);
//		trans.commit();
//		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
//		initialize(new MyGdxGame(), config);
	}

	@Override
	public void exit() {

	}


}
