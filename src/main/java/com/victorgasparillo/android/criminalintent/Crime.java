package com.victorgasparillo.android.criminalintent;

/**
 * Created by VICTOR MANUEL on 2018-04-17.
 */
import com.victorgasparillo.android.criminalintent.CrimeActivity;
import java.util.UUID;
import java.util.Date;

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime () {
        mId = UUID.randomUUID();
        mDate = new Date ();
    }
    public UUID getmId() {
        return mId;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public boolean ismSolved() {
        return mSolved;
    }
}
