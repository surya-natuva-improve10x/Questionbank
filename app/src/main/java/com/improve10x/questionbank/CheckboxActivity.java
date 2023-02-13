package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class CheckboxActivity extends AppCompatActivity {
    TextView checkboxcbTxt;
    CheckBox optionaCb;
    CheckBox optionbCb;
    CheckBox optioncCb;
    CheckBox optionDCb;
    Button verifyBtn;
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
}