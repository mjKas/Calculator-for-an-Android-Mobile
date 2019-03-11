package com.cb005454.manuja.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 double a=0, no1; int no2; String Oppp, display;
 TextView textView, textview2;
 boolean ispointvalueClicked = true;
 String numm="", op="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView  = findViewById(R.id.textView);
        textview2 = findViewById(R.id.textView2);
    }

    public void values(View view) {
        switch (view.getId()){
           case R.id.button:
               numm = numm+ "1";
                 a = 1;
                finaleval(a);
                break;
            case R.id.button2:
                numm = numm+ "2";
               // textView.setText(numm);
                 a = 2;
                finaleval(a);
                break;
            case R.id.button3:
                numm = numm+ "3";
              //  textView.setText(numm);
                a = 3;
                finaleval(a);
                break;
            case R.id.button4:
                numm = numm+ "4";
              //  textView.setText(numm);
                a = 4;
                finaleval(a);
                break;
            case R.id.button5:
                numm = numm+ "5";
                //textView.setText(numm);

                a = 5;
                finaleval(a);
               // textView.setText(finaleval(a));
                break;
            case R.id.button6:
                numm = numm+ "6";
              //  textView.setText(numm);
                a = 6;
                finaleval(a);
                break;
            case R.id.button7:
                numm = numm+ "7";
               // textView.setText(numm);
                a = 7;
                finaleval(a);
                break;
             case R.id.button8:
                 numm = numm+ "8";
                // textView.setText(numm);;
                a = 8;
                finaleval(a);
                break;
             case R.id.button9:
                 numm = numm+ "9";
               //  textView.setText(numm);
                a = 9;
                finaleval(a);
                break;
             case R.id.button11:
                 numm = numm+ "0";
               //  textView.setText(numm);
                a = 0;
                finaleval(a);
                break;
            case R.id.button10:

                if(ispointvalueClicked){
                    numm = numm+ ".";
                    textView.setText(numm);
                    ispointvalueClicked = false;
                }


                break;
            case R.id.button25:
                op = "+";
                textview2.setText(op);
                opptr("+");
                break;
            case R.id.button24:
                op =  "-";
                opptr("-");
                textview2.setText(op);
                break;
            case R.id.button23:
                op =  "/";
                opptr("/");
                textview2.setText(op);
                break;
            case R.id.button26:
                op = "*";
                opptr("*");
                textview2.setText(op);
                break;
            case R.id.button27:
                op =  "%";
                opptr("%");
                textview2.setText(op);
                break;
            case R.id.button12:
                op = "=";
                opptr("=");
                textview2.setText(op);
                break;
            case R.id.button28:
                op="";
                textview2.setText("");
                numm="";
                a=0;
                textview2.setText(op);
                textView.setText(numm);
                reset(0);
                break;

        }

    }
    double b =0;
    int i = 0;
    private void reset(double b) {
        this.b = 0.00;
        this.i=0;
    }


    public String opptr(String o){
            Double bb = b;
         display = bb.toString()+o;
         textView.setText(display);


        return o;
    }

    public double operator(double no, String op, double no2 ){
        switch (op){
            case "+":
                return no+no2;
            case "-":
                return no-no2;
            case "*":
                return no1*no2;
            case "/":
                return no1/no2;

        }
        return 0.0;
    }

    public String finaleval(double a){
        switch(i){
            case 0:
                if (b>-1){
                    b=a;
                    i++;
                    break;
                }
            case 1:
                if (b>=1&&b<10){
                    b=(b*10)+a;
                    i++;
                    break;
                }
            case 2:
                if (b<=100&&b>10){
                    b=(b*10)+a;
                    i++;
                    break;
                }
            case 3:
                if (100<b && b<=1000){
                    b=(b*10)+a;
                    i++;
                    break;
                }
            case 4:

                if (b<=10000&&b>1000){
                    b=(b*10)+a;
                    i++;
                    break;
                }
            case 5:
                if (b<=100000&&b>=10000){
                    b=(b*10)+a;
                    i++;
                    break;
                }


        }

        Double bb = b;
        String tot=  bb.toString();
        textView.setText(tot);
        return  tot;
    }

    public void checkOperator(){

    }

}
