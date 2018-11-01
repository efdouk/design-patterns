package com.efdouk.apps.creational.builder;

public class ConcreteHouseBuilder implements HouseBuilder {

    private House house;

    public ConcreteHouseBuilder() {
        this.house = new House();
    }

    @Override
    public HouseBuilder buildFoundation() {
        house.setFoundation(Material.CONCRETE);
        return this;
    }

    @Override
    public HouseBuilder buildStructure() {
        house.setStructure(Material.BRICK);
        return this;
    }

    @Override
    public HouseBuilder buildWindows() {
        house.setWindows(Material.PVC);
        return this;
    }

    @Override
    public HouseBuilder buildHouseDoor() {
        house.setHouseDoor(Material.ALUMINIUM);
        return this;
    }

    @Override
    public HouseBuilder buildRoof() {
        house.setRoof(Material.ROOF_TILES);
        return this;
    }

    @Override
    public House build() {
        return house;
    }

}


