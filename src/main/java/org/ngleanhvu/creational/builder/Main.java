package org.ngleanhvu.creational.builder;

import org.ngleanhvu.creational.builder.builder.impl.CarBuilder;
import org.ngleanhvu.creational.builder.components.Car;
import org.ngleanhvu.creational.builder.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println(car.getCarType());
    }
}
