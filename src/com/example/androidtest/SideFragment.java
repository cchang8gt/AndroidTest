package com.example.androidtest;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class SideFragment extends Fragment {
	View view;
	SQLiteDatabase db;
	DbHelper dbhelper;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		//have to get context here because it is not created yet when it is an object variable
		dbhelper = new DbHelper(getActivity());
		//View view;
		//Have to look in the view you inflated when you use a fragment  android:onClick="button_clicked"
		db = dbhelper.getWritableDatabase();
		
		view = inflater.inflate(R.layout.activity_edit, container, false);
		Button button_comment = (Button)view.findViewById(R.id.button_comment);
		button_comment.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String name, comment, email;
				
				EditText nameIn = (EditText) view.findViewById(R.id.nameIn);
				EditText commentIn = (EditText) view.findViewById(R.id.commentIn);
				EditText emailIn = (EditText) view.findViewById(R.id.otherIn);
				
				name = nameIn.getText().toString();
				comment = commentIn.getText().toString();
				email = emailIn.getText().toString();
				
				//TextView nameOut = (TextView) view.findViewById(R.id.name);
				//TextView commentOut = (TextView) view.findViewById(R.id.comment);
				//TextView otherOut = (TextView) view.findViewById(R.id.other);
				
				//nameOut.setText(name);
				//commentOut.setText(comment);
				//otherOut.setText(other);
				
				//let us define key/values
				ContentValues cv = new ContentValues();
				
				cv.put(DbHelper.NAME, name);
				cv.put(DbHelper.COMMENT, comment);
				cv.put(DbHelper.EMAIL, email);
				
				db.insert(DbHelper.TABLE_NAME, null, cv);
			}
	
		});
		
		return view;
	}	
}