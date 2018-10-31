package com.efdouk.apps.creational.factorymethod;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class Pizza {

    private Set<PizzaIngredients> ingredients = new HashSet<>();

    void addAll(PizzaIngredients... ingredients) {
        this.ingredients.addAll(Arrays.asList(ingredients));
    }

    Set<PizzaIngredients> getIngredients() {
        return Collections.unmodifiableSet(ingredients);
    }

    public abstract void addIngredients();

    void bakePizza() {
        System.out.println("Baking pizza with added ingredients: [ "
                + ingredients.stream().map(PizzaIngredients::name).collect(Collectors.joining(", ")) + " ].");
    }

}
