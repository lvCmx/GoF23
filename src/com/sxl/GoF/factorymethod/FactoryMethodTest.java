package com.sxl.GoF.factorymethod;

public class FactoryMethodTest {

    public static void main(String[] args) {
        //创建一个计算机说明书
        Factory factory = new ComputProductFactory();
        Product product = factory.newProduct();
        product.info("我是计算机说明书...");

    }
}
