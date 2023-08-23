package com.tvtoday.varggamesdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tvtoday.gamelibrary.R
import com.tvtoday.gamelibrary.core.views.activity.splashActivity.SplashActivityMerger

class StageGameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      //  startActivity(Intent(this, SplashActivityMerger::class.java))
        SplashActivityMerger.startGameStart(
            "com.tvtoday.crosswordhindi",
            "",
            "ca-app-pub-3940256099942544/5224354917",
            "ca-app-pub-3940256099942544/1033173712",
            "ca-app-pub-3940256099942544/6300978111",
            "ca-app-pub-3940256099942544/1033173712",
            "ca-app-pub-3940256099942544/1033173712",
            "ca-app-pub-3940256099942544/1033173712",
            this)
    }
}