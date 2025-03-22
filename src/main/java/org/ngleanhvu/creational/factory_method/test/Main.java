package org.ngleanhvu.creational.factory_method.test;

public class Main {
    public static void main(String[] args) {
        AuthService authService = new GoogleService();
        authService.login();
    }
}
