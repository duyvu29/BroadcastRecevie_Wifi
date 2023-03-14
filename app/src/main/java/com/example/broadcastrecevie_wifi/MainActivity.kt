package com.example.broadcastrecevie_wifi

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var br=  ExambroadCast()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    @Override
    override fun onStart() {
        super.onStart()
        var intent = IntentFilter()
        intent.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        this.registerReceiver(br,intent)
    }
    @Override
    override fun onStop() {
        super.onStop()
        this.unregisterReceiver(br)
    }
}