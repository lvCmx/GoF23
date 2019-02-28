package com.sxl.GoF.builder;

public class Director {

    public Person createPersonByDirecotr(ConcreteBuildPerson build){
        build.buildName("tom");
        build.buildGender("女");
        build.buildType("大长脚");
        return build.build();
    }
}
