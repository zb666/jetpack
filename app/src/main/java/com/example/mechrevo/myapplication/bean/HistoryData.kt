package com.example.mechrevo.myapplication.bean

import com.example.mechrevo.myapplication.view.BeanView
import org.greenrobot.greendao.annotation.Entity


class HistoryData(private val giftUrl:String) {
    val data: String? = null
    val history: String? = null

    inner class Inner {
        fun test() {
            val hashCode = data?.hashCode()
        }
    }

}
