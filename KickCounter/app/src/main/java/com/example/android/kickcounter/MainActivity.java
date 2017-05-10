package com.example.android.kickcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.kickcounter.R;

public class MainActivity extends AppCompatActivity {
    int scoreRed = 0;
    int scoreBlue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void addOneForRed(View v) {
        scoreRed = scoreRed + 1;
        Red_Corner(scoreRed);
    }


    /**
     * IncreasethescoreforTeamAby2points.
     */
    public void addTwoForRed(View v) {
        scoreRed = scoreRed + 2;
        Red_Corner(scoreRed);
    }

    /**
     * IncreasethescoreforTeamAby3points.
     */
    public void addThreeForRed(View v) {
        scoreRed = scoreRed + 3;
        Red_Corner(scoreRed);
    }

    public void addOneForBlue(View v) {
        scoreBlue = scoreBlue + 1;
        Blue_Corner(scoreBlue);
    }


    /**
     * IncreasethescoreforTeamAby2points.
     */
    public void addTwoForBlue(View v) {
        scoreBlue = scoreBlue + 2;
        Blue_Corner(scoreBlue);
    }

    /**
     * IncreasethescoreforTeamAby3points.
     */
    public void addThreeForBlue(View v) {
        scoreBlue = scoreBlue + 3;
        Blue_Corner(scoreBlue);
    }


    public void Clear(View view) {
        scoreRed = 0;
        scoreBlue = 0;
        Red_Corner(scoreRed);
        Blue_Corner(scoreBlue);
    }

    /**
     * DisplaysthegivenscoreforTeamA.
     */
    public void Red_Corner(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_score);
        scoreView.setText(String.valueOf(score));
    }

    public void Blue_Corner(int score) {
        TextView scoreView = (TextView) findViewById(R.id.blue_score);
        scoreView.setText(String.valueOf(score));
    }
}
