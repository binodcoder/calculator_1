package com.binodcoder.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //declaration
    EditText screen;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnAdd,btnSubtract,btnMultiply,btnDivide,btnDot,btnEqual,btnCancel;
    float result1, result2;
    boolean add, subtract, multiply, divide;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mapping
        screen=(EditText) findViewById(R.id.screen);
        btn0=(Button)findViewById(R.id.btn0);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btnAdd=(Button)findViewById(R.id.btn_add);
        btnSubtract=(Button)findViewById(R.id.btn_subtract);
        btnDivide=(Button)findViewById(R.id.btn_divide);
        btnMultiply=(Button)findViewById(R.id.btn_multiply);
        btnEqual=(Button)findViewById(R.id.btn_equal);
        btnCancel=(Button)findViewById(R.id.btn_cancel);
        btnDot=(Button)findViewById(R.id.btn_dot);

        //onclick listener
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+"9");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText(screen.getText()+".");
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                screen.setText("");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(screen==null){
                    screen.setText("");
                }else{
                    result1=Float.parseFloat(screen.getText()+"");
                    add=true;
                    screen.setText(null);
                }
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(screen==null){
                    screen.setText("");
                }else{
                    result1=Float.parseFloat(screen.getText()+"");
                    subtract=true;
                    screen.setText(null);
                }
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(screen==null){
                    screen.setText("");
                }else{
                    result1=Float.parseFloat(screen.getText()+"");
                    multiply=true;
                    screen.setText(null);
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(screen==null){
                    screen.setText("");
                }else{
                    result1=Float.parseFloat(screen.getText()+"");
                    divide=true;
                    screen.setText(null);
                }
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result2=Float.parseFloat(screen.getText()+"");
                if(add==true){
                    screen.setText(result1+result2+"");
                    add=false;
                }
                if(subtract==true){
                    screen.setText(result1-result2+"");
                    subtract=false;
                }
                if(multiply==true){
                    screen.setText(result1*result2+"");
                    multiply=false;
                }
                if(divide==true){
                    screen.setText(result1/result2+"");
                    divide=false;
                }
            }
        });
    }
}