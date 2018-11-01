package com.efdouk.apps.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConstructionEngineerTest {

    @Test
    void constructHouse_shouldConstructWoodenHouse() {
        // Given
        HouseBuilder builder = new WoodenHouseBuilder();
        ConstructionEngineer engineer = new ConstructionEngineer(builder);
        // When
        House house = engineer.constructHouse();
        // Then
        assertEquals(house.getFoundation(), Material.WOOD);
        assertEquals(house.getStructure(), Material.WOOD);
        assertEquals(house.getWindows(), Material.ALUMINIUM);
        assertEquals(house.getRoof(), Material.WOOD);
        assertEquals(house.getHouseDoor(), Material.WOOD);
    }

    @Test
    void constructHouse_shouldConstructConcreteHouse() {
        // Given
        HouseBuilder builder = new ConcreteHouseBuilder();
        ConstructionEngineer engineer = new ConstructionEngineer(builder);
        // When
        House house = engineer.constructHouse();
        // Then
        assertEquals(house.getFoundation(), Material.CONCRETE);
        assertEquals(house.getStructure(), Material.BRICK);
        assertEquals(house.getWindows(), Material.PVC);
        assertEquals(house.getRoof(), Material.ROOF_TILES);
        assertEquals(house.getHouseDoor(), Material.ALUMINIUM);
    }

}