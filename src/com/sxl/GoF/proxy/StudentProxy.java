package com.sxl.GoF.proxy;

public class StudentProxy implements Person {

    private Person p;
    public StudentProxy(Person p){
        this.p=p;
    }

    @Override
    public void eat() {
        System.out.println("开始吃....");
        p.eat();
        System.out.println("结束吃....");
    }

    @Override
    public void run() {
        System.out.println("开始跑....");
        p.run();
        System.out.println("结束跑...");
    }
}
