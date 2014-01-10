package com.example.androidtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EditActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit);
	}

	/*
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.edit, menu);
		return true;
	}
	*/
	
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
