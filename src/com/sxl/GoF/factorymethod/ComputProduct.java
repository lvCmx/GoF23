package com.sxl.GoF.factorymethod;

/**
 * 计算机产品
 */
public class ComputProduct implements Product {
    @Override
    public void info(String info) {
        System.out.println(info);
    }
}
