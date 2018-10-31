package com.efdouk.apps.creational.factorymethod;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PizzaFactoryTest {

    @Test
    void makePizza_shouldMakeCheesePizza() {
        // Given
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        // When
        Pizza cheesePizza = pizzaFactory.makePizza("cheese");
        // Then
        assertTrue(cheesePizza.getIngredients().contains(PizzaIngredients.TOMATO_SAUCE));
        assertTrue(cheesePizza.getIngredients().contains(PizzaIngredients.CHEESE));
        assertTrue(cheesePizza.getIngredients().contains(PizzaIngredients.GORGONZOLA));
        assertTrue(cheesePizza.getIngredients().contains(PizzaIngredients.FETA));

        assertFalse(cheesePizza.getIngredients().contains(PizzaIngredients.SALAMI));
        assertFalse(cheesePizza.getIngredients().contains(PizzaIngredients.OLIVES));
    }

    @Test
    void makePizza_shouldMakeVeggiePizza() {
        // Given
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        // When
        Pizza cheesePizza = pizzaFactory.makePizza("veggie");
        // Then
        assertTrue(cheesePizza.getIngredients().contains(PizzaIngredients.TOMATO_SAUCE));
        assertTrue(cheesePizza.getIngredients().contains(PizzaIngredients.CHEESE));
        assertTrue(cheesePizza.getIngredients().contains(PizzaIngredients.MUSHROOMS));
        assertTrue(cheesePizza.getIngredients().contains(PizzaIngredients.PEPPER));
        assertTrue(cheesePizza.getIngredients().contains(PizzaIngredients.OLIVES));

        assertFalse(cheesePizza.getIngredients().contains(PizzaIngredients.SALAMI));
        assertFalse(cheesePizza.getIngredients().contains(PizzaIngredients.HAM));
    }

    @Test
    void makePizza_shouldMakePepperoniPizza() {
        // Given
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        // When
        Pizza cheesePizza = pizzaFactory.makePizza("pepperoni");
        // Then
        assertTrue(cheesePizza.getIngredients().contains(PizzaIngredients.TOMATO_SAUCE));
        assertTrue(cheesePizza.getIngredients().contains(PizzaIngredients.CHEESE));
        assertTrue(cheesePizza.getIngredients().contains(PizzaIngredients.MUSHROOMS));
        assertTrue(cheesePizza.getIngredients().contains(PizzaIngredients.OLIVES));
        assertTrue(cheesePizza.getIngredients().contains(PizzaIngredients.HAM));
        assertTrue(cheesePizza.getIngredients().contains(PizzaIngredients.SALAMI));

        assertFalse(cheesePizza.getIngredients().contains(PizzaIngredients.FETA));
        assertFalse(cheesePizza.getIngredients().contains(PizzaIngredients.GORGONZOLA));
    }

    @Test
    void makePizza_shouldThrowExceptionForWrongType() {
        // Given
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        // When && Then
        Assertions.assertThrows(IllegalArgumentException.class, () -> pizzaFactory.makePizza("space"));
    }

}