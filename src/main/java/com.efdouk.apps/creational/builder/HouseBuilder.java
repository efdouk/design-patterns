package com.efdouk.apps.creational.builder;

public interface HouseBuilder {

    HouseBuilder buildFoundation();

    HouseBuilder buildStructure();

    HouseBuilder buildWindows();

    HouseBuilder buildHouseDoor();

    HouseBuilder buildRoof();

    House build();

}
