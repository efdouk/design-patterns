package com.efdouk.apps.creational.abstractfactory;

import com.efdouk.apps.creational.abstractfactory.topping.Cheese;
import com.efdouk.apps.creational.abstractfactory.topping.Mozzarella;
import com.efdouk.apps.creational.abstractfactory.topping.Sauce;
import com.efdouk.apps.creational.abstractfactory.topping.TomatoSauce;

public class SicilianToppingFactory extends BaseToppingFactory {

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

}
