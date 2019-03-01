package com.sxl.GoF.adapter;

/**
 * 对象适配器
 * 对象适配器它是将adapter的继承改成组合
 */
public class ObjectAdapterTest {
    public static void main(String[] args) {
        PS2 ps2 = new PS2();
        USB usb = new Adapter(ps2);
        usb.isUSB();
    }
}
interface USB{
    void isUSB();
}
class PS2{
    void isUSB(){
        System.out.println("我是ps2下的usb");
    }
    void isPS2(){}
}
class Adapter implements USB{
    private PS2 ps2;
    public Adapter(PS2 ps2){
        this.ps2=ps2;
    }

    @Override
    public void isUSB() {
        ps2.isUSB();
    }

}