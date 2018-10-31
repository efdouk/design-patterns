package com.efdouk.apps.creational.abstractfactory.product;

import com.efdouk.apps.creational.abstractfactory.BaseToppingFactory;
import com.efdouk.apps.creational.abstractfactory.Ingredients;

public class ClassicPizza extends Pizza {

    private BaseToppingFactory toppingFactory;

    public ClassicPizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Adding ingredients for classic pizza...");

        addAll(toppingFactory.createSauce().getIngredient(), toppingFactory.createCheese().getIngredient(),
                Ingredients.OLIVES, Ingredients.MUSHROOMS, Ingredients.HAM);
    }
}
