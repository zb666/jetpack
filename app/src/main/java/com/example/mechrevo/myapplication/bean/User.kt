package com.example.mechrevo.myapplication.bean

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class User : ViewModel() {

    val data get() = MutableLiveData<String>()

    init {
        data.value = "Hello JetPack"
    }

}
