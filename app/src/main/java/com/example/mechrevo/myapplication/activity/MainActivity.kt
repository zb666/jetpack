package com.example.mechrevo.myapplication.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import com.example.mechrevo.myapplication.R

class MainActivity : AppCompatActivity() {
    companion object {
        @JvmStatic
        val string: String
            get() = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addTest(object : I {
            override fun add() {

            }
        })
        val finalHost = NavHostFragment.create(R.navigation.nav_test)
        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment, finalHost)
            .setPrimaryNavigationFragment(finalHost)
            .commit()
    }

    override fun onSupportNavigateUp() = Navigation.findNavController(
        this,
        R.id.nav_host_fragment
    ).navigateUp()

    fun addTest(i: I) {

    }

    interface I {
        fun add()
    }
}
