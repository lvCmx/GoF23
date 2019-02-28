package com.sxl.GoF.singleton;

/**
 * 饿汉式
 */
public class HungrySingleton {

    // 第一步：把构造函数私有化
    private HungrySingleton(){}

    // 第二步：定义本类的实例
    private static final HungrySingleton instance = new HungrySingleton();

    // 第三步：提供全局可访问实例
    public static HungrySingleton getInstance(){
        return instance;
    }
}
