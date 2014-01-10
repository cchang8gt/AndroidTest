package com.example.androidtest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class BaseActivity extends Activity {
	private final String TAG = "BaseActivity";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_base);
	}

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

}
