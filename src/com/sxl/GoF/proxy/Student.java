package com.sxl.GoF.proxy;

public class Student implements Person{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name+"=eat");
    }

    @Override
    public void run() {
        System.out.println(name+"=run");
    }
}
