package com.sxl.GoF.proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Student student = new Student("tom");
        StudentProxy proxy = new StudentProxy(student);
        proxy.eat();
        proxy.run();
    }
}
