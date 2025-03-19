package org.ngleanhvu.creational.builder.test;

public class Main {
    public static void main(String[] args) {
        User user = User.builder()
                .id(1)
                .name("Vu")
                .email("vunguyen.0208200402@gmail.com")
                .build();
        System.out.println(user);
    }
}
