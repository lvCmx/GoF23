package com.sxl.GoF.singleton;

/**
 * enum类型是final的，不允许被继承
 */
public enum EnumSingleton {
    INSTANCE;

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
