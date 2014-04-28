package com.example.androidrobotofont_sample;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;

public class RobotoMainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_roboto_main);
		
		SampleRobotoFonts sampleRoboto = new SampleRobotoFonts();
		FragmentManager fragmentManager = getFragmentManager();
	    FragmentTransaction fragmentTransaction =   fragmentManager.beginTransaction();
	    fragmentTransaction.replace(R.id.main_frame, sampleRoboto).commit();
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_roboto_main, menu);
		return true;
	}
	
	
	

}
