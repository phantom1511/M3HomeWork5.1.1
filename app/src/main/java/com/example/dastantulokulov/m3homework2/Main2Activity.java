package com.example.dastantulokulov.m3homework2;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Adapter;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Main2Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    MainAdapter adapter;
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

        recyclerView = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new MainAdapter();
        recyclerView.setAdapter(adapter);
    }

    public void openCalculator(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
