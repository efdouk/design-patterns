package com.efdouk.apps.creational.abstractfactory;

import com.efdouk.apps.creational.abstractfactory.product.Pizza;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SicilianPizzaFactoryTest {

    @Test
    void createPizza_shouldCreateSeafoodSicilianEdition() {
        // Given
        BasePizzaFactory pizzaFactory = new SicilianPizzaFactory();
        Set<Ingredients> expectedIngredients = Stream.of(Ingredients.TOMATO_SAUCE, Ingredients.MOZZARELLA,
                Ingredients.ONION, Ingredients.SHRIMPS).collect(Collectors.toSet());
        // When
        Pizza seafoodPizza = pizzaFactory.createPizza("seafood");
        // Then
        assertTrue(seafoodPizza.getIngredients().containsAll(expectedIngredients));
        assertFalse(seafoodPizza.getIngredients().contains(Ingredients.ZUCCHINI_SAUCE));
        assertFalse(seafoodPizza.getIngredients().contains(Ingredients.GORGONZOLA));
    }

    @Test
    void createPizza_shouldCreateClassicSicilianEdition() {
        // Given
        BasePizzaFactory pizzaFactory = new SicilianPizzaFactory();
        Set<Ingredients> expectedIngredients = Stream.of(Ingredients.TOMATO_SAUCE, Ingredients.MOZZARELLA,
                Ingredients.HAM, Ingredients.OLIVES, Ingredients.MUSHROOMS).collect(Collectors.toSet());
        // When
        Pizza classicPizza = pizzaFactory.createPizza("classic");
        // Then
        assertTrue(classicPizza.getIngredients().containsAll(expectedIngredients));
        assertFalse(classicPizza.getIngredients().contains(Ingredients.ZUCCHINI_SAUCE));
        assertFalse(classicPizza.getIngredients().contains(Ingredients.GORGONZOLA));
    }

    @Test
    void createPizza_shouldCreateVeggieSicilianEdition() {
        // Given
        BasePizzaFactory pizzaFactory = new SicilianPizzaFactory();
        Set<Ingredients> expectedIngredients = Stream.of(Ingredients.TOMATO_SAUCE, Ingredients.MOZZARELLA,
                Ingredients.ONION, Ingredients.MUSHROOMS, Ingredients.OLIVES).collect(Collectors.toSet());
        // When
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
        // Then
        assertTrue(veggiePizza.getIngredients().containsAll(expectedIngredients));
        assertFalse(veggiePizza.getIngredients().contains(Ingredients.ZUCCHINI_SAUCE));
        assertFalse(veggiePizza.getIngredients().contains(Ingredients.GORGONZOLA));
    }

}