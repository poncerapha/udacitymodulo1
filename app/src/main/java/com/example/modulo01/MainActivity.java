package com.example.modulo01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(teamAScore);

    }


    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void twoPointsThrow(View view) {
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
        return;
    }

    public void threePointsThrow(View view) {
        teamAScore = teamAScore + 3;
        displayForTeamA(teamAScore);
        return;
    }

    public void freeThrow(View view) {
        teamAScore++;
        displayForTeamA(teamAScore);
        return;
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void twoPointsThrowb(View view) {
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
        return;
    }

    public void threePointsThrowb(View view) {
        teamBScore = teamBScore + 3;
        displayForTeamB(teamBScore);
        return;
    }

    public void freeThrowb(View view) {
        teamBScore++;
        displayForTeamB(teamBScore);
        return;
    }

    public void resetScore(View view) {
        teamAScore = 0;
        displayForTeamA(teamAScore);

        teamBScore = 0;
        displayForTeamB(teamBScore);
    }


}
