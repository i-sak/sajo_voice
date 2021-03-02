package com.example.voicephishingprevention;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("RR","onReceive()");

        String state = intent.getStringExtra(TelephonyManager.EXTRA_STATE);

        if (TelephonyManager.EXTRA_STATE_RINGING.equals(state)) {
            Toast.makeText(context, "RINGING", Toast.LENGTH_LONG).show();

        } else if (TelephonyManager.EXTRA_STATE_IDLE.equals(state)) {
            Toast.makeText(context, "IDLE", Toast.LENGTH_LONG).show();

        } else if (TelephonyManager.EXTRA_STATE_OFFHOOK.equals(state)) {
            Toast.makeText(context, "OFFHOOK", Toast.LENGTH_LONG).show();

        }

    }

}