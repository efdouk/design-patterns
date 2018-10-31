package com.efdouk.apps.creational.factorymethod;

public class CheesePizza extends Pizza {

    @Override
    public void addIngredients() {
        System.out.println("Adding cheese pizza ingredients...");
        addAll(PizzaIngredients.TOMATO_SAUCE, PizzaIngredients.CHEESE, PizzaIngredients.FETA,
                PizzaIngredients.GORGONZOLA);
    }
}
