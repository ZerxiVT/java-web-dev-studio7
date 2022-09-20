package org.launchcode.studio7;

public abstract class BaseDisc {
    String name;
    String contents;
    int capacity;
    String discType;

    BaseDisc(String discType) {
        this.discType = discType;
    }

    void loadDisc(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        System.out.println(discType + " " + name + " has been loaded with a capacity of " + capacity + ".");
    }

    void insertDisc() {
        System.out.println(discType + " has been inserted.");
    }

    void ejectDisc() {
        System.out.println(discType + " has been ejected.");
    }

}
