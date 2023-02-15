package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TextQuestionActivity extends AppCompatActivity implements IAllMethodsActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_question);
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