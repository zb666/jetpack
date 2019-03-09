package com.example.mechrevo.myapplication.surfaceview

import android.content.Context
import android.opengl.GLSurfaceView
import android.util.AttributeSet

class MyGlSurfaceView(context: Context?) : GLSurfaceView(context) {

    init {
        val myGlRender = MyGlRender()
        setRenderer(myGlRender)
        renderMode = GLSurfaceView.RENDERMODE_WHEN_DIRTY
    }


}