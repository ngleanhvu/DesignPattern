package org.ngleanhvu.creational.factory_method;

public class ConcreteProductA implements Product {
    @Override
    public void use() {
        System.out.println("ConcreteProductA create");
    }
}
