package com.example.marvel;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.ContentResolver ;
import android.content.Context ;
import android.graphics.Color ;
import android.media.AudioAttributes ;
import android.net.Uri ;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button button;
    public static final String NOTIFICATION_CHANNEL_ID = "10001" ;
    private final static String default_notification_channel_id = "default" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CreateNotificationChannel();

        button =(Button)findViewById(R.id.LoginBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Notification 1 using Broadcast Receiver by toast and alarm manager at certain choosin time
                Toast.makeText(MainActivity.this,"Notification Will be Set!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,NotificationBroadcast.class);
                PendingIntent pendingIntent=PendingIntent.getBroadcast(MainActivity.this,0,intent,0);
                AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);// to retrieve a Alarm Manager for receiving intents at a time of my choosing
                long timeBtnClick=System.currentTimeMillis();
                long TenSecs=1000*10;
                alarmManager.set(AlarmManager.RTC_WAKEUP,timeBtnClick+TenSecs,pendingIntent); // Wakeup bt3ml fire ll pending intent at specified time


                //Notification 2 using Notification Compact
                NotificationCompat.Builder Builder = new NotificationCompat.Builder(MainActivity. this,
                        default_notification_channel_id )
                // Builder has 2 params Context w Channel ID
                        .setSmallIcon(R.drawable. marvel )
                        // Set icon
                        .setContentTitle( "MARVEL" )
                        // Set Notf Title
                        .setContentText( "Hello! Welcome to the Application We are Happy To have you" );
                        // Set Notf Text
                NotificationManager NotificationManager = (NotificationManager) getSystemService(Context. NOTIFICATION_SERVICE ) ;
                // hna byakhod el Context w y-manage el services elly feh
                if (android.os.Build.VERSION. SDK_INT >= android.os.Build.VERSION_CODES.O ) {
                    // hna by-Check 3ala el android Version eno lazm ykon a3la mn OREO
                    NotificationChannel notificationChannel = new
                    NotificationChannel( NOTIFICATION_CHANNEL_ID , "NOTIFICATION_CHANNEL_NAME" , NotificationManager. IMPORTANCE_HIGH) ;
                    // Notification channel btakhod hagten el channel id w el importance bta3 el Notification
                    Builder.setChannelId( NOTIFICATION_CHANNEL_ID ) ;
                    // lw la2a haga by3ml specify l el channel elly hy3ml feha deliver ll notification
                    assert NotificationManager != null;
                    NotificationManager.createNotificationChannel(notificationChannel) ;
                    // lw el NotificationManager msh b-null f hwa hy-create el message w yb3tha 3aala el channel elly m7ddnha
                }
                assert NotificationManager != null;
                NotificationManager.notify(( int ) System. currentTimeMillis (), Builder.build()) ;
                // wkman notify dee bt3ml Post a notification to be shown in the status bar w hybuild new unread conversation object.

                openActivity2();
            }
        });
    }

    public void openActivity2(){
        Intent intent=new Intent(this,M2.class);
        startActivity(intent);
    }
    private void CreateNotificationChannel(){
        if (android.os.Build.VERSION. SDK_INT >= android.os.Build.VERSION_CODES.O ) {
            CharSequence name = "Marvel App Channel";
            String description="Channel for Marvel App Notfications";
            int imprtance =NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel("NotifyChannel",name,imprtance);
            channel.setDescription(description);

            NotificationManager notificationManager=getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);

        }
}
}