package com.efdouk.apps.creational.abstractfactory.product;

import com.efdouk.apps.creational.abstractfactory.Ingredients;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class Pizza {

    private Set<Ingredients> ingredients = new HashSet<>();

    void addAll(Ingredients... ingredients) {
        this.ingredients.addAll(Arrays.asList(ingredients));
    }

    public Set<Ingredients> getIngredients() {
        return Collections.unmodifiableSet(ingredients);
    }

    public abstract void addIngredients();

    public void bakePizza() {
        System.out.println("Baking pizza with added ingredients: [ "
                + ingredients.stream().map(Ingredients::name).collect(Collectors.joining(", ")) + " ].");
    }

}
