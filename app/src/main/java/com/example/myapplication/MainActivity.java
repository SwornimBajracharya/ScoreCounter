package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int countA=0;
    private int countB=0;
    private TextView ShowScoreA;
    private TextView ShowScoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //This is a test text comment
        ShowScoreA = findViewById(R.id.ScoreA);
        ShowScoreB = findViewById(R.id.ScoreB);
    }

    public void displayScoreForTeamA(int score){
        ShowScoreA.setText(String.valueOf(score));
    }

    public void displayScoreForTeamB(int score){
        ShowScoreB.setText(String.valueOf(score));
    }

    public void resetScore(View view) {
        countA = 0;
        countA = 0;
        displayScoreForTeamA(countA);
        displayScoreForTeamB(countB);
    }

    public void add3ForTeamA(View view) {
        countA += 3;
        displayScoreForTeamA(countA);
    }
    public void add2ForTeamA(View view) {
        countA += 2;
        displayScoreForTeamA(countA);
    }
    public void add1ForTeamA(View view) {
        countA += 1;
        displayScoreForTeamA(countA);
    }

    public void add3ForTeamB(View view) {
        countB += 3;
        displayScoreForTeamA(countB);
    }
    public void add2ForTeamB(View view) {
        countB += 2;
        displayScoreForTeamA(countB);
    }
    public void add1ForTeamB(View view) {
        countB += 1;
        displayScoreForTeamA(countB);
    }







}

