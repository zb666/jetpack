package com.example.mechrevo.myapplication.app

import android.app.Application
import android.database.sqlite.SQLiteDatabase
import com.example.mechrevo.myapplication.bean.DaoMaster
import com.example.mechrevo.myapplication.bean.DaoSession
import com.example.mechrevo.myapplication.bean.HisData
import me.jessyan.autosize.AutoSizeConfig
import me.jessyan.autosize.unit.Subunits

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        val helper = DaoMaster.DevOpenHelper(this, "mydb.db")
        val database = helper.writableDatabase

        val daoMaster = DaoMaster(database)
        val daoSession = daoMaster.newSession()

        val hisData = HisData()
        hisData.data = ""
        daoSession.insert(hisData)

        AutoSizeConfig.getInstance().unitsManager
            .setSupportDP(false)
            .setSupportSP(false).supportSubunits = Subunits.MM
    }


}
