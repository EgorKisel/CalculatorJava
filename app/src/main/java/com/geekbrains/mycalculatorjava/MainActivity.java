package com.geekbrains.mycalculatorjava;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Calculator calculator = new Calculator();

    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonPlus;
    Button buttonMinus;
    Button buttonPoint;
    Button buttonEquals;
    Button buttonMultiply;
    Button buttonAC;
    Button buttonPlusMinus;
    Button buttonDel;
    Button buttonDivide;
    TextView mathematicsResult;



    String action = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputButton();
        setButton();


    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable("Calculator", calculator);
        outState.putString("Action", action);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        calculator = (Calculator) savedInstanceState.getSerializable("Calculator");
        mathematicsResult.setText(calculator.getStrCount());
        action = savedInstanceState.getString("Action");

    }


    private void inputButton() {
        button0 = findViewById(R.id.button_0);
        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);
        button3 = findViewById(R.id.button_3);
        button4 = findViewById(R.id.button_4);
        button5 = findViewById(R.id.button_5);
        button6 = findViewById(R.id.button_6);
        button7 = findViewById(R.id.button_7);
        button8 = findViewById(R.id.button_8);
        button9 = findViewById(R.id.button_9);
        buttonPlus = findViewById(R.id.button_plus);
        buttonMinus = findViewById(R.id.button_minus);
        buttonPoint = findViewById(R.id.button_point);
        buttonEquals = findViewById(R.id.button_equals);
        buttonMultiply = findViewById(R.id.button_multiply);
        buttonAC = findViewById(R.id.button_AC);
        buttonPlusMinus = findViewById(R.id.button_plus_minus);
        buttonDel = findViewById(R.id.button_del);
        buttonDivide = findViewById(R.id.button_divide);
        mathematicsResult = findViewById(R.id.mathematics_result);
    }

    private void setButton() {
        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonPoint.setOnClickListener(this);
        buttonEquals.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonAC.setOnClickListener(this);
        buttonPlusMinus.setOnClickListener(this);
        buttonDel.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Button btn = (Button) view;
        // mathematicsResult.setText(mathematicsResult.getText() + btn.getText().toString());
        switch (view.getId()) {
            case R.id.button_0: {
                calculator.setStrCount(calculator.getStrCount().concat(calculator.getZero()));
                mathematicsResult.setText(calculator.getStrCount());
                break;
            }
            case R.id.button_1: {
                calculator.setStrCount(calculator.getStrCount().concat(calculator.getOne()));
                mathematicsResult.setText(calculator.getStrCount());
                break;
            }
            case R.id.button_2: {
                calculator.setStrCount(calculator.getStrCount().concat(calculator.getTwo()));
                mathematicsResult.setText(calculator.getStrCount());
                break;
            }
            case R.id.button_3: {
                calculator.setStrCount(calculator.getStrCount().concat(calculator.getThree()));
                mathematicsResult.setText(calculator.getStrCount());
                break;
            }
            case R.id.button_4: {
                calculator.setStrCount(calculator.getStrCount().concat(calculator.getFour()));
                mathematicsResult.setText(calculator.getStrCount());
                break;
            }
            case R.id.button_5: {
                calculator.setStrCount(calculator.getStrCount().concat(calculator.getFive()));
                mathematicsResult.setText(calculator.getStrCount());
                break;
            }
            case R.id.button_6: {
                calculator.setStrCount(calculator.getStrCount().concat(calculator.getSix()));
                mathematicsResult.setText(calculator.getStrCount());
                break;
            }
            case R.id.button_7: {
                calculator.setStrCount(calculator.getStrCount().concat(calculator.getSeven()));
                mathematicsResult.setText(calculator.getStrCount());
                break;
            }
            case R.id.button_8: {
                calculator.setStrCount(calculator.getStrCount().concat(calculator.getEight()));
                mathematicsResult.setText(calculator.getStrCount());
                break;
            }
            case R.id.button_9: {
                calculator.setStrCount(calculator.getStrCount().concat(calculator.getNine()));
                mathematicsResult.setText(calculator.getStrCount());
                break;
            }
            case R.id.button_point: {
                int indexM = calculator.getStrCount().indexOf(".");
                if (indexM == -1) {
                    calculator.setStrCount(calculator.getStrCount().concat(calculator.getPoint()));
                    mathematicsResult.setText(calculator.getStrCount());
                } else {
                    break;
                }
                break;

            }
            case R.id.button_plus: {
                if (calculator.getStrCount().length() != 0) {
                    calculator.setQ(Integer.parseInt((String) mathematicsResult.getText()));
                    mathematicsResult.setText("");
                    calculator.setStrCount("");
                    action = "+";
                }
                break;
            }
            case R.id.button_minus: {
                if (calculator.getStrCount().length() != 0) {
                    calculator.setQ(Integer.parseInt((String) mathematicsResult.getText()));
                    mathematicsResult.setText("");
                    calculator.setStrCount("");
                    action = "-";
                }
                break;
            }

            case R.id.button_multiply: {
                if (calculator.getStrCount().length() != 0) {
                    calculator.setQ(Integer.parseInt((String) mathematicsResult.getText()));
                    mathematicsResult.setText("");
                    calculator.setStrCount("");
                    action = "x";
                }
                break;
            }
            case R.id.button_divide: {
                if (calculator.getStrCount().length() != 0) {
                    calculator.setQ(Integer.parseInt((String) mathematicsResult.getText()));
                    mathematicsResult.setText("");
                    calculator.setStrCount("");
                    action = "/";
                }
                break;
            }
            case R.id.button_AC: {
                calculator.setQ(0);
                mathematicsResult.setText("");
                calculator.setStrCount("");
                action = "";
                break;
            }

            case R.id.button_del: {
                if (calculator.getStrCount().length() != 0) {
                    calculator.delChar();
                }
                mathematicsResult.setText(calculator.getStrCount());
                break;
            }

            case R.id.button_equals: {
                if (action.equals("+")) {
                    int d = Integer.parseInt((String) mathematicsResult.getText());
                    int c = calculator.sum(calculator.getQ(), d);
                    calculator.setStrCount(String.valueOf(c));
                    mathematicsResult.setText(calculator.getStrCount());
                    action = "";
                    break;
                } else if (action.equals("-")) {
                    int d = Integer.parseInt((String) mathematicsResult.getText());
                    int c = calculator.min(calculator.getQ(), d);
                    calculator.setStrCount(String.valueOf(c));
                    mathematicsResult.setText(calculator.getStrCount());
                    action = "";
                    break;
                } else if (action.equals("x")) {
                    int d = Integer.parseInt((String) mathematicsResult.getText());
                    int c = calculator.multip(calculator.getQ(), d);
                    calculator.setStrCount(String.valueOf(c));
                    mathematicsResult.setText(calculator.getStrCount());
                    action = "";
                    break;
                } else if (action.equals("/")) {
                    int d = Integer.parseInt((String) mathematicsResult.getText());
                    int c = calculator.div(calculator.getQ(), d);
                    calculator.setStrCount(String.valueOf(c));
                    mathematicsResult.setText(calculator.getStrCount());
                    action = "";
                    break;
                } else {
                    calculator.setStrCount("");
                    mathematicsResult.setText(calculator.getStrCount());
                    break;
                }
            }

        }
    }
}