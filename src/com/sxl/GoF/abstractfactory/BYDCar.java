package com.sxl.GoF.abstractfactory;

/**
 * 比亚迪
 */
public class BYDCar implements Car{

    private Engine engine;
    private Wheel wheel;

    public BYDCar(Engine engine,Wheel wheel){
        this.engine=engine;
        this.wheel=wheel;
    }

    @Override
    public void run() {
        engine.getInfo();
        wheel.getInfo();
    }
}

