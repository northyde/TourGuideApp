package com.example.android.blombergfreetimeguide;

/**
 * Created by Michaela on 08.05.2018.
 */

public class Place {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mName;
    private String mStreet;
    private String mDistrict;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    // Constructor:
    public Place(String Name, String Streetname, String Districtname) {
        mName = Name;
        mStreet = Streetname;
        mDistrict = Districtname;
    }

    // Constructor for items with pictures:
    public Place(String Name, String Streetname, String Districtname, int ImageResourceId) {
        mName = Name;
        mStreet = Streetname;
        mDistrict = Districtname;
        mImageResourceId = ImageResourceId;
    }

    // Getter and setter methods for member variables
    public String getmName() {
        return mName;
    }

    private void setmName(String Name) {
        mName = Name;
    }

    public String getmStreet() {
        return mStreet;
    }

    private void setmStreet(String Streetname) {
        mStreet = Streetname;
    }

    public String getmDistrict() {
        return mDistrict;
    }

    private void setmDistrict(String Districtname) {
        mDistrict = Districtname;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    // Helper methods to determine if an item has an image
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
