package com.company;

public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Person: " +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'';
    }

    public void learn() {
        System.out.println("Can learn something");
    }

    public void walk() {
        System.out.println("Can walk");
    }

    public void eat() {
        System.out.println("Can eat");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}

