package com.sxl.GoF.builder;

public class ConcreteBuildPerson implements BuildPerson{

    private Person person;

    public ConcreteBuildPerson(){
        this.person=new Person();
    }

    @Override
    public void buildName(String name) {
        person.setName(name);
    }

    @Override
    public void buildGender(String gender) {
        person.setGender(gender);
    }

    @Override
    public void buildType(String type) {
        person.setType(type);
    }

    public Person build() {
        return person;
    }
}
