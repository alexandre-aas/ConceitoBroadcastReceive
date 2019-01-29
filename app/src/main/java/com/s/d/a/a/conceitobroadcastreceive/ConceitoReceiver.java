package com.s.d.a.a.conceitobroadcastreceive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
 import android.widget.Toast;

public class ConceitoReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String msg = "Broadcast Intent detectado. Pacote/Action = " + intent.getAction();

       Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }
}
