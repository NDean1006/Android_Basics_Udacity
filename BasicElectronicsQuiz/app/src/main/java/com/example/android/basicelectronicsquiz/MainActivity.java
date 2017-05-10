package com.example.android.basicelectronicsquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Q1a boolean logic
    public void submitScore(View view) {
        //question one boolen logic
        RadioButton q1A = (RadioButton) findViewById(R.id.q1A);
        Boolean question1A = q1A.isChecked();
        RadioButton q1B = (RadioButton) findViewById(R.id.q1B);
        Boolean question1B = q1B.isChecked();
        RadioButton q1C = (RadioButton) findViewById(R.id.q1C);
        Boolean question1C = q1C.isChecked();
        //question two editable text question
        EditText isQ2True = (EditText) findViewById(R.id.q2);
        String Resist = isQ2True.getText().toString();
        //question three boolean logic
        CheckBox q3A = (CheckBox) findViewById(R.id.q3A);
        Boolean question3A = q3A.isChecked();
        CheckBox q3B = (CheckBox) findViewById(R.id.q3B);
        Boolean question3B = q3B.isChecked();
        CheckBox q3C = (CheckBox) findViewById(R.id.q3C);
        Boolean question3C = q3C.isChecked();
        //question four logic
        RadioButton q4A = (RadioButton) findViewById(R.id.q4A);
        Boolean question4A = q4A.isChecked();
        RadioButton q4B = (RadioButton) findViewById(R.id.q4B);
        Boolean question4B = q4B.isChecked();


        // score message
        int answer = calculateScore(question1A, question1B, question1C, Resist, question3A, question3B, question3C, question4A, question4B);
        String ScoreMessage = createScoreSummary(answer);
        displayMessage(ScoreMessage);

    }

    private int calculateScore(boolean question1A, boolean question1B, boolean question1C, String Resist, boolean question3A, boolean question3B, boolean question3C, boolean question4A, boolean question4B) {
        int answer = 0;
        if (question1C == false) {
            if (question1B == false) {
                if (question1A) {
                    answer += 25;
                }
            }
        }
        if (Resist.equals("Resistor")) {
            answer += 25;

        }
        if (!!question3C && question3A && question3B) {
            answer += 25;
        }
        if (question4B) {
            answer += 25;
        }

        Toast.makeText(getApplicationContext(), "SCORE " + answer, Toast.LENGTH_LONG).show();

        return answer;
    }


    private String createScoreSummary(int answer) {
        if (answer >= 80) {
            String message = answer + "!!! Great Job!";
            return message;
        } else {
            String message = answer + "... Do you even read?";
            return message;
        }
    }


    // score display
    private void displayMessage(String message) {
        TextView scoreSummaryTextView = (TextView) findViewById(R.id.scoreSummary);
        scoreSummaryTextView.setText(message);
    }


}




