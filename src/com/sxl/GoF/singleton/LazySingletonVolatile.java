package com.sxl.GoF.singleton;

/**
 * 完美解决多线程懒汉式单例模式
 * volatile可以防止指令重排序
 */
public class LazySingletonVolatile {

    private LazySingletonVolatile(){}

    private static volatile LazySingletonVolatile instance=null;

    public static LazySingletonVolatile getInstance(){
        if(null==instance){
            synchronized(instance){
                if(null==instance){
                    instance=new LazySingletonVolatile();
                }
            }
        }
        return instance;
    }
}
