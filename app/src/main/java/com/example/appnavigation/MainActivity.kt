package com.example.appnavigation

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //getNavControllerViaFragment()
        //getNavControllerViaFragmentView()

        //getNavControllerViaFragment2()
        //getNavControllerViaFragmentView2()

        //getNavControllerViaFragment3()
        //getNavControllerViaFragmentView3()
    }


    fun getNavControllerViaFragment(){
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        val navController = navHostFragment.navController

    }

    fun getNavControllerViaFragmentView(){
        //navHostFragmentView 'i bu sekilde findviewby id ile cagirir ve bunu onCreate icinde cagirirsam hata alirim.
        val navHostFragmentView = supportFragmentManager.findFragmentById(R.id.navHostFragmentView) as NavHostFragment
        val navControllerView = navHostFragmentView.navController
    }

    // sadece findViewById'nin fragment ile kullanımında oncreate te cagirmakta bir problem yok.
    fun getNavControllerViaFragment2(){
        val navHostFragment = findViewById<View>(R.id.navHostFragment)
        val navController = navHostFragment.findNavController()
    }

    fun getNavControllerViaFragmentView2(){
        val navHostFragmentView = findViewById<View>(R.id.navHostFragmentView)
        val navControllerView = navHostFragmentView.findNavController()
    }

    // activity uzerinden navControllera erisme:
    fun getNavControllerViaFragment3(){
        findNavController(R.id.navHostFragment)
    }

    fun getNavControllerViaFragmentView3(){
        val navHostFragmentView = findViewById<View>(R.id.navHostFragmentView)
        val navControllerView = navHostFragmentView.findNavController()
    }

    override fun onResume() {
        super.onResume()
        //getNavControllerViaFragmentView2()
        getNavControllerViaFragmentView3()
    }
}