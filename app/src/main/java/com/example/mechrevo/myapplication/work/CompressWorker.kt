package com.example.mechrevo.myapplication.work

import android.util.Log
import androidx.work.Data
import androidx.work.WorkRequest
import androidx.work.Worker
import androidx.work.impl.utils.LiveDataUtils

class CompressWorker : Worker() {
    override fun doWork(): WorkerResult {
        doCompress()
        return WorkerResult.SUCCESS
    }

    //压缩数据
    private fun doCompress(): WorkerResult {
        val is_opened = inputData.getBoolean("A", false)
        if (is_opened) {
            Thread.sleep(5000)
            val adPeriodStr = getAd()
            val outputData = Data.Builder().putString("key_ad", adPeriodStr).build()
            Log.d("doCompress", "Success")
            return WorkerResult.SUCCESS
        } else {
            Log.e("doCompress", "FailUre")
            return WorkerResult.FAILURE
        }

    }

    fun getAd(): String {
        return "我是广告界面" + System.currentTimeMillis()
    }

}