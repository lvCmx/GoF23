package com.sxl.GoF.factorymethod;

/**
 * 计算机说明书工厂类
 */
public class ComputProductFactory implements Factory {

    @Override
    public Product newProduct() {
        return new ComputProduct();
    }
}
