package com.example.mechrevo.myapplication.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.mechrevo.myapplication.R
import com.example.mechrevo.myapplication.sealed.DataClass
import com.example.mechrevo.myapplication.sealed.Expr
import com.google.gson.Gson
import org.json.JSONObject

import java.lang.ref.WeakReference

class DemoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)

        val result = Expr.Const(10.8)
        val eval = result.eval(result)
        Log.d("Selad",eval)
        val doubanStr = "{\"count\": 10,  \"title\": \"\\u8c46\\u74e3\\u7535\\u5f71Top250\"}"

        val doubanGson = Gson().fromJson<DataClass>(doubanStr,DataClass::class.java)
        Log.d("DouBan",doubanGson.toString()+"str："+doubanGson.title+" int: "+doubanGson.count)
    }

    internal fun add(iAdd: IAdd) {

    }

    internal interface IAdd {
        fun add()
    }
}
