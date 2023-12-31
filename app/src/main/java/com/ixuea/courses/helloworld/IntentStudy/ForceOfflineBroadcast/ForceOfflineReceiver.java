package com.ixuea.courses.helloworld.IntentStudy.ForceOfflineBroadcast;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;

import com.ixuea.courses.helloworld.MainActivity;

public class ForceOfflineReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(final Context context, Intent intent) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("提示")
                .setMessage("您被强制下线")
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ActivityCollector.finishAll();
                        Intent i = new Intent(context, MainActivity.class);
                        context.startActivity(i);
                    }
                })
                .setCancelable(false)
                .show();
    }
}
