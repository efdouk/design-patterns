package com.efdouk.apps.creational.factorymethod;

public class VeggiePizza extends Pizza {

    @Override
    public void addIngredients() {
        System.out.println("Adding veggie ingredients...");
        addAll(PizzaIngredients.TOMATO_SAUCE, PizzaIngredients.CHEESE, PizzaIngredients.FETA,
                PizzaIngredients.OLIVES, PizzaIngredients.MUSHROOMS, PizzaIngredients.PEPPER);
    }
}
