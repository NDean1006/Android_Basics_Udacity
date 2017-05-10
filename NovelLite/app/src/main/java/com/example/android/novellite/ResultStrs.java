package com.example.android.novellite;

/**
 * Created by Unicron on 10/22/2016.
 */


public class ResultStrs {

    private String mTitle = "";
    private String mAuthor = "";
    private String mPublisher = "";

    public ResultStrs(String title, String author, String publisher) {
        mTitle = title;
        mAuthor = author;
        mPublisher = publisher;
    }
    // Getter Methods
    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getPublisher() {
        return mPublisher;
    }

}