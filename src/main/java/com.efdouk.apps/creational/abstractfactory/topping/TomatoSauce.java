package com.efdouk.apps.creational.abstractfactory.topping;

import com.efdouk.apps.creational.abstractfactory.Ingredients;

public class TomatoSauce implements Sauce {

    @Override
    public Ingredients getIngredient() {
        return Ingredients.TOMATO_SAUCE;
    }

}
