package com.example.marvel;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
//Fadel zorar el google takhdo el facebook w twitter nafs el code , Function getUrl deh 3amlha l kol el buttons el fyl page deh bssssssssssss
//buttons hya hya fy page N12 copy w paste + github button bta3 el repo bta3na

public class M2 extends AppCompatActivity {
    private Button button;
    private Button button2;

    public static final String LOG_TAG = "CodeLab";
    public static final String EXTRA_MESSAGE = "msgkey";
    private EditText mMessageEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m2);



//        button =(Button)findViewById(R.id.LoginBtn);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                open_M4();
//            }
//        });

        mMessageEditText = findViewById(R.id.editText_main);


        button2 =(Button)findViewById(R.id.RegisterBtn) ;
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_M3();
            }
        });

    }
    public void open_M3(){
        Intent intent=new Intent(this,M3.class);
        startActivity(intent);
    }
    public void launchM4Activity(View view) {
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, M4.class); // <Implicit Intent> takes 2 parameters this>context , M4.class > class

        //getText() method returns an Editable instance
        String message = mMessageEditText.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }


}