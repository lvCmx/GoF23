package com.sxl.GoF.factorymethod;

public class PhoneProduct implements Product {
    @Override
    public void info(String info) {
        System.out.println(info);
    }
}