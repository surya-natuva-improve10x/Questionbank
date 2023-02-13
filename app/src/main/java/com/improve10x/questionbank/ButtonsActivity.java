package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class ButtonsActivity extends AppCompatActivity {
    Button questiononeBtn;
    Button questiontwoBtn;
    Button questiothreeBtn;

    Button checkboxq1Btn;

    Button checkoxq2Btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
        handleInitViews();
        handleQuestion1Btn();
        handleQuestion2Btn();
        handleQuestion3Btn();
    }

    private void handleQuestion3Btn() {
        questiothreeBtn.setOnClickListener(v -> {
            Toast.makeText(this, "q3 checked", Toast.LENGTH_SHORT).show();
            String question = " What will be the output when input is 6. It must return Fizz if the number is divisible by 3.";
            String  optionA = "fizz";
            String  optionB = "buzz";
            String  optionC = "fizz buzz";
            String  optionD = "6";
            navigateToQuestionDeatilsScreen(question,optionA,optionB,optionC,optionD);
        });
    }

    private void handleQuestion2Btn() {
        questiontwoBtn.setOnClickListener(v -> {
            Toast.makeText(this, "q2 checked", Toast.LENGTH_SHORT).show();
            String question = "  Check if 41 is divisible by 5.";
            String  optionA = "true";
            String  optionB = "false";
            String  optionC = "true&false";
            String  optionD = "non above of this";
            navigateToQuestionDeatilsScreen(question,optionA,optionB,optionC,optionD);
        });
    }

    private void handleQuestion1Btn() {
        questiononeBtn.setOnClickListener(v -> {
            Toast.makeText(this, "q1 clicked", Toast.LENGTH_SHORT).show();
            String question = "How many plantes are there in solar system";
            String  optionA = "12";
            String  optionB = "8";
            String  optionC = "10";
            String  optionD = "9";
            navigateToQuestionDeatilsScreen(question,optionA,optionB,optionC,optionD);
        });
    }

    private void handleInitViews() {
        questiononeBtn = findViewById(R.id.questionone_btn);
        questiontwoBtn = findViewById(R.id.questiontwo_btn);
        questiothreeBtn = findViewById(R.id.questionthree_btn);
        checkboxq1Btn = findViewById(R.id.checkbox1_btn);
        checkoxq2Btn = findViewById(R.id.checkbox2_btn);
    }
    public void navigateToQuestionDeatilsScreen(String question, String optionA, String optionB, String optionC, String optionD){
        Intent questionDeatislsIntent = new Intent(this,QuestionActivity.class);
        questionDeatislsIntent.putExtra("question",question);
        questionDeatislsIntent.putExtra("option1",optionA);
        questionDeatislsIntent.putExtra("option2",optionB);
        questionDeatislsIntent.putExtra("option3",optionC);
        questionDeatislsIntent.putExtra("option4",optionD);
        startActivity(questionDeatislsIntent);
    }
}