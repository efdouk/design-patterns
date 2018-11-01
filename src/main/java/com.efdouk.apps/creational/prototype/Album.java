package com.efdouk.apps.creational.prototype;

public class Album implements PrototypeCapable {

    private final String name;

    public Album(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public PrototypeCapable clone() throws CloneNotSupportedException {
        System.out.println("Cloning Album object..");
        return (Album) super.clone();
    }

}
