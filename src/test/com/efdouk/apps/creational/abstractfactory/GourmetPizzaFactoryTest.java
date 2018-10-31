package com.efdouk.apps.creational.abstractfactory;

import com.efdouk.apps.creational.abstractfactory.product.Pizza;
import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GourmetPizzaFactoryTest {

    @Test
    void createPizza_shouldCreateSeafoodGourmetEdition() {
        // Given
        BasePizzaFactory pizzaFactory = new GourmetPizzaFactory();
        Set<Ingredients> expectedIngredients = Stream.of(Ingredients.ZUCCHINI_SAUCE, Ingredients.GORGONZOLA,
                Ingredients.SHRIMPS, Ingredients.ONION).collect(Collectors.toSet());
        // When
        Pizza seafoodPizza = pizzaFactory.createPizza("seafood");
        // Then
        assertTrue(seafoodPizza.getIngredients().containsAll(expectedIngredients));
        assertFalse(seafoodPizza.getIngredients().contains(Ingredients.TOMATO_SAUCE));
        assertFalse(seafoodPizza.getIngredients().contains(Ingredients.MOZZARELLA));
    }

    @Test
    void createPizza_shouldCreateClassicGourmetEdition() {
        // Given
        BasePizzaFactory pizzaFactory = new GourmetPizzaFactory();
        Set<Ingredients> expectedIngredients = Stream.of(Ingredients.ZUCCHINI_SAUCE, Ingredients.GORGONZOLA,
                Ingredients.HAM, Ingredients.OLIVES, Ingredients.MUSHROOMS).collect(Collectors.toSet());
        // When
        Pizza classicPizza = pizzaFactory.createPizza("classic");
        // Then
        assertTrue(classicPizza.getIngredients().containsAll(expectedIngredients));
        assertFalse(classicPizza.getIngredients().contains(Ingredients.TOMATO_SAUCE));
        assertFalse(classicPizza.getIngredients().contains(Ingredients.MOZZARELLA));
    }

    @Test
    void createPizza_shouldCreateVeggieGourmetEdition() {
        // Given
        BasePizzaFactory pizzaFactory = new GourmetPizzaFactory();
        Set<Ingredients> expectedIngredients = Stream.of(Ingredients.ZUCCHINI_SAUCE, Ingredients.GORGONZOLA,
                Ingredients.ONION, Ingredients.MUSHROOMS, Ingredients.OLIVES).collect(Collectors.toSet());
        // When
        Pizza veggiePizza = pizzaFactory.createPizza("veggie");
        // Then
        assertTrue(veggiePizza.getIngredients().containsAll(expectedIngredients));
        assertFalse(veggiePizza.getIngredients().contains(Ingredients.TOMATO_SAUCE));
        assertFalse(veggiePizza.getIngredients().contains(Ingredients.MOZZARELLA));
    }

}