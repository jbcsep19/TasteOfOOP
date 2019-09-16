package com.company;

public class Person {

    private String name; // variables
    private int age;

    public Person() { // no-arg constructor
    }

    public Person(String name, int age) { // two-arg constructor
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override // annotation as a cue to the developers
    public String toString(){
        String temp = "";
        temp = "The person's name is " + getName() + " and their age is " + getAge();
        return temp;
    }

}
