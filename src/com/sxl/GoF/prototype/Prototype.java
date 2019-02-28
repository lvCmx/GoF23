package com.sxl.GoF.prototype;

/**
 * 原型模式可以简单的理解为就是复制出一个对象
 */
public class Prototype {

    public static void main(String[] args) {
        Sheep sheep = new Sheep();
        sheep.setName("小的");

        try{
            Sheep obj = (Sheep) sheep.clone();
            System.out.println(obj.getName());
        }catch (Exception e){
        }


    }

}