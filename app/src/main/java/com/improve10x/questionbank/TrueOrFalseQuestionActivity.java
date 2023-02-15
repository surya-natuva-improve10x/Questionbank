package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class TrueOrFalseQuestionActivity extends AppCompatActivity implements IAllMethodsActivity {
    TextView textviewtrueTxt;
    RadioGroup radiogroupRg;
    RadioButton trueradioRb;
    RadioButton falseradioRb;
    Button verifyTrueBtn;
    String question;
    String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true_or_false_question);
        inIntViews();
        getQuestion();
        displayQuestions();
        handleSubmitBtn();

    }

    private void inIntViews() {
        textviewtrueTxt =findViewById(R.id.textviewtrue_txt);
        radiogroupRg = findViewById(R.id.radiogroup_rg);
        trueradioRb = findViewById(R.id.trueradio_rb);
        falseradioRb = findViewById(R.id.falseradio_rb);
        verifyTrueBtn = findViewById(R.id.verify_true_btn);

    }

    @Override
    public void handleSubmitBtn() {
        verifyTrueBtn.setOnClickListener(v -> {
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
        textviewtrueTxt.setText(question);
    }

    @Override
    public String getSelectedOptions() {
        int selectedOption = radiogroupRg.getCheckedRadioButtonId();
        String result = "";
        if(selectedOption == R.id.trueradio_rb){
            result = "true";
        }else if (selectedOption == R.id.falseradio_rb){
            result = "false";
        }
        return result;
    }

    @Override
    public void verifyAnswer() {
        String correctAnswer = getSelectedOptions();
        if(answer.equals(correctAnswer)){
            Toast.makeText(this, "correct answer", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "wrong answer", Toast.LENGTH_SHORT).show();
        }
    }
}