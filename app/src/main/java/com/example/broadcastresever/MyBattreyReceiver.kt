package com.example.broadcastresever

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.TextView


class MyBattreyReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val battreylevel = intent?.getIntExtra("level",0)
      textView.text = if(battreylevel?: 0 > 0) battreylevel.toString() else ""

    }
}
