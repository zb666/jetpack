package com.example.mechrevo.myapplication.app;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import com.example.mechrevo.myapplication.bean.DaoMaster;
import com.example.mechrevo.myapplication.bean.DaoSession;
import com.example.mechrevo.myapplication.bean.HisData;

import java.util.List;

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "mydb.db");
        SQLiteDatabase database = helper.getWritableDatabase();

        DaoMaster daoMaster = new DaoMaster(database);
        DaoSession daoSession = daoMaster.newSession();

        HisData hisData = new HisData();
        hisData.setData("");
        daoSession.insert(hisData);

    }
}
