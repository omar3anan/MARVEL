package com.example.marvel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class M7 extends AppCompatActivity {
    private Button button;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m7);
        button =(Button)findViewById(R.id.rightt);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_M8();
            }
        });
        button2 =(Button)findViewById(R.id.textView9);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_M8();
            }
        });
    }
    public void open_M8(){
        Intent intent=new Intent(M7.this,M8.class);
        startActivity(intent);
    }


}