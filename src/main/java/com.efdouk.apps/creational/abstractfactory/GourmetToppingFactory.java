package com.efdouk.apps.creational.abstractfactory;

import com.efdouk.apps.creational.abstractfactory.topping.Cheese;
import com.efdouk.apps.creational.abstractfactory.topping.Gorgonzola;
import com.efdouk.apps.creational.abstractfactory.topping.Sauce;
import com.efdouk.apps.creational.abstractfactory.topping.ZucchiniSauce;

public class GourmetToppingFactory extends BaseToppingFactory {

    @Override
    public Cheese createCheese() {
        return new Gorgonzola();
    }

    @Override
    public Sauce createSauce() {
        return new ZucchiniSauce();
    }

}
