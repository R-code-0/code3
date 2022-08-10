package com.company;

public class Dancer extends Person {
    private String bandName;

    public Dancer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public void singing() {
        System.out.println("Can sing");
    }

    public void playGuitar() {
        System.out.println("Can play guitar");
    }

    @Override
    public String toString() {
        return "Dancer: " + "name='" + getName() + '\'' + ", designation='" + getDesignation() + '\'' + ", bandName='" + bandName + '\'';
    }
}
