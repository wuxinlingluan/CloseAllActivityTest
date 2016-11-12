package com.github.closeallactivitytest.singleton;

/**
 * Created by Administrator on 2016/11/12.
 */
//饿汉式
public class Singleton1  {
    private Singleton1(){}
    private static final Singleton1 singleton=new Singleton1();
    public static Singleton1 getInstance(){
        return singleton;
    }
}
