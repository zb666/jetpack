package com.example.mechrevo.myapplication.activity

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Build
import android.os.PersistableBundle
import android.os.SystemClock
import android.support.annotation.RequiresApi
import android.support.v4.app.NotificationCompat
import android.support.v4.app.NotificationManagerCompat
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.example.mechrevo.myapplication.R
import com.example.mechrevo.myapplication.single.UserUtil
import com.opensource.svgaplayer.SVGAParser
import com.youth.banner.Banner
import com.youth.banner.loader.ImageLoader
import kotlinx.android.synthetic.main.activity_splash.*
import java.net.URL

class SplashActivity : AppCompatActivity() {


    @RequiresApi(api = Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        tvJump.text = "跳转SVGA 界面"
        findViewById<View>(R.id.tvJump).setOnClickListener { v ->
            startActivity(Intent(v.context, DemoActivity::class.java))
            finish()
        }


    }

}
