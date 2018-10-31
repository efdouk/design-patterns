package com.efdouk.apps.creational.abstractfactory.product;

import com.efdouk.apps.creational.abstractfactory.BaseToppingFactory;
import com.efdouk.apps.creational.abstractfactory.Ingredients;

public class SeafoodPizza extends Pizza {

    private BaseToppingFactory toppingFactory;

    public SeafoodPizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Adding seafood pizza ingredients...");
        addAll(toppingFactory.createSauce().getIngredient(), toppingFactory.createCheese().getIngredient(),
                Ingredients.ONION, Ingredients.SHRIMPS);
    }
}
