package com.example.fooddeliveryapplication.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.fooddeliveryapplication.databinding.ActivityMainBinding
import com.example.fooddeliveryapplication.presentation.base.utils.viewBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by viewBinding()
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(binding.navHostFragment.id) as NavHostFragment
        navController = navHostFragment.navController
        NavigationUI.setupWithNavController(binding.bottomNav, navController)
    }
}