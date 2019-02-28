package com.sxl.GoF.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        BYDCarFactory factory = new BYDCarFactory();
        Car car = factory.createCar();
        car.run();
    }
}
