package com.example.marvel;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class N12 extends AppCompatActivity {
    private Button fbclick; //facebook button
    private Button tclick;
    private Button gtclick;
    private Button instaclick;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n12);
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
        gtclick= (Button) findViewById(R.id.gtclickk);
        gtclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GotUrl("https://github.com/omar3anan/MARVEL");
            }
        });
        instaclick= (Button) findViewById(R.id.instaclickk);
        instaclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GotUrl("https://www.instagram.com/marvel/?hl=en");
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
    public void GotUrl(String s){ //function to take URl as a string  <Explicit Intent>
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
    public void open_M8(){
        Intent intent=new Intent(N12.this,M8.class);
        startActivity(intent);
    }
}