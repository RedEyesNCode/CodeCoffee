package com.redeyesncode.codecoffee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.redeyesncode.codecoffee.auth.IntroActivity
import com.redeyesncode.codecoffee.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding:ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)

        Handler().postDelayed(Runnable {startActivity(Intent(this@SplashActivity,IntroActivity::class.java))  },4000)

        setContentView(binding.root)
    }
}