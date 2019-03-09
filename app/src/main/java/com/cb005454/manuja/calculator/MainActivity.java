package com.cb005454.manuja.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 int a=0;
 TextView textView;
 String numm="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void values(View view) {
      textView  = findViewById(R.id.textView);
        switch (view.getId()){
           case R.id.button:
               numm = numm+ "1";
                textView.setText(numm);
              //  a = 1;
                break;
            case R.id.button2:
                numm = numm+ "2";
                textView.setText(numm);
              //  a = 2;
                break;
            case R.id.button3:
                numm = numm+ "3";
                textView.setText(numm);
                a = 3;
                break;
            case R.id.button4:
                numm = numm+ "4";
                textView.setText(numm);
                a = 4;
                break;
            case R.id.button5:
                numm = numm+ "5";
                textView.setText(numm);
                a = 5;
                break;
            case R.id.button6:
                numm = numm+ "6";
                textView.setText(numm);
                a = 6;
                break;
            case R.id.button7:
                numm = numm+ "7";
                textView.setText(numm);
                a = 7;
                break;
             case R.id.button8:
                 numm = numm+ "8";
                 textView.setText(numm);;
                a = 8;
                break;
             case R.id.button9:
                 numm = numm+ "9";
                 textView.setText(numm);
                a = 9;
                break;
             case R.id.button11:
                 numm = numm+ "0";
                 textView.setText(numm);
                a = 0;
                break;
            case R.id.button10:
                numm = numm+ ".";
                textView.setText(numm);
                break;
            case R.id.button25:
                numm = numm+ "+";
                textView.setText(numm);
                break;
            case R.id.button24:
                numm = numm+ "-";
                textView.setText(numm);
                break;
            case R.id.button23:
                numm = numm+ "/";
                textView.setText(numm);
                break;
            case R.id.button26:
                numm = numm+ "*";
                textView.setText(numm);
                break;
            case R.id.button27:
                numm = numm+ "%";
                textView.setText(numm);
                break;
            case R.id.button28:
                numm="";
                textView.setText(numm);
                break;

        }

    }
}
