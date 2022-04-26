package com.example.marvel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

public class NotificationBroadcast extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationCompat.Builder Builder = new NotificationCompat.Builder(context,"NotifyChannel")
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("Marvel APP Notify")
                .setContentText("Hello! We are Happy To see you using our application")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat notificationManager=NotificationManagerCompat.from(context);
        notificationManager.notify(200, Builder.build());
    }
}
