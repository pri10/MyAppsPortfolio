package com.example.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button btn1,btn2,btn3,btn4,btn5,btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1= (Button) findViewById(R.id.button);
        btn2= (Button) findViewById(R.id.button2);
        btn3= (Button) findViewById(R.id.button3);
        btn4= (Button) findViewById(R.id.button4);
        btn5= (Button) findViewById(R.id.button5);
        btn6= (Button) findViewById(R.id.button6);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view==btn1){
            Toast.makeText(MainActivity.this,"This will show my Popular Movies Project",Toast.LENGTH_LONG).show();
        }
        else if(view==btn2){
            Toast.makeText(MainActivity.this,"This will show my Stockhawk Project",Toast.LENGTH_LONG).show();
        }
        else if(view==btn3){
            Toast.makeText(MainActivity.this,"This will show my Build It Bigger Project",Toast.LENGTH_LONG).show();
        }
        else if(view==btn4){
            Toast.makeText(MainActivity.this,"This will show my Make Your App Material Project",Toast.LENGTH_LONG).show();
        }
        else if(view==btn5){
            Toast.makeText(MainActivity.this,"This will show my Go Ubiquitous Project",Toast.LENGTH_LONG).show();
        }
        else if(view==btn6){
            Toast.makeText(MainActivity.this,"This will show my Capstone Project",Toast.LENGTH_LONG).show();
        }
    }
}
