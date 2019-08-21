package com.example.tpo1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.widget.Toast;

import static android.Manifest.permission.READ_CALL_LOG;
import static android.Manifest.permission.RECEIVE_SMS;

public class MainActivity extends AppCompatActivity {

    private SmsCapture smsC = new SmsCapture();

    @Override
    protected void onResume(){
        super.onResume();
        this.smsC = new SmsCapture();
        registerReceiver(this.smsC, new IntentFilter("android.provider.Telephony.SMS_RECEIVED"));
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(smsC);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("app", "app iniciada");
    }


}
