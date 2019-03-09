package com.example.mechrevo.myapplication.bean

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.arch.persistence.room.Entity

@Entity
class User : ViewModel() {

    val data get() = MutableLiveData<String>()

    init {
        data.value = "Hello JetPack"
    }

}
