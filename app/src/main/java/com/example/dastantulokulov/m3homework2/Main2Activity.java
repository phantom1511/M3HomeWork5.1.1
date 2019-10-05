package com.example.dastantulokulov.m3homework2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView;
    String resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.resultTextView);
        Intent intent = getIntent();
        resultText = intent.getStringExtra("textKey");
        textView.setText(resultText);
    }

    public void openCalculator(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);


    }
}
