package com.efdouk.apps.creational.factorymethod;

public class PepperoniPizza extends Pizza {

    @Override
    public void addIngredients() {
        System.out.println("Adding ingredients for pepperoni pizza...");
        addAll(PizzaIngredients.TOMATO_SAUCE, PizzaIngredients.CHEESE, PizzaIngredients.SALAMI,
                PizzaIngredients.OLIVES, PizzaIngredients.MUSHROOMS, PizzaIngredients.HAM, PizzaIngredients.PEPPER);
    }
}
