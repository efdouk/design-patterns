package com.efdouk.apps.creational.builder;

public class House {

    private Material foundation;
    private Material structure;
    private Material windows;
    private Material houseDoor;
    private Material roof;

    House() {
    }

    public Material getFoundation() {
        return foundation;
    }

    void setFoundation(Material foundation) {
        this.foundation = foundation;
    }

    public Material getStructure() {
        return structure;
    }

    void setStructure(Material structure) {
        this.structure = structure;
    }

    public Material getWindows() {
        return windows;
    }

    void setWindows(Material windows) {
        this.windows = windows;
    }

    public Material getRoof() {
        return roof;
    }

    void setRoof(Material roof) {
        this.roof = roof;
    }

    public Material getHouseDoor() {
        return houseDoor;
    }

    void setHouseDoor(Material houseDoor) {
        this.houseDoor = houseDoor;
    }

}
