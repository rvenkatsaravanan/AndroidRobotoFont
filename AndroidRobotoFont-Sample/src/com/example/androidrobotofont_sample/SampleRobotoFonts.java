package com.example.androidrobotofont_sample;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SampleRobotoFonts extends Fragment{
	View view_inflater;
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view_inflater = inflater.inflate(R.layout.roboto_main, container, false);
		return view_inflater;
	}
	
	

}
