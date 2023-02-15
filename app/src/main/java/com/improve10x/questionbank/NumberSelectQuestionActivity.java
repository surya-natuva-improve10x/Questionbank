package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class NumberSelectQuestionActivity extends AppCompatActivity implements IAllMethodsActivity{
    TextView seekbartextTxt;
    SeekBar seekbarSb;
    Button seekverfiyBtn;
    String question;
    String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_select_question);
        handleinitViews();
        getQuestion();
        handleSubmitBtn();
        displayQuestions();

    }

    private void handleinitViews() {
        seekbartextTxt = findViewById(R.id.seekbartext_txt);
        seekbarSb = findViewById(R.id.seekbar_sb);
        seekverfiyBtn = findViewById(R.id.seekverfiy_btn);
    }

    @Override
    public void handleSubmitBtn() {
        seekverfiyBtn.setOnClickListener(v -> {
            verifyAnswer();
        });

    }

    @Override
    public void getQuestion() {
        Intent intent = getIntent();
        question = intent.getStringExtra("question");
        answer = intent.getStringExtra("answer");

    }

    @Override
    public void displayQuestions() {
        seekbartextTxt.setText(question);

    }

    @Override
    public String getSelectedOptions() {
        int progress = seekbarSb.getProgress();
        return progress + "";
    }

    @Override
    public void verifyAnswer() {
        String correctAnswer = getSelectedOptions();
        if (answer.equalsIgnoreCase(correctAnswer)) {
            Toast.makeText(this, "correct answer", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "wrong answer", Toast.LENGTH_SHORT).show();
        }
    }
}