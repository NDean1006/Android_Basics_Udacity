package com.example.android.providence;

public class Word {
    private int mLocation;
    private int mContactInformation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    public static final int NO_IMAGE_PROVIDED = -1;



    public Word(int location, int contactInformation) {
        mLocation = location;
        mContactInformation = contactInformation;

    }

    public Word(int contactInformation, int location, int imageResourceId) {
        mLocation = location;
        mContactInformation = contactInformation;
        mImageResourceId = imageResourceId;

    }



    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getLocation() {
        return mLocation;
    }

    public int getContactInformation() {
        return mContactInformation;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mLocation='" + mLocation + '\'' +
                ", mContactInformation='" + mContactInformation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
