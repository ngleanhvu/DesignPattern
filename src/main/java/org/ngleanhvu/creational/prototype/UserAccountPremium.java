package org.ngleanhvu.creational.prototype;

public class UserAccountPremium extends UserAccount {
    private String premiumPackage;

    public UserAccountPremium(String name, String email, String premiumPackage) {
        super(name, email);
        this.premiumPackage = premiumPackage;
    }

    @Override
    public Prototype clone() {
        return new UserAccountPremium(name, email, premiumPackage);
    }

    @Override
    public void showInfo() {
        System.out.println("Username: " + name + ", Email: " + email + ", Premium Package: " + premiumPackage);
    }
}
