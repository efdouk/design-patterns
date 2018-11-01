package com.efdouk.apps.creational.builder;

public class WoodenHouseBuilder implements HouseBuilder {

    private House house;

    public WoodenHouseBuilder() {
        this.house = new House();
    }

    @Override
    public HouseBuilder buildFoundation() {
        house.setFoundation(Material.WOOD);
        return this;
    }

    @Override
    public HouseBuilder buildStructure() {
        house.setStructure(Material.WOOD);
        return this;
    }

    @Override
    public HouseBuilder buildWindows() {
        house.setWindows(Material.ALUMINIUM);
        return this;
    }

    @Override
    public HouseBuilder buildHouseDoor() {
        house.setHouseDoor(Material.WOOD);
        return this;
    }

    @Override
    public HouseBuilder buildRoof() {
        house.setRoof(Material.WOOD);
        return this;
    }

    @Override
    public House build() {
        return house;
    }

}
