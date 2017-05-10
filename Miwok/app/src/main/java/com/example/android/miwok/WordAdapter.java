package com.example.android.miwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.UserDictionary;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Unicron on 7/30/2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();
    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Word currentWord = getItem(position);
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwokTranslation);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView englishTextView = (TextView) listItemView.findViewById(R.id.englishTranslation);
        englishTextView.setText(currentWord.getEnglishTranslation());

        ImageView image_Icon = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            image_Icon.setImageResource(currentWord.getImageResourceID());
            // Make sure the view is visible
            image_Icon.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            image_Icon.setVisibility(View.GONE);
        }

        View imageContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        imageContainer.setBackgroundColor(color);


    return listItemView;


}


}
