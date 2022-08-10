package com.company;

public class Singer extends Person {
    private String groupName;

    public Singer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void dancing() {
        System.out.println("Can dance");
    }

    @Override
    public String toString() {
        return "Singer: " + "name='" + getName() + '\'' + ", designation='" + getDesignation() + '\'' + ", groupName='" + groupName + '\'';
    }
}
