package com.example.marvel;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
//Fadel zorar el google takhdo el facebook w twitter nafs el code , Function getUrl deh 3amlha l kol el buttons el fyl page deh bssssssssssss
//buttons hya hya fy page N12 copy w paste + github button bta3 el repo bta3na

public class M2 extends AppCompatActivity{
    private Button button;
    private Button login;
    private Button RegButton;
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

        final EditText etName =(EditText)findViewById(R.id.editText_mainLogin) ;
        final EditText etPassword =(EditText)findViewById(R.id.editText_passwordLogin);
        Button btnLogin=(Button) findViewById(R.id.LoginBtn);




        login =(Button)findViewById(R.id.LoginBtn) ;
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=etName.getText().toString();
                String password=etPassword.getText().toString();
                SharedPreferences preferences =getSharedPreferences("MYPREFS",MODE_PRIVATE);
                String userDetails=preferences.getString(user+password+"data","Username Or Password is Incorrect");
                SharedPreferences.Editor editor=preferences.edit();
                if(user.equals("Admin") && password.equals("Admin")){
                    editor.putString("username",user);
                    editor.putString("password",password);
                    editor.putString("display",userDetails);
                    editor.commit();
                    Toast.makeText(getApplicationContext(), "Login Successful",Toast.LENGTH_SHORT).show();
                    System.out.println(user);
                    System.out.println(password);
                    open_M4();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Data are not valid", Toast.LENGTH_SHORT).show();
                    System.out.println("Invalid Data");
                    open_DScreen();
                }
                // open_M3();
            }
        });

        RegButton=(Button)findViewById(R.id.RegisterBtn);
        RegButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_M3();
            }
        });

    }
    public void open_DScreen(){
        Intent intent=new Intent(M2.this,DisplayScreen.class);
        startActivity(intent);
    }
    public void open_M3(){
        Intent intent=new Intent(M2.this,M3.class);
        startActivity(intent);
    }
//    public void open_M5(){
//        Intent intent=new Intent(this,M5.class);
//        startActivity(intent);
//    }

    public void open_M4(){
        Intent intent=new Intent(M2.this,M4.class);
        startActivity(intent);
    }
//    public void launchM4Activity(View view) {
//        Log.d(LOG_TAG, "Button clicked!");
//        Intent intent = new Intent(this, M4.class); // <Implicit Intent> takes 2 parameters this>context , M4.class > class
//
//        //getText() method returns an Editable instance
//        String message = mMessageEditText.getText().toString();
//
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);
//    }


}