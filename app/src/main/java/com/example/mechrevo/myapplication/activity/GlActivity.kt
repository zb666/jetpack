package com.example.mechrevo.myapplication.activity

import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.mechrevo.myapplication.R
import com.example.mechrevo.myapplication.surfaceview.MyGlSurfaceView

class GlActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mySurfaceView = MyGlSurfaceView(this)
        setContentView(mySurfaceView)


    }
}
