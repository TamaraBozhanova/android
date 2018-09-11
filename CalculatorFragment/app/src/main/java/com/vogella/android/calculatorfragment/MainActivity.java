package com.vogella.android.calculatorfragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends FragmentActivity {

    private EditText numberField1;
    private EditText numberField2;
    private TextView resultField;

    private FragmentResult fragmentResult;
    private FragmentManager manager;
    private FragmentTransaction transaction;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getSupportFragmentManager();
    }


    // обработка нажатия на кнопку операции
    public void onOperationClick(View view) {
        double result = 0;
        EditText numberone = (EditText) findViewById(R.id.numberField1);
        EditText numbertwo = (EditText) findViewById(R.id.numberField2);
        double numberOne = Double.parseDouble(numberone.getText().toString());
        double numberTwo = Double.parseDouble(numbertwo.getText().toString());
        Button btn = (Button) view;
        switch (btn.getId()) {
            case R.id.btn_plus:
                result = numberOne + numberTwo;
                break;
            case R.id.btn_minus:
                result = numberOne - numberTwo;
                break;
            case R.id.btn_division:
                result = numberOne / numberTwo;
                break;
            case R.id.btn_multiply:
                result = numberOne * numberTwo;
                break;
        }
        createView(String.valueOf(result));
        numberone.setText("");
        numbertwo.setText("");
    }

    public void createView(String result)
    {
        fragmentResult = new FragmentResult(result);
        transaction = manager.beginTransaction();
        transaction.add(R.id.contener, fragmentResult);
        transaction.commit();
    }

}

