package com.sxl.GoF.prototype;

/**
 * 浅复制
 * 我们可以在这里定义一些公用的东西
 */
public class Sheep implements Cloneable {

    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
