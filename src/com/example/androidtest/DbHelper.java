package com.example.androidtest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {

	public static final String DATABASE_NAME = "data";
	public static final String TABLE_NAME = "comments_table";
	public static final String C_ID = "_id";
	public static final String NAME = "name";
	public static final String COMMENT = "comment";
	public static final String EMAIL = "email";
	public static final String TIME = "time";
	
	private final String createDB = "create table if not exists " + TABLE_NAME + " ( "
			+ C_ID + " integer primary key autoincrement " 
			+ NAME + " text, "
			+ COMMENT + " text, "
			+ EMAIL + " text, "
			+ TIME + " text); ";
	
	public DbHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, DATABASE_NAME, factory, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(createDB);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldversion, int newversion) {
		// TODO Auto-generated method stub
		db.execSQL("drop table " + TABLE_NAME);
	}

}
