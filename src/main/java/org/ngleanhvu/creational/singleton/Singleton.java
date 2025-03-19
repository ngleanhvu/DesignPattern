package org.ngleanhvu.creational.singleton;

public class Singleton {
    private static Singleton INSTANCE;

    private Singleton() {}

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    public void output() {
        System.out.println("Hello");
    }
}
