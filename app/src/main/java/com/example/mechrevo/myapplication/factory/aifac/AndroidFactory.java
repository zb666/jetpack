package com.example.mechrevo.myapplication.factory.aifac;

import com.example.mechrevo.myapplication.factory.AndroidApi;
import com.example.mechrevo.myapplication.factory.IApi;
import com.example.mechrevo.myapplication.factory.IFactory;

public class AndroidFactory implements IFactory {
    //如果是simple的话 直接在这里进行创建，在创建的时候就需要选定
    @Override
    public IApi create(int type) {
        return new AndroidApi();
    }
}
