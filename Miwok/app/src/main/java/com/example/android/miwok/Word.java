package com.example.android.miwok;

import android.content.Context;
import android.view.View;

/**
 * Created by Unicron on 7/30/2016.
 */
public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    private int mMiwokAudio;
    private String mMiwokTranslation;
    private String mEnglishTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    public Word(String englishTranslation, String miwokTranslation,int miwokAudio) {

        mMiwokTranslation = miwokTranslation;
        mEnglishTranslation = englishTranslation;
        mMiwokAudio = miwokAudio;

    }

    public Word(String englishTranslation, String miwokTranslation, int imageResourceId,int miwokAudio ) {

        mMiwokTranslation = miwokTranslation;
        mEnglishTranslation = englishTranslation;
        mImageResourceID = imageResourceId;
        mMiwokAudio = miwokAudio;

    }


    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getEnglishTranslation() {

        return mEnglishTranslation;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    public int getMiwokAudio(){return mMiwokAudio;}




}
