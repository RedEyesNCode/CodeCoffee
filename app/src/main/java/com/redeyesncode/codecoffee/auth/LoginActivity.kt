package com.redeyesncode.codecoffee.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.redeyesncode.codecoffee.R
import com.redeyesncode.codecoffee.dashboard.DashboardActivity
import com.redeyesncode.codecoffee.databinding.ActivityIntroBinding
import com.redeyesncode.codecoffee.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)


        binding.btnlogin.setOnClickListener {
            startActivity(Intent(this@LoginActivity,DashboardActivity::class.java))
        }
    }
}