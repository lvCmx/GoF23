package com.sxl.GoF.abstractfactory;

/**
 * 生产byd汽车的工厂
 */
public class BYDCarFactory implements Factory{

    @Override
    public Car createCar() {
        return new BYDCar(new BYDEngine(),new BYDWheel());
    }
}
