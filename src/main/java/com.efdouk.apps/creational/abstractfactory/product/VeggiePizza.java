package com.efdouk.apps.creational.abstractfactory.product;

import com.efdouk.apps.creational.abstractfactory.BaseToppingFactory;
import com.efdouk.apps.creational.abstractfactory.Ingredients;

public class VeggiePizza extends Pizza {

    private BaseToppingFactory toppingFactory;

    public VeggiePizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Adding veggie ingredients...");
        addAll(toppingFactory.createSauce().getIngredient(), toppingFactory.createCheese().getIngredient(),
                Ingredients.OLIVES, Ingredients.MUSHROOMS, Ingredients.ONION);
    }
}
