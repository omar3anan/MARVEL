package com.example.marvel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class M8 extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m8);
        button =(Button)findViewById(R.id.homee);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_M4();
            }
        });
        button2 =(Button)findViewById(R.id.comicss);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_M9();
            }
        });
        button3 =(Button)findViewById(R.id.charr);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_N10();
            }
        });
        button4 =(Button)findViewById(R.id.aboutt);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_N11();
            }
        });
        button5 =(Button)findViewById(R.id.uss);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_N12();
            }
        });

    }
    public void open_M4(){
        Intent intent=new Intent(M8.this,M4.class);
        startActivity(intent);
    }
    public void open_M9(){
        Intent intent=new Intent(M8.this,M9.class);
        startActivity(intent);
    }
    public void open_N10(){
        Intent intent=new Intent(M8.this,N10.class);
        startActivity(intent);
    }
    public void open_N11(){
        Intent intent=new Intent(M8.this,N11.class);
        startActivity(intent);
    }
    public void open_N12(){
        Intent intent=new Intent(M8.this,N12.class);
        startActivity(intent);
    }
}