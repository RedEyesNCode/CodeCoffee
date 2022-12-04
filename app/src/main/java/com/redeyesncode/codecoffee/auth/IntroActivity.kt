package com.redeyesncode.codecoffee.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.redeyesncode.codecoffee.R
import com.redeyesncode.codecoffee.dashboard.DashboardActivity
import com.redeyesncode.codecoffee.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity() {

    private lateinit var binding:ActivityIntroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        binding.btnRegister.setOnClickListener {
            startActivity(Intent(this@IntroActivity,SignupActivity::class.java))

        }
        binding.btnlogin.setOnClickListener {
            startActivity(            Intent(this@IntroActivity,LoginActivity::class.java)
            )

        }

        setContentView(binding.root)
    }
}