package com.ixuea.courses.helloworld.IntentStudy.BroadcastStudy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class LocalBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "我是本地广播", Toast.LENGTH_SHORT).show();
    }
}
