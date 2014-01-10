package com.example.androidtest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SideFragment extends Fragment {
	View view;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		//View view;
		//Have to look in the view you inflated when you use a fragment
		view = inflater.inflate(R.layout.activity_edit, container, false);
		
		Button comment = (Button)view.findViewById(R.id.comment);
		comment.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String name, comment, other;
				
				EditText nameIn = (EditText) view.findViewById(R.id.nameIn);
				EditText commentIn = (EditText) view.findViewById(R.id.commentIn);
				EditText otherIn = (EditText) view.findViewById(R.id.otherIn);
				
				name = nameIn.getText().toString();
				comment = commentIn.getText().toString();
				other = otherIn.getText().toString();
				
				TextView nameOut = (TextView) view.findViewById(R.id.name);
				TextView commentOut = (TextView) view.findViewById(R.id.comment);
				TextView otherOut = (TextView) view.findViewById(R.id.other);
				
				nameOut.setText(name);
				commentOut.setText(comment);
				otherOut.setText(other);
			}
			
		});
		return view;
	}	
}