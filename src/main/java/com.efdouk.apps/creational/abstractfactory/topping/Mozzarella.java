package com.efdouk.apps.creational.abstractfactory.topping;

import com.efdouk.apps.creational.abstractfactory.Ingredients;

public class Mozzarella implements Cheese {

    @Override
    public Ingredients getIngredient() {
        return Ingredients.MOZZARELLA;
    }

}
