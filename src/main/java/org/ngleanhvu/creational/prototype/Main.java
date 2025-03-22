package org.ngleanhvu.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Prototype account1 = new UserAccountPremium("john_doe", "john@example.com", "Gold");
        Prototype account2 = account1.clone();
        System.out.println(account1 == account2);
    }
}
