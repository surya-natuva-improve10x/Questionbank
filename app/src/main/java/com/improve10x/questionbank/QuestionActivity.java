package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class QuestionActivity extends AppCompatActivity {
    TextView textviewTxt;
    RadioGroup radiogroupRg;
    RadioButton radiooneRb;
    RadioButton radiotwoRb;
    RadioButton radiothreeRb;
    RadioButton radiofourRb;
    String question;
    String optionA;
    String optionB;
    String optionC;
    String optionD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        initviews();
        getQuestions();
        displayQuestions();
    }

    private void getQuestions() {
        Intent intent = getIntent();
        question = intent.getStringExtra("question");
        optionA = intent.getStringExtra("option1");
        optionB = intent.getStringExtra("option2");
        optionC = intent.getStringExtra("option3");
        optionD = intent.getStringExtra("option4");
    }


    private void initviews() {
        textviewTxt = findViewById(R.id.textview_txt);
        radiogroupRg = findViewById(R.id.radiogroup_rg);
        radiooneRb = findViewById(R.id.radioone_rb);
        radiotwoRb = findViewById(R.id.radiotwo_rb);
        radiothreeRb = findViewById(R.id.radiothree_rb);
        radiofourRb = findViewById(R.id.radiofour_rb);
    }
    private  void displayQuestions(){
        textviewTxt.setText(question);
        radiooneRb.setText(optionA);
        radiotwoRb.setText(optionB);
        radiothreeRb.setText(optionC);
        radiofourRb.setText(optionD);
    }
}