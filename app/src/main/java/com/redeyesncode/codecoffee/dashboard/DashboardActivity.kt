package com.redeyesncode.codecoffee.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.redeyesncode.codecoffee.R
import com.redeyesncode.codecoffee.databinding.ActivityDashboardBinding

class DashboardActivity : AppCompatActivity() {

    private lateinit var binding:ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initNav()

    }

    private fun initNav() {
        val navController: NavController =
            Navigation.findNavController(this@DashboardActivity, R.id.activity_main_nav_host_fragment)
        val bottomNavigationView = binding.bottomNavigationDashboard
        NavigationUI.setupWithNavController(bottomNavigationView, navController)
    }
}