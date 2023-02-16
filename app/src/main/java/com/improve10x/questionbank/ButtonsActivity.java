package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ButtonsActivity extends AppCompatActivity {
    Button questiononeBtn;
    Button questiontwoBtn;
    Button questiothreeBtn;

    Button checkboxq1Btn;

    Button checkboxQ2Btn;
    Button checkboxQ3Btn;
    Button trueandfalseBtn;
    Button numberq5Btn;
    Button textq6Btn;
    Button seekbarq1Btn;
    Button seekbarq2Btn;
    Button seekbarq3Btn;
    Button filltheblankBtn;

    Button fillblank2Btn;
    Button fillblank3Btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
        handleInitViews();
        handleQuestion1Btn();
        handleQuestion2Btn();
        handleQuestion3Btn();
        handleCheckbox1Btn();
        handleCheckbox2Btn();
        handleCheckbox3Btn();
        handletrueandfalseBtn();
        handlenumberq5Btn();
        handletextq6Btn();
        handleSeekbarq1Btn();
        handleSeekbarq2Btn();
        handleSeekbarq3Btn();
        handlefillblankBtn1();
        handlefillblanlBTn2();
        handlefillblanlBTn3();
    }

    private void handlefillblanlBTn3() {
        fillblank3Btn.setOnClickListener(v -> {
            String question = " _____________ component is used to suppoer vertical Scrolling";
            String answer = "Scrollview";
            navigatetofilltheblankscreen(question,answer);
        });
    }

    private void handlefillblanlBTn2() {
        fillblank2Btn.setOnClickListener(v -> {
            String question = " Andorid is an ________ ";
            String answer = "Operating System";
            navigatetofilltheblankscreen(question,answer);
        });
    }

    private void handlefillblankBtn1() {
        filltheblankBtn.setOnClickListener(v -> {
            String question = "Java ______ can contain variables and methods";
            String answer = "Class";
            navigatetofilltheblankscreen(question,answer);
        });
    }

    private void handleSeekbarq3Btn() {
        seekbarq3Btn.setOnClickListener(v -> {
            String question = "What is the size of \"double\" data type in bytes";
            String answer = "8";
            navigatetonumberselecteScreen(question,answer);
        });
    }

    private void handleSeekbarq2Btn() {
        seekbarq2Btn.setOnClickListener(v -> {
            String question = "What is the size of  data type in bytes";
            String answer = "8";
            navigatetonumberselecteScreen(question,answer);
        });
    }

    private void handleSeekbarq1Btn() {
        seekbarq1Btn.setOnClickListener(v -> {
            String question = "What is the size of data type in bytes";
            String answer = "4";
            navigatetonumberselecteScreen(question,answer);
        });
    }

    private void handletextq6Btn() {
        textq6Btn.setOnClickListener(v -> {
            String question ="Android emulator takes very less space";
            String answer = "false";
            navigatetotrueorfalse(question,answer);
        });
    }

    private void handlenumberq5Btn() {
        numberq5Btn.setOnClickListener(v -> {
            String question ="Android Studio supports Java programming language";
            String answer = "true";
            navigatetotrueorfalse(question,answer);
        });
    }

    private void handletrueandfalseBtn() {
        trueandfalseBtn.setOnClickListener(v -> {
            String question ="Java is a programming language?";
            String answer = "true";
            navigatetotrueorfalse(question,answer);
        });
    }

    private void handleCheckbox2Btn() {
        checkboxQ2Btn.setOnClickListener(v -> {
            String question = "Select activity lifecycle methods in Android";
            String optionA = "onCreate";
            String  optionB = "onStop";
            String  optionC = "onResume";
            String  optionD = "onPause";
            String answer = "bcd";
            navigateToCheckboxScreen(question,optionA,optionB,optionC,optionD,answer);
        });
    }

    private void handleCheckbox3Btn() {
        checkboxQ3Btn.setOnClickListener(v -> {
            String question ="Which of the following are planets";
            String optionA = "Mercury";
            String optionB = "Sun";
            String optionC = "Jupiter";
            String optionD = "Saturn";
            String answer = "abc";
            navigateToCheckboxScreen(question,optionA,optionB,optionC,optionD,answer);
        });
    }

    private void handleCheckbox1Btn() {
        checkboxq1Btn.setOnClickListener(v -> {
            String question = "Select all the parts of a computer";
            String optionA = " cat";
            String  optionB = "mouse";
            String  optionC = "monitor";
            String  optionD = "keyboard";
            String answer = "a";
            navigateToCheckboxScreen(question,optionA,optionB,optionC,optionD,answer);
        });

    }

    private void handleQuestion3Btn() {
        questiothreeBtn.setOnClickListener(v -> {
            String question = " What will be the output when input is 6. It must return Fizz if the number is divisible by 3.";
            String  optionA = "fizz";
            String  optionB = "buzz";
            String  optionC = "fizz buzz";
            String  optionD = "6";
            String answer = "a";
            navigateToQuestionDeatilsScreen(question,optionA,optionB,optionC,optionD,answer);
        });
    }

    private void handleQuestion2Btn() {
        questiontwoBtn.setOnClickListener(v -> {
            String question = "  Given a = 10, b = 20, return true the sum of both numbers is less than hundred  otherwise return false";
            String  optionA = "true";
            String  optionB = "false";
            String  optionC = "true&false";
            String  optionD = "non above of this";
            String answer ="a";
            navigateToQuestionDeatilsScreen(question,optionA,optionB,optionC,optionD,answer);
        });
    }

    private void handleQuestion1Btn() {
        questiononeBtn.setOnClickListener(v -> {
            String question = "How many plantes are there in solar system";
            String  optionA = "12";
            String  optionB = "8";
            String  optionC = "10";
            String  optionD = "9";
            String answer ="b";
            navigateToQuestionDeatilsScreen(question,optionA,optionB,optionC,optionD,answer);
        });
    }

    private void handleInitViews() {
        questiononeBtn = findViewById(R.id.questionone_btn);
        questiontwoBtn = findViewById(R.id.questiontwo_btn);
        questiothreeBtn = findViewById(R.id.questionthree_btn);
        checkboxq1Btn = findViewById(R.id.checkbox1_btn);
        checkboxQ2Btn = findViewById(R.id.checkboxQ2_btn);
        checkboxQ3Btn = findViewById(R.id.checkboxQ3_btn);
        trueandfalseBtn = findViewById(R.id.truefalse_btn);
        numberq5Btn = findViewById(R.id.numberq5_btn);
        textq6Btn = findViewById(R.id.textq6_btn);
        seekbarq1Btn = findViewById(R.id.seekbarq1_btn);
        seekbarq2Btn = findViewById(R.id.seekbarq2_btn);
        seekbarq3Btn = findViewById(R.id.seekbarq3_btn);
        filltheblankBtn = findViewById(R.id.filltheblank_btn);
        fillblank2Btn = findViewById(R.id.fillblank2_btn);
        fillblank3Btn = findViewById(R.id.fillblank3_btn);
    }
    public void navigateToQuestionDeatilsScreen(String question, String optionA, String optionB, String optionC, String optionD,String answer){
        Intent questionDeatislsIntent = new Intent(this, SingleselectActivity.class);
        questionDeatislsIntent.putExtra("question",question);
        questionDeatislsIntent.putExtra("option1",optionA);
        questionDeatislsIntent.putExtra("option2",optionB);
        questionDeatislsIntent.putExtra("option3",optionC);
        questionDeatislsIntent.putExtra("option4",optionD);
        questionDeatislsIntent.putExtra("answer",answer);
        startActivity(questionDeatislsIntent);
    }
    public void navigateToCheckboxScreen(String question,String optionA, String optionB, String optionC,String optionD,String answer){
        Intent checkBoxIntent = new Intent(this, MultiselectActivity.class);
        checkBoxIntent.putExtra("question",question);
        checkBoxIntent.putExtra("option1",optionA);
        checkBoxIntent.putExtra("option2",optionB);
        checkBoxIntent.putExtra("option3",optionC);
        checkBoxIntent.putExtra("option4",optionD);
        checkBoxIntent.putExtra("answer",answer);
        startActivity(checkBoxIntent);
    }
    public void navigatetotrueorfalse(String question,String answer){
        Intent trueorfalseIntent = new Intent(this,TrueOrFalseQuestionActivity.class);
        trueorfalseIntent.putExtra("question",question);
        trueorfalseIntent.putExtra("answer",answer);
        startActivity(trueorfalseIntent);
    }
    public void navigatetonumberselecteScreen(String question ,String answer){
        Intent numberselectIntent = new Intent(this,NumberSelectQuestionActivity.class);
        numberselectIntent.putExtra("question",question);
        numberselectIntent.putExtra("answer",answer);
        startActivity(numberselectIntent);
    }
    public void navigatetofilltheblankscreen(String question,String answer){
        Intent textquestionIntent = new Intent(this,TextQuestionActivity.class);
        textquestionIntent.putExtra("question",question);
        textquestionIntent.putExtra("answer",answer);
        startActivity(textquestionIntent);
    }
}