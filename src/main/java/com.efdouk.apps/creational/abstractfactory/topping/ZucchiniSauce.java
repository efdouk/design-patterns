package com.efdouk.apps.creational.abstractfactory.topping;

import com.efdouk.apps.creational.abstractfactory.Ingredients;

public class ZucchiniSauce implements Sauce {
    @Override
    public Ingredients getIngredient() {
        return Ingredients.ZUCCHINI_SAUCE;
    }
}
