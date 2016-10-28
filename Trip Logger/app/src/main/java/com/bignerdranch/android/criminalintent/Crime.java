package com.bignerdranch.android.criminalintent;

import android.os.Environment;

import java.io.File;
import java.util.Date;
import java.util.UUID;

public class Crime {
    private UUID mId;
    private UUID mSettingsId;
    private String mTitle;
    private String mDestination;
    private String mDuration;
    private String mComment;
    private Date mDate;
    private boolean mSolved;
    private String mName;

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }


    public void setDestination(String destination) {mDestination = destination;}

    public String getDestination() {
        return mDestination;
    }


    public void setDuration(String duration) {mDuration = duration;}

    public String getDuration() {
        return mDuration;
    }


    public void setComment(String comment) {mComment = comment;}

    public String getComment() {
        return mComment;
    }

    public Crime() {
        this(UUID.randomUUID());
    }

    public Crime(UUID id) {
        mId = id;
        mDate = new Date();
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public String getPhotoFilename() {
        return "IMG_" + getId().toString() + ".jpg";
    }


    public void setName(String name) {mName = name;}

    public String getName() {
        return mName;
    }
}
