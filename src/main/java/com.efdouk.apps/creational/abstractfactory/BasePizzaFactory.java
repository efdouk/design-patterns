package com.efdouk.apps.creational.abstractfactory;

import com.efdouk.apps.creational.abstractfactory.product.Pizza;

public abstract class BasePizzaFactory {

    public abstract Pizza createPizza(String type);

}
