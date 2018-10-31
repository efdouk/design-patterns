package com.efdouk.apps.creational.abstractfactory;

import com.efdouk.apps.creational.abstractfactory.topping.Cheese;
import com.efdouk.apps.creational.abstractfactory.topping.Sauce;

public abstract class BaseToppingFactory {

    public abstract Sauce createSauce();

    public abstract Cheese createCheese();
}
