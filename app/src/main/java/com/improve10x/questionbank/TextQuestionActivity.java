package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TextQuestionActivity extends AppCompatActivity implements IAllMethodsActivity {
    TextView filltextTxt;
    TextView answerTxt;
    Button balnkVerfiyBtn;
    String question;
    String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_question);
        handleInitViews();
        getQuestion();
        displayQuestions();
        handleSubmitBtn();
    }

    private void handleInitViews() {
        filltextTxt = findViewById(R.id.filltext_txt);
        answerTxt = findViewById(R.id.answer_txt);
        balnkVerfiyBtn = findViewById(R.id.blankverfiy_btn);
    }

    @Override
    public void handleSubmitBtn() {
        balnkVerfiyBtn.setOnClickListener(v -> {
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
        filltextTxt.setText(question);
    }

    @Override
    public String getSelectedOptions() {
        String entredAnswer = answerTxt.getText().toString();
        return entredAnswer;
    }

    @Override
    public void verifyAnswer() {
        String correctAnswer = getSelectedOptions();
        if (answer.equalsIgnoreCase(correctAnswer)) {
            Toast.makeText(this, "correct", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "wrong answer", Toast.LENGTH_SHORT).show();
        }
    }
}