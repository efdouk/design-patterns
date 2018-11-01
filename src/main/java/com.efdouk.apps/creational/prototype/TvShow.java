package com.efdouk.apps.creational.prototype;

public class TvShow implements PrototypeCapable {

    private final String name;

    public TvShow(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public PrototypeCapable clone() throws CloneNotSupportedException {
        System.out.println("Cloning TvShow object..");
        return (TvShow) super.clone();
    }

}
