package com.example.mechrevo.myapplication.activity

import android.animation.ObjectAnimator
import android.animation.ValueAnimator
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
import android.support.design.R.id.message
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.example.mechrevo.myapplication.R
import com.example.mechrevo.myapplication.single.UserUtil
import com.opensource.svgaplayer.SVGAParser
import com.youth.banner.Banner
import com.youth.banner.loader.ImageLoader
import kotlinx.android.synthetic.main.activity_splash.*
import kotlinx.android.synthetic.main.fragment_one.*
import org.jetbrains.anko.*
import java.net.URL

class SplashActivity : AppCompatActivity() {

    companion object {
        val a = "aaa"
    }

    private val log = AnkoLogger(this.javaClass)

    var aaa: String? = "dfgd"

    @RequiresApi(api = Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        testCoroutines()
        val curX = tvJump.translationX
        tvJump.textSize = 22F
        val animX = ObjectAnimator.ofFloat(tvJump, "translationX", curX, 500f, curX)
        animX.setDuration(1000)

        tvJump.text = aaa?.hashCode()?.toString()
        findViewById<View>(R.id.tvJump).setOnClickListener { v ->
            animX.start()
        }

        tvLeakCheck.setOnClickListener {
            open_alert()
        }

        //kotlin ?:和?.的区别,两者相反 一般用?.比较多
        //?: ->为空就返回?: 后面跟随的数据，不为空则返回null
        //?. ->为空返回null,不为空就返回后面跟随的数据
        val ifNullStr = aaa ?: "为空的时候返回的数据"
        val hashCode = aaa?.hashCode()
        //强转的过去就返回具体的值，否则的话就返回null
        val i = aaa as? Int

        verticalLayout {
            padding = dip(30)
            editText {
                hint = "Name"
                textSize = 24f
            }
            button("Login"){
                textSize = 26f
            }
        }.applyRecursively {
            when(it){
                is EditText -> it.textSize = 20f
                is TextView -> it.textColor = resources.getColor(R.color.accent_material_dark)
            }
        }
    }

    //协程
    private fun testCoroutines() {

    }


    fun someMethod(){
        log.warn {
            "Big brother is watching you"
        }
    }

    fun open_toast() {
        toast("toast")
        longToast("long toast")
    }

    fun open_alert() {
        alert("Hi i am Bob") {
            yesButton {
                "hello this is yes button"
            }
            noButton {
                "hello this is no button"
            }
        }.show()
    }



}
