package com.example.mechrevo.myapplication.statedesign

import android.opengl.GLSurfaceView
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.mechrevo.myapplication.R
import com.example.mechrevo.myapplication.activity.GlActivity
import com.example.mechrevo.myapplication.activity.SVGAACtivity
import com.example.mechrevo.myapplication.propstate.LoginContext
import com.example.mechrevo.myapplication.propstate.LoginedState
import com.example.mechrevo.myapplication.utils.LogUtils
import kotlinx.android.synthetic.main.activity_state.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10
import kotlin.reflect.KFunction0

class StateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_state)
        val loginContext = LoginContext.getInstance()

        tvPass.setOnClickListener {
            loginContext.setLoginState(LoginedState())
        }

        tvLoginOut.setOnClickListener {
            loginContext.doComponent(baseContext)
        }

        tvReset.onClick {
            toast("显示吐司")
            loginContext.resetState()
        }


        doAsync {

        }

        var int = 1
        val i = when (int) {
            1 -> 4
            2 -> 2
            else -> 3
        }

        LogUtils.showLog("$i")

        jump()
    }

    fun StateActivity.jump() {
        startActivity<SVGAACtivity>("jump" to "jump")
    }

    //其实也就是是个函数，就是讲函数的作为了参数罢了
    inline fun sayHello() {
        val a = 0
        val b = 1
        Log.d("sayHello", "运算结果是: $a+$b")
    }

    /**
     * 高阶函数 就是讲函数作为一个参数
     */
    fun shop(girl: String, play: KFunction0<String>) {
        Log.d("高阶", "高阶函数：$girl")
        play()
    }

    inline fun play(): String = "play"


}
