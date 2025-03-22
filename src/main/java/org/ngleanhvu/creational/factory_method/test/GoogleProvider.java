package org.ngleanhvu.creational.factory_method.test;

public class GoogleProvider implements AuthProvider {
    @Override
    public void authenticate() {
        System.out.println("GoogleProvider create");
    }
}
