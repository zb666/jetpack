package com.example.mechrevo.myapplication.factory.aifac;

import com.example.mechrevo.myapplication.factory.IApi;
import com.example.mechrevo.myapplication.factory.IFactory;
import com.example.mechrevo.myapplication.factory.IosApi;

public class IosFactory implements IFactory {
    @Override
    public IApi create(int type) {
        return new IosApi();
    }
}
