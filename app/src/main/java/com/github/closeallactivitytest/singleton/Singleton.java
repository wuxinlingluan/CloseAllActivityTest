package com.github.closeallactivitytest.singleton;

/**
 * Created by Administrator on 2016/11/12.
 */

public class Singleton {
    private Singleton(){}  //懒汉式
    private static Singleton singleton=null;
    public static Singleton getInstance(){ //静态工厂
            if (singleton==null){
                singleton=new Singleton();
            }
        return singleton;
    }
}
