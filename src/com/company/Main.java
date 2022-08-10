package com.company;

public class Main {
    public static void main(String[] args) {
        Programmer p = new Programmer("NameProgrammer", "src", "It");
        Singer s = new Singer("NameSinger", "src", "Group");
        Dancer d = new Dancer("NameDancer", "src", "Band");
        System.out.println(p);
        System.out.println(s);
        System.out.println(d);
    }
}
