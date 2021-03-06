package com.example.androidtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends BaseActivity {
	public final String TAG = "Main Activity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.i(TAG, "onCreate");
	}
	/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.twitter:
			Log.i(TAG, "Twitter Item Clicked");
			return true;
		case R.id.facebook:
			Log.i(TAG, "Facebook Item Clicked");
			return true;
		case R.id.refresh:
			Log.i(TAG, "Refresh clicked");
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}
	*/
	public void button_clicked(View v) {
		Log.i(TAG, "button_clicked");
		// TextView t = (TextView)findViewById(R.id.hellotext);
		// t.setText("Clicked");

		Intent intent = new Intent(this, EditActivity.class); // must send
																// context
		startActivity(intent);
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
