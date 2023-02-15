package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class NumberSelectQuestionActivity extends AppCompatActivity implements IAllMethodsActivity{
    TextView seekbartextTxt;
    SeekBar seekbarSb;
    Button seekverfiyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_select_question);
        handleinitViews();
    }

    private void handleinitViews() {
        seekbartextTxt = findViewById(R.id.seekbartext_txt);
        seekbarSb = findViewById(R.id.seekbar_sb);
        seekverfiyBtn = findViewById(R.id.seekverfiy_btn);
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