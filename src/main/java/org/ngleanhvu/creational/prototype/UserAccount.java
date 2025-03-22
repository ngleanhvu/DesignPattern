package org.ngleanhvu.creational.prototype;

public class UserAccount implements Prototype {

    protected String name;
    protected String email;

    public UserAccount(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void showInfo() {
        System.out.println("Username: " + name + ", Email: " + email);
    }

    @Override
    public Prototype clone() {
        return null;
    }
}
