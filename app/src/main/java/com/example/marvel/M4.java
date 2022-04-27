package com.example.marvel;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


//3aizen design ll profile picture el (Unknown) 3alshan tet7at gamb el listner fy M4 page 3alshan yn2a dah esm el account bta3o
public class M4 extends AppCompatActivity {
    private Button button;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m4);
        SharedPreferences preferences=getSharedPreferences("MyPrefs",MODE_PRIVATE);
        String display = preferences.getString("display","");

        button =(Button)findViewById(R.id.PlayBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_M5();
            }
        });
        button2 =(Button)findViewById(R.id.textView9);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_M8();
            }
        });

        Intent intent = getIntent();
        String message =intent.getStringExtra(M3.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.text_message);
        textView.setText(message);
    }
    public void open_M5(){
        Intent intent=new Intent(M4.this,M5.class);
        startActivity(intent);
    }
    public void open_M8(){
        Intent intent=new Intent(M4.this,M8.class);
        startActivity(intent);
    }

}