package com.efdouk.apps.creational.prototype;

public interface PrototypeCapable extends Cloneable {

    PrototypeCapable clone() throws CloneNotSupportedException;

}
