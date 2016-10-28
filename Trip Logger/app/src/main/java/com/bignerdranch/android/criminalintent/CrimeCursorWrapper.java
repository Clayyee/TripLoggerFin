package com.bignerdranch.android.criminalintent;

import android.database.Cursor;
import android.database.CursorWrapper;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Claye on 10/09/16.
 */


public class CrimeCursorWrapper extends CursorWrapper { public CrimeCursorWrapper(Cursor cursor) {
    super(cursor);
}


    public Crime getCrime() {
        String uuidString = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.UUID));
        String title = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.TITLE));
        String destination = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.DESTINATION));
        String duration = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.DURATION));
        String comment = getString(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.COMMENT));
        long date = getLong(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.DATE));
        int isSolved = getInt(getColumnIndex(CrimeDbSchema.CrimeTable.Cols.SOLVED));

        Crime crime = new Crime(UUID.fromString(uuidString));
        crime.setTitle(title);
        crime.setDestination(destination);
        crime.setDuration(duration);
        crime.setComment(comment);
        crime.setDate(new Date(date));
        crime.setSolved(isSolved != 0);
        return crime;
    }


    public Crime getSettings() {
        String uuidString = getString(getColumnIndex(CrimeDbSchema.SettingsTable.Cols.UUID));
        String name = getString(getColumnIndex(CrimeDbSchema.SettingsTable.Cols.NAME));
        String ID = getString(getColumnIndex(CrimeDbSchema.SettingsTable.Cols.ID));
        String gender = getString(getColumnIndex(CrimeDbSchema.SettingsTable.Cols.GENDER));
        String email = getString(getColumnIndex(CrimeDbSchema.SettingsTable.Cols.EMAIL));
        String scomment = getString(getColumnIndex(CrimeDbSchema.SettingsTable.Cols.SCOMMENT));

        Crime crime = new Crime(UUID.fromString(uuidString));
        crime.setName(name);
        /*
        crime.setDestination(destination);
        crime.setDuration(duration);
        crime.setComment(comment);
        crime.setDate(new Date(date));
        */
        return crime;
    }


}
