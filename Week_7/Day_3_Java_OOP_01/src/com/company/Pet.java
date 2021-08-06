package com.company;

public class Pet {
    private  String name;
    private  int age;
    private  String location;
    private String type;

    public Pet() {
    }

    public Pet(String name, String location, String type) {
        this.name = name;
        this.location = location;
        this.type = type;
    }

    public  String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}