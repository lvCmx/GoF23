package com.sxl.GoF.factorymethod;

/**
 * 手机说明书
 */
public class PhoneProductFactory implements Factory {

    @Override
    public Product newProduct() {
        return new PhoneProduct();
    }
}
