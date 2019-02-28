package com.sxl.GoF.builder;

public class BuildTest {
    public static void main(String[] args) {
        ConcreteBuildPerson buildPerson = new ConcreteBuildPerson();
        Director director = new Director();
        Person person = director.createPersonByDirecotr(buildPerson);
        System.out.println(person);
    }
}
