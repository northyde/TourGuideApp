package com.example.android.blombergfreetimeguide;

/**
 * Created by Michaela on 08.05.2018.
 */

public class Place {
    private String mName;
    private String mStreet;
    private String mDistrict;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

public Place (String Name, String Streetname, String Districtname){
    mName = Name;
    mStreet = Streetname;
    mDistrict = Districtname;
}
public Place (String Name, String Streetname, String Districtname, int ImageResourceId){
    mName = Name;
    mStreet = Streetname;
    mDistrict = Districtname;
    mImageResourceId = ImageResourceId;
}
public String getmName() {return mName;}
public void setmName (String Name){mName = Name;}

public String getmStreet() {return mStreet;}
    public void setmStreet(String Streetname) {
        mStreet = Streetname;
    }

    public String getmDistrict() {return mDistrict;}
    public void setmDistrict(String Districtname) {
        mDistrict = Districtname;
    }

    public int getImageResourceId (){return mImageResourceId;}
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
