package com.example.dastantulokulov.m3homework2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    String num1, num2, sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.numField);
        final TextView textBtnC = findViewById(R.id.BtnC);

        textBtnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText != null) {
                    editText.setText(" ");
                } else {
                    editText.setText(" ");
                }

            }
        });

        final TextView textBtn7 = findViewById(R.id.num7);
        textBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText != null) {
                    num1=editText.getText().toString();
                    num2=editText.getText().toString();
                    editText.setText(editText.getText() + "7");
                } else {
                    editText.setText(editText.getText() + "7");
                }

            }
        });

        final TextView textBtn8 = findViewById(R.id.num8);
        textBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText != null) {
                    num1=editText.getText().toString();
                    num2=editText.getText().toString();
                    editText.setText(editText.getText() + "8");
                } else {
                    editText.setText(editText.getText() + "7");
                }

            }
        });

        final TextView textBtn9 = findViewById(R.id.num9);
        textBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText != null) {
                    editText.setText(editText.getText() + "9");
                } else {
                    editText.setText(editText.getText() + "9");
                }

            }
        });

        final TextView textBtn4 = findViewById(R.id.num4);
        textBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText != null) {
                    editText.setText(editText.getText() + "4");
                } else {
                    editText.setText(editText.getText() + "4");
                }

            }
        });

        final TextView textBtn5 = findViewById(R.id.num5);
        textBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText != null) {
                    editText.setText(editText.getText() + "5");
                } else {
                    editText.setText(editText.getText() + "5");
                }

            }
        });

        final TextView textBtn6 = findViewById(R.id.num6);
        textBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText != null) {
                    editText.setText(editText.getText() + "6");
                } else {
                    editText.setText(editText.getText() + "6");
                }
            }
        });

        final TextView textBtn1 = findViewById(R.id.num1);
        textBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText != null) {
                    editText.setText(editText.getText() + "1");
                } else {
                    editText.setText(editText.getText() + "1");
                }
            }
        });

        final TextView textBtn2 = findViewById(R.id.num2);
        textBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText != null) {
                    editText.setText(editText.getText() + "2");
                } else {
                    editText.setText(editText.getText() + "2");
                }

            }
        });

        final TextView textBtn3 = findViewById(R.id.num3);
        textBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText != null) {
                    editText.setText(editText.getText() + "3");
                } else {
                    editText.setText(editText.getText() + "3");
                }
            }

        });

        final TextView textBtn0 = findViewById(R.id.num0);
        textBtn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText != null) {
                    editText.setText(editText.getText() + "0");
                } else {
                    editText.setText(editText.getText() + "0");
                }

            }
        });

        final TextView textBtnPlus = findViewById(R.id.BtnPlus);
        textBtnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText != null) {
                    editText.setText("+");
                } else {
                    editText.setText("+");
                }

            }
        });

        final TextView textBtnMinus = findViewById(R.id.BtnMinus);
        textBtnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText != null) {
                    editText.setText("-");
                } else {
                    editText.setText("-");
                }

            }
        });

        final TextView textBtnDivide = findViewById(R.id.BtnDiv);
        textBtnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText != null) {
                    editText.setText("/");
                } else {
                    editText.setText("/");
                }

            }
        });

        final TextView textBtnPhr = findViewById(R.id.BtnPhr);
        textBtnPhr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText != null) {
                    editText.setText("%");
                } else {
                    editText.setText("%");
                }

            }
        });

        final TextView textBtnDot = findViewById(R.id.BtnDot);
        textBtnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText != null) {
                    editText.setText(editText.getText() + ".");
                } else {
                    editText.setText(editText.getText() + ".");
                }

            }
        });

        final TextView textBtnEqual = findViewById(R.id.BtnEqual);
        textBtnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText != null) {
                    for (int i = 0; i < 10; i++) {
                        if (textBtn7.getText().equals(i)){
                            if (textBtnPlus.getText().equals(findViewById(R.id.BtnPlus))){
                                sum = num1 + num2;
                                editText.setText(sum);
                            }
                        }
                        if (textBtn8.getText().equals(i)){
                            if (textBtnPlus.getText().equals(findViewById(R.id.BtnPlus))){
                                sum = num1 + num2;
                                editText.setText(sum);
                            }
                        }
                    }
                }
            }
        });

    }


}
