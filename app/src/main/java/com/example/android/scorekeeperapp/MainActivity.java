package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // declare and initialize global variables
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;
    private int foulsA = 0;
    private int foulsB = 0;
    private int freeKickA = 0;
    private int freeKickB = 0;

    // onSaveInstanceState method to save the content of textViews when the mobile switches from portrait mode to landscape mode
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // saving the content of textview using the key
        outState.putInt("savText1", scoreTeamA);
        outState.putInt("savText2", scoreTeamB);
        outState.putInt("savText3", foulsA);
        outState.putInt("savText4", foulsB);
        outState.putInt("savText5", freeKickA);
        outState.putInt("savText6", freeKickB);
    }

    // onRestoreInstanceState method to Restore the content of textViews
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreTeamA = savedInstanceState.getInt("savText1");
        scoreTeamB = savedInstanceState.getInt("savText2");
        foulsA = savedInstanceState.getInt("savText3");
        foulsB = savedInstanceState.getInt("savText4");
        freeKickA = savedInstanceState.getInt("savText5");
        freeKickB = savedInstanceState.getInt("savText6");


        displayForTeamA(scoreTeamA);
        displayFoulsForTeamA(foulsA);
        displayFreeKicksForTeamA(freeKickA);
        displayForTeamB(scoreTeamB);
        displayFreeKicksForTeamB(freeKickB);
        displayFoulsForTeamB(foulsB);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    //method that adds 1 to the score of team A when pressing on the button Goal
    public void goalA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void increaseFoulForTeamA(View view) {
        foulsA = foulsA + 1;
        displayFoulsForTeamA(foulsA);
    }

    public void decreaseFoulForTeamA(View view) {
        foulsA = foulsA - 1;
        displayFoulsForTeamA(foulsA);
    }

    public void increaseFreeKickForTeamA(View view) {
        freeKickA = freeKickA + 1;
        displayFreeKicksForTeamA(freeKickA);
    }

    public void decreaseFreeKickForTeamA(View view) {
        freeKickA = freeKickA - 1;
        displayFreeKicksForTeamA(freeKickA);
    }
    //method that adds 1 to the score of team B when pressing on the button Goal

    public void goalB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void increaseFoulForTeamB(View view) {
        foulsB = foulsB + 1;
        displayFoulsForTeamB(foulsB);
    }

    public void decreaseFoulForTeamB(View view) {
        foulsB = foulsB - 1;
        displayFoulsForTeamB(foulsB);
    }

    public void increaseFreeKickForTeamB(View view) {
        freeKickB = freeKickB + 1;
        displayFreeKicksForTeamB(freeKickB);
    }

    public void decreaseFreeKickForTeamB(View view) {
        freeKickB = freeKickB - 1;
        displayFreeKicksForTeamB(freeKickB);
    }

    // Reset all textviews when pressing on Reset button
    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulsA = 0;
        foulsB = 0;
        freeKickA = 0;
        freeKickB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulsForTeamA(foulsA);
        displayFoulsForTeamB(foulsB);
        displayFreeKicksForTeamA(freeKickA);
        displayFreeKicksForTeamB(freeKickB);

    }

    /**
     * Displays the given score for Team a.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the given fouls for Team B.
     */
    public void displayFoulsForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the given fouls for Team a.
     */
    public void displayFoulsForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(score));

    }

    public void displayFreeKicksForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_free_kicks);
        scoreView.setText(String.valueOf(score));

    }

    public void displayFreeKicksForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_free_kick);
        scoreView.setText(String.valueOf(score));

    }

}
