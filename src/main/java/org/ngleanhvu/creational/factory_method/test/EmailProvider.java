package org.ngleanhvu.creational.factory_method.test;

public class EmailProvider implements AuthProvider {
    @Override
    public void authenticate() {
        System.out.println("EmailProvider create");
    }
}
