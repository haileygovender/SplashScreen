package com.example.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Used the "postDelayed(Runnable, time) method to send a message with a delayed time.
        // Handler().postDelayed is deprecated, so we have to change the code a little

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java) // intent plugin is to divert to the next page
            startActivity(intent)
            finish()
        }, 4000)
    }
}