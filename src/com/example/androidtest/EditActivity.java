package com.example.androidtest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;

public class EditActivity extends BaseActivity {
	Fragment picture = new PictureFragment();
	Fragment side = new SideFragment();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit_frame);
		
		//Gets manager from /libs/android-support-v4.jar (if used this package)
		FragmentManager fragment = getSupportFragmentManager();	
		FragmentTransaction fragmentTransaction = fragment.beginTransaction();
		
		//create new fragment to replace
		Fragment frag = new SideFragment();
		
		//replace frag_frame with our side fragment
		fragmentTransaction.replace(R.id.frag_frame, frag, "SIDE");
		fragmentTransaction.commit();
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.edit, menu);
		return true;
	}
	
	public void swapFrag(View v) {
		FragmentManager fragmentManager = getSupportFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
		
		Fragment current = fragmentManager.findFragmentByTag("SIDE");
		
		if(current.isVisible()) {
			fragmentTransaction.replace(R.id.frag_frame, picture, "PIC");
		}
		else {
			fragmentTransaction.replace(R.id.frag_frame, side, "SIDE");
		}
		fragmentTransaction.addToBackStack(null);
		fragmentTransaction.commit();
	}
	/*
	 * Buttons in fragments don't use the onClick property.
	 */
	public void addComment(View v) {
		/*
		String name, comment, other;
		
		EditText nameIn = (EditText)findViewById(R.id.nameIn);
		EditText commentIn = (EditText)findViewById(R.id.commentIn);
		EditText otherIn = (EditText)findViewById(R.id.otherIn);
		
		name = nameIn.getText().toString();
		comment = commentIn.getText().toString();
		other = otherIn.getText().toString();
		
		TextView nameOut = (TextView)findViewById(R.id.name);
		TextView commentOut = (TextView)findViewById(R.id.comment);
		TextView otherOut = (TextView)findViewById(R.id.other);
		
		nameOut.setText(name);
		commentOut.setText(comment);
		otherOut.setText(other);
		*/
	}
}
