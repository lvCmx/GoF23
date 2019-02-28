package com.sxl.GoF.singleton;

/**
 * 懒加载方式实现单例模式
 */
public class LazySingleton {

    private LazySingleton(){}

    private static LazySingleton instance;

    /**
     * 这种方式只适合在单线程使用，如果使用多线程的话，这种写法会存在线程安全问题。
     * @return
     */
    public static LazySingleton getInstance(){
        if(null==instance){
            instance=new LazySingleton();
        }
        return instance;
    }

    /**
     * 双重检测加锁，这种方式也存在问题：
     *
     * @return
     */
    public static LazySingleton getInstanceSyn(){
        if(null==instance){
            synchronized (instance){
                if(null==instance){
                    instance=new LazySingleton();
                }
            }
        }
        return instance;
    }
}
