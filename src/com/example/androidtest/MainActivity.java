package com.example.androidtest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	public final String TAG = "Main Activity";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i(TAG, "onCreate");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void button_clicked(View v) {
		Log.i(TAG, "button_clicked");
		TextView t = (TextView)findViewById(R.id.hellotext);
		t.setText("Clicked");
	}
	
	public void onBack() {
		Log.i(TAG, "onBack");
	}
	
	public void onStart() {
		super.onStart();
		Log.i(TAG, "onStart");
	}
	
	public void onResume() {
		super.onResume();
		Log.i(TAG, "onResume");
	}
	
	public void onPause() {
		super.onPause();
		Log.i(TAG, "onPause");
	}
	
	public void onStop() {
		super.onStop();
		Log.i(TAG, "OnStop");
	}
}
