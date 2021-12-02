package com.example.broadcastresever

import android.annotation.SuppressLint
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity() {

    lateinit var  myBattreyReceiver : MyBattreyReceiver


    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val levelValue = findViewById<AppCompatTextView>(R.id.textViewBL)
//        val isChargingValue = findViewById<AppCompatTextView>(R.id.isChargingValue)
//        val batteryHealthValue = findViewById<AppCompatTextView>(R.id.batteryHealthValue)
        myBattreyReceiver = MyBattreyReceiver(levelValue)
        registerReceiver(myBattreyReceiver,IntentFilter(Intent.ACTION_BATTERY_CHANGED))}
    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(myBattreyReceiver)
    }
}



