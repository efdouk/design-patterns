package com.efdouk.apps.creational.builder;

public class ConstructionEngineer {

    private HouseBuilder houseBuilder;

    public ConstructionEngineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House constructHouse() {
        return houseBuilder.buildFoundation()
                           .buildStructure()
                           .buildRoof()
                           .buildWindows()
                           .buildHouseDoor()
                           .build();
    }

}
