package com.example.dastantulokulov.m3homework2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnPlus, btnMinus, btnP, btnDiv, btnEqual, btnDot, btnC;
    EditText editText;

    float Value1, Value2;
    boolean PLUS, MINUS, PERCENT, DIVIDE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.num0);
        btn1 = (Button) findViewById(R.id.num1);
        btn2 = (Button) findViewById(R.id.num2);
        btn3 = (Button) findViewById(R.id.num3);
        btn4 = (Button) findViewById(R.id.num4);
        btn5 = (Button) findViewById(R.id.num5);
        btn6 = (Button) findViewById(R.id.num6);
        btn7 = (Button) findViewById(R.id.num7);
        btn8 = (Button) findViewById(R.id.num8);
        btn9 = (Button) findViewById(R.id.num9);
        btnPlus = (Button) findViewById(R.id.BtnPlus);
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btnMinus = (Button) findViewById(R.id.BtnMinus);
        btnP = (Button) findViewById(R.id.BtnPhr);
        btnEqual = (Button) findViewById(R.id.BtnEqual);
        btnDot = (Button) findViewById(R.id.BtnDot);
        btnC = (Button) findViewById(R.id.BtnC);
        editText = (EditText) findViewById(R.id.numField);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editText == null) {
                    editText.setText("");
                } else {
                    Value1 = Float.parseFloat(editText.getText() + "");
                    PLUS = true;
                    editText.setText(null);
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(editText.getText() + "");
                MINUS = true;
                editText.setText(null);
            }
        });

        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(editText.getText() + "");
                PERCENT = true;
                editText.setText(null);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value1 = Float.parseFloat(editText.getText() + "");
                DIVIDE = true;
                editText.setText(null);
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Value2 = Float.parseFloat(editText.getText() + "");

                if (PLUS == true) {

                    editText.setText(Value1 + Value2 + "");
                    PLUS = false;
                }


                if (MINUS == true) {
                    editText.setText(Value1 - Value2 + "");
                    MINUS = false;
                }

                if (PERCENT == true) {
                    editText.setText(Value1 * Value2 / 100 + "");
                    PERCENT = false;
                }

                if (DIVIDE == true) {
                    editText.setText(Value1 / Value2 + "");
                    DIVIDE = false;
                }
            }
        });

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });
    }
    /*String num1, num2, sum;
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

    }*/


}
