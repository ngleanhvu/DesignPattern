package org.ngleanhvu.creational.builder.builder.impl;

import org.ngleanhvu.creational.builder.components.Car;
import org.ngleanhvu.creational.builder.components.CarType;
import org.ngleanhvu.creational.builder.builder.Builder;
import org.ngleanhvu.creational.builder.components.Engine;
import org.ngleanhvu.creational.builder.components.GPSNavigator;
import org.ngleanhvu.creational.builder.components.Transmission;
import org.ngleanhvu.creational.builder.components.TripComputer;

public class CarBuilder implements Builder {

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
