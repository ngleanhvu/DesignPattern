package org.ngleanhvu.creational.factory_method;

public class Main {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.createProduct();
        productA.use();
    }
}
