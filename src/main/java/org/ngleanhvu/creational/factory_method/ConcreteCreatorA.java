package org.ngleanhvu.creational.factory_method;

public class ConcreteCreatorA extends Creator {
    @Override
    Product createProduct() {
        return new ConcreteProductA();
    }
}
