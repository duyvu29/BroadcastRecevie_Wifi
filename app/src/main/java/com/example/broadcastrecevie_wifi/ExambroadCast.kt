package com.example.broadcastrecevie_wifi

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class ExambroadCast : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        var isBluetooth : Boolean = intent!!.getBooleanExtra("state",false)
        if  (isBluetooth){
            Toast.makeText(context, "Bluetooth trn on", Toast.LENGTH_LONG).show()
        }
         else{
            Toast.makeText(context, "Bluetooth turn off", Toast.LENGTH_LONG).show()
         }

        }
    }

