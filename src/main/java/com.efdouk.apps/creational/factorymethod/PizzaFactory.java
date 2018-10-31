package com.efdouk.apps.creational.factorymethod;

public class PizzaFactory extends BasePizzaFactory {

    @Override
    public Pizza makePizza(String type) {
        Pizza pizza;
        switch (type.toLowerCase()) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default:
                throw new IllegalArgumentException("Not supported pizza.");
        }

        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }

}
