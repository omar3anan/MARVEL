package com.example.marvel;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class M3 extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button fbclick; //facebook button
    private Button tclick; //twitter button
    public static final String LOG_TAG = "CodeLab";
    //intent key value
    public static final String EXTRA_MESSAGE = "msgkey";
    private EditText mMessageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m3);

//        button = (Button) findViewById(R.id.LoginBtn);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                open_M4();
//            }
//        });

        fbclick= (Button) findViewById(R.id.fbclickk);
        fbclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GotUrl("https://www.facebook.com/groups/MCU.Official");
            }
        });
        tclick= (Button) findViewById(R.id.tclickk);
        tclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GotUrl("https://twitter.com/Marvel?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor");
            }
        });

        mMessageEditText = findViewById(R.id.editText_main);

        button2 = (Button) findViewById(R.id.RegisterBtn);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_M2();
            }
        });
    }

//    public void open_M4() {
//        Intent intent = new Intent(this, M4.class);
//        startActivity(intent);
//    }

    public void open_M2() {
        Intent intent = new Intent(this, M2.class);
        startActivity(intent);
    }

    public void launchM2Activity(View view) {
        Log.d(LOG_TAG, "Button clicked Successfully!");
        Intent intent = new Intent(this, M2.class);

        //getText() method returns an Editable instance
        String message = mMessageEditText.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    public void GotUrl(String s){
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

}