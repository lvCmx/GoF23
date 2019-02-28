package com.sxl.GoF.singleton;

/**
 * 通过内部类实现单例模式
 */
public final class InnerSingleton {

    private InnerSingleton(){}

    public static InnerSingleton getInstance(){
        return Holder.instance;
    }

    private static class Holder{
        private static InnerSingleton instance=new InnerSingleton();
    }
}
