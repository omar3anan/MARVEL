package com.example.marvel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class M9 extends AppCompatActivity {
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m9);
        button2 =(Button)findViewById(R.id.textView9);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_M8();
            }
        });
    }
    public void open_M8(){
        Intent intent=new Intent(M9.this,M8.class);
        startActivity(intent);
    }
}