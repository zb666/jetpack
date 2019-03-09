package com.example.mechrevo.myapplication.factory.simplefactory;

import com.example.mechrevo.myapplication.factory.simplefactory.imple.ImpleA;
import com.example.mechrevo.myapplication.factory.simplefactory.imple.ImpleB;


/**
 * 简单工厂 必须使用type作为区分。一旦引入一种新的类，都需要进行if else的操作
 * 工厂方法 定义一个用于创建对象的接口，让子类决定实例化哪一个类，工厂方法使得一个类的实例化可以延迟到子类中，看似
 * 很小的一部分，但是这样可以使用反射，注解等方式再进一步的区解除耦合
 */
public class Factory {

    public static IApi create(int type) {
        switch (type) {
            case 1:
                return new ImpleA();
            case 2:
                return new ImpleB();
            default:
                return new ImpleB();
        }
    }

    public static <T extends IApi> T create(Class<T> tClass) {
        IApi iApi = null;
        try {
            iApi = (IApi) Class.forName(tClass.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) iApi;
    }

}
