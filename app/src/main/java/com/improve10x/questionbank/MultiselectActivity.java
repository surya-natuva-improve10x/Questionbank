package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MultiselectActivity extends AppCompatActivity implements IAllMethodsActivity {
    TextView checkboxcbTxt;
    CheckBox optionaCb;
    CheckBox optionbCb;
    CheckBox optioncCb;
    CheckBox optionDCb;
    Button verifyBtn;
    String question;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        inItViews();
    }


    private void inItViews() {
        checkboxcbTxt = findViewById(R.id.cbquestion_txt);
        optionaCb = findViewById(R.id.optiona_cb);
        optionbCb = findViewById(R.id.optionb_cb);
        optioncCb = findViewById(R.id.optionc_cb);
        optionDCb = findViewById(R.id.optiond_cb);
        verifyBtn = findViewById(R.id.verfiy_btn);
    }

    @Override
    public void handleSubmitBtn() {
        verifyBtn.setOnClickListener(v -> {

        });
    }

    @Override
    public void getQuestion() {
        Intent intent = getIntent();
        question = intent.getStringExtra("question");
        optionA = intent.getStringExtra("option1");
        optionB = intent.getStringExtra("option2");
        optionC = intent.getStringExtra("option3");
        optionD = intent.getStringExtra("option4");
        answer = intent.getStringExtra("answer");
    }

    @Override
    public void displayQuestions() {
        checkboxcbTxt.setText(question);
        optionaCb.setText(optionA);
        optionbCb.setText(optionB);
        optioncCb.setText(optionC);
        optionDCb.setText(optionD);
    }

    @Override
    public String getSelectedOptions() {

        return null;
    }

    @Override
    public void verifyAnswer() {

    }
}