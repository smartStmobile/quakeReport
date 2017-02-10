package com.example.android.quakereport;

/**
 * Created by AP on 11.2.2017..
 */
//git test
public class Earthquake {

    private String mMagnitude;
    private String mDate;
    private String mLocation;

    public Earthquake(String mMagnitude, String mDate, String mLocation) {
        this.mMagnitude = mMagnitude;
        this.mDate = mDate;
        this.mLocation = mLocation;
    }

    public String getmMagnitude() {
        return mMagnitude;
    }

    public void setmMagnitude(String mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    @Override
    public String toString() {
        return "Earthquake{" +
                "mMagnitude='" + mMagnitude + '\'' +
                ", mDate='" + mDate + '\'' +
                ", mLocation='" + mLocation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Earthquake that = (Earthquake) o;

        if (!mMagnitude.equals(that.mMagnitude)) return false;
        if (!mDate.equals(that.mDate)) return false;
        return mLocation.equals(that.mLocation);

    }

    @Override
    public int hashCode() {
        int result = mMagnitude.hashCode();
        result = 31 * result + mDate.hashCode();
        result = 31 * result + mLocation.hashCode();
        return result;
    }
}
