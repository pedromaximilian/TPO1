package com.example.tpo1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class SmsCapture extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("recibido", "Mensaje Recibido");


    }
}