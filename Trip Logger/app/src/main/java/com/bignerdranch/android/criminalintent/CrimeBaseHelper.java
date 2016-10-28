package com.bignerdranch.android.criminalintent;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.bignerdranch.android.criminalintent.CrimeDbSchema.CrimeTable;

/**
 * Created by Claye on 10/09/16.
 */

public class CrimeBaseHelper extends SQLiteOpenHelper {

    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "crimeBase.db";
    private static final String DATABASE_NAME2 = "SettingsBase.db";

    public CrimeBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + CrimeTable.NAME + " (" + " _id integer primary key autoincrement, " +
                CrimeTable.Cols.UUID + ", " +
                CrimeTable.Cols.TITLE + ", " +
                CrimeTable.Cols.DATE + ", " +
                CrimeTable.Cols.DESTINATION + ", " +
                CrimeTable.Cols.DURATION + ", " +
                CrimeTable.Cols.COMMENT + ", " +
                CrimeTable.Cols.SOLVED +
                ")"
        );


        db.execSQL("create table " + CrimeDbSchema.SettingsTable.NAME + " (" + " _id integer primary key autoincrement, " +
                CrimeDbSchema.SettingsTable.Cols.UUID + ", " +
                CrimeDbSchema.SettingsTable.Cols.NAME + ", " +
                CrimeDbSchema.SettingsTable.Cols.ID + ", " +
                CrimeDbSchema.SettingsTable.Cols.GENDER + ", " +
                CrimeDbSchema.SettingsTable.Cols.EMAIL + ", " +
                CrimeDbSchema.SettingsTable.Cols.SCOMMENT +
                ")"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

}