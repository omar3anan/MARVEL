package com.example.marvel;

import static android.app.Notification.EXTRA_NOTIFICATION_ID;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class M3 extends AppCompatActivity {
    private Button button;
    private Button buttonRegister;
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

        mMessageEditText = findViewById(R.id.editText_main);

        final EditText ReguserName =(EditText) findViewById(R.id.editText_main) ;
        final EditText RegPassword =(EditText) findViewById(R.id.password) ;
        final EditText RegEmail =(EditText) findViewById(R.id.email) ;
        Button btnRegister=(Button)findViewById(R.id.RegisterBtn) ;



        buttonRegister = (Button) findViewById(R.id.RegisterBtn);



        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences preferences =getSharedPreferences("MYPREFS",MODE_PRIVATE);
                String newUser=ReguserName.getText().toString();
                String newPassword=RegPassword.getText().toString();
                String newEmail=RegEmail.getText().toString();

                SharedPreferences.Editor editor=preferences.edit();
                editor.putString(newUser+newPassword+"data",newUser+"\n"+newEmail+"\n"+newPassword);
                editor.commit();
                System.out.println(newUser);
                System.out.println(newEmail);
                System.out.println(newPassword);
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
    public void open_DScreen(){
        Intent intent=new Intent(this,DisplayScreen.class);
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


}