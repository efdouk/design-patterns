package com.efdouk.apps.creational.abstractfactory;

import com.efdouk.apps.creational.abstractfactory.product.ClassicPizza;
import com.efdouk.apps.creational.abstractfactory.product.Pizza;
import com.efdouk.apps.creational.abstractfactory.product.SeafoodPizza;
import com.efdouk.apps.creational.abstractfactory.product.VeggiePizza;

public class GourmetPizzaFactory extends BasePizzaFactory {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        BaseToppingFactory toppingFactory = new GourmetToppingFactory();
        switch (type.toLowerCase()) {
            case "classic":
                pizza = new ClassicPizza(toppingFactory);
                break;
            case "seafood":
                pizza = new SeafoodPizza(toppingFactory);
                break;
            case "veggie":
                pizza = new VeggiePizza(toppingFactory);
                break;
            default:
                throw new IllegalArgumentException("Not supported pizza.");
        }

        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }

}
