package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NumberSelectQuestionActivity extends AppCompatActivity implements IAllMethodsActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_select_question);
    }

    @Override
    public void handleSubmitBtn() {

    }

    @Override
    public void getQuestion() {

    }

    @Override
    public void displayQuestions() {

    }

    @Override
    public String getSelectedOptions() {
        return null;
    }

    @Override
    public void verifyAnswer() {

    }
}