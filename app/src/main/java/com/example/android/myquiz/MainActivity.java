package com.example.android.myquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup quizGroup1;
    RadioGroup quizGroup4;
    RadioGroup quizGroup6;
    RadioGroup quizGroup8;
    ScrollView ScrollVw;
    CheckBox cBox5a;
    CheckBox cBox5b;
    CheckBox cBox5c;
    CheckBox cBox7a;
    CheckBox cBox7b;
    CheckBox cBox7c;
    EditText eTxt2;
    EditText eTxt3;
    EditText eTxt9;
    EditText eTxt10;
    int totScore = 0;
    String ans1;
    String ans4;
    String ans6;
    String ans8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quizGroup1 = (RadioGroup) findViewById(R.id.radioGroup1);
        quizGroup4 = (RadioGroup) findViewById(R.id.radioGroup4);
        quizGroup6 = (RadioGroup) findViewById(R.id.radioGroup6);
        quizGroup8 = (RadioGroup) findViewById(R.id.radioGroup8);
        ScrollVw = (ScrollView) findViewById(R.id.scrlVw);
        eTxt2 = (EditText) findViewById(R.id.ans2);
        eTxt3 = (EditText) findViewById(R.id.ans3);
        eTxt9 = (EditText) findViewById(R.id.ans9);
        eTxt10 = (EditText) findViewById(R.id.ans10);
        cBox5a = (CheckBox) findViewById(R.id.check5a);
        cBox5b = (CheckBox) findViewById(R.id.check5b);
        cBox5c = (CheckBox) findViewById(R.id.check5c);
        cBox7a = (CheckBox) findViewById(R.id.check7a);
        cBox7b = (CheckBox) findViewById(R.id.check7b);
        cBox7c = (CheckBox) findViewById(R.id.check7c);
    }

    public void resetButtonClick(View View) {

        //Reset the Total Score
        totScore = 0;
        //Reset the Answers for RadioGroup
        ans1 = " ";
        ans4 = " ";
        ans6 = " ";
        ans8 = " ";
        //Reset the Edit Text fields
        eTxt2.getText().clear();
        eTxt3.getText().clear();
        eTxt9.getText().clear();
        eTxt10.getText().clear();
        //Reset the Radio Button selections
        quizGroup1.clearCheck();
        quizGroup4.clearCheck();
        quizGroup6.clearCheck();
        quizGroup8.clearCheck();
        //Reset the CheckBox selections
        if (cBox5a.isChecked()) {
            cBox5a.setChecked(false);
        }
        if (cBox5b.isChecked()) {
            cBox5b.setChecked(false);
        }
        if (cBox5c.isChecked()) {
            cBox5c.setChecked(false);
        }
        if (cBox7a.isChecked()) {
            cBox7a.setChecked(false);
        }
        if (cBox7b.isChecked()) {
            cBox7b.setChecked(false);
        }
        if (cBox7c.isChecked()) {
            cBox7c.setChecked(false);
        }

        ScrollVw.fullScroll(ScrollView.FOCUS_UP);
    }

    public void submitButtonClick(View View) {
        totScore = 0;
        int fnl5 = 0;
        int fnl7 = 0;
        int unfin = 0;
        String ans5;
        String ans7;
        String cmtTxt;
        //Q1
        int fAns = getResources().getIdentifier("A1", "string", getPackageName());
        String finalAns = getText(fAns).toString();
        if (finalAns.equals(ans1)) {
            totScore = totScore + 1;
        }
        if (ans1.equals("")){
            unfin = 1;
        }
        //Q2
        String ans = eTxt2.getText().toString().toUpperCase();
        fAns = getResources().getIdentifier("A2", "string", getPackageName());
        finalAns = getText(fAns).toString();
        if (finalAns.equals(ans)) {
            totScore = totScore + 1;
        }
        if (ans.equals("")){
            unfin = 1;
        }
        //Q3
        ans = eTxt3.getText().toString().toUpperCase();
        fAns = getResources().getIdentifier("A3", "string", getPackageName());
        finalAns = getText(fAns).toString();
        if (finalAns.equals(ans)) {
            totScore = totScore + 1;
        }
        if (ans.equals("")){
            unfin = 1;
        }
        //Q4
        fAns = getResources().getIdentifier("A4", "string", getPackageName());
        finalAns = getText(fAns).toString();
        if (finalAns.equals(ans4)) {
            totScore = totScore + 1;
        }
        if (ans4.equals("")){
            unfin = 1;
        }
        //Q5
        if (cBox5a.isChecked()) {
            fnl5 = fnl5 + 1;
        }
        if (cBox5b.isChecked()) {
            fnl5 = fnl5 + 3;
        }
        if (cBox5c.isChecked()) {
            fnl5 = fnl5 + 5;
        }
        ans5 = String.valueOf(fnl5);
        fAns = getResources().getIdentifier("A5", "string", getPackageName());
        finalAns = getText(fAns).toString();
        if (finalAns.equals(ans5)) {
            totScore = totScore + 1;
        }
        if (fnl5 == 0){
            unfin = 1;
        }
        //Q6
        fAns = getResources().getIdentifier("A6", "string", getPackageName());
        finalAns = getText(fAns).toString();
        if (finalAns.equals(ans6)) {
            totScore = totScore + 1;
        }
        if (ans6.equals("")){
            unfin = 1;
        }
        //Q7
        if (cBox7a.isChecked()) {
            fnl7 = fnl7 + 1;
        }
        if (cBox7b.isChecked()) {
            fnl7 = fnl7 + 3;
        }
        if (cBox7c.isChecked()) {
            fnl7 = fnl7 + 5;
        }
        ans7 = String.valueOf(fnl7);
        fAns = getResources().getIdentifier("A7", "string", getPackageName());
        finalAns = getText(fAns).toString();
        if (finalAns.equals(ans7)) {
            totScore = totScore + 1;
        }
        if (fnl7 == 0){
            unfin = 1;
        }
        //Q8
        fAns = getResources().getIdentifier("A8", "string", getPackageName());
        finalAns = getText(fAns).toString();
        if (finalAns.equals(ans8)) {
            totScore = totScore + 1;
        }
        if (ans8.equals("")){
            unfin = 1;
        }
        //Q9
        ans = eTxt9.getText().toString().toUpperCase();
        fAns = getResources().getIdentifier("A9", "string", getPackageName());
        finalAns = getText(fAns).toString();
        if (finalAns.equals(ans)) {
            totScore = totScore + 1;
        }
        if (ans.equals("")){
            unfin = 1;
        }
        //Q10
        ans = eTxt10.getText().toString().toUpperCase();
        fAns = getResources().getIdentifier("A10", "string", getPackageName());
        finalAns = getText(fAns).toString();
        if (finalAns.equals(ans)) {
            totScore = totScore + 1;
        }
        if (ans.equals("")){
            unfin = 1;
        }
        //grade the answer
        cmtTxt = " ";
        if (totScore > 8) {
            cmtTxt = "Your Score is " + totScore + "\n" + "Excellent Job!!!";
        } else if (totScore > 5) {
            cmtTxt = "Your Score is " + totScore + "\n" + "Good.";
        } else if (totScore >= 1) {
            cmtTxt = "Your Score is " + totScore + "\n" + "Not bad.";
        } else if (totScore == 0) {
            cmtTxt = "Your Score is " + totScore + "\n" + "Better Luck next time...";
        }
        //Display the score only if all the questions were attempted
        if (unfin == 1) {
            cmtTxt = "Please answer all the questions.";
        }
        Toast.makeText(this, cmtTxt, Toast.LENGTH_SHORT).show();
    }

    public void radio1Clicked(View View) {
        //identify which option was selected by the user by understanding the radio button click
        int selectedId = quizGroup1.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(selectedId);
        ans1 = radioButton.getText().toString();
    }

    public void radio4Clicked(View View) {
        //identify which option was selected by the user by understanding the radio button click
        int selectedId = quizGroup4.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(selectedId);
        ans4 = radioButton.getText().toString();
    }

    public void radio6Clicked(View View) {
        //identify which option was selected by the user by understanding the radio button click
        int selectedId = quizGroup6.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(selectedId);
        ans6 = radioButton.getText().toString();
    }

    public void radio8Clicked(View View) {
        //identify which option was selected by the user by understanding the radio button click
        int selectedId = quizGroup8.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(selectedId);
        ans8 = radioButton.getText().toString();
    }
}
