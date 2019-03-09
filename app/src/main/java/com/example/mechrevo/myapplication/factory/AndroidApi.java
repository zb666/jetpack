package com.example.mechrevo.myapplication.factory;

import android.util.Log;

public class AndroidApi implements IApi {
    @Override
    public void show() {
        Log.d("Android","Android_Show()");
    }
}
