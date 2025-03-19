package org.ngleanhvu.creational.builder.builder;

import org.ngleanhvu.creational.builder.components.CarType;
import org.ngleanhvu.creational.builder.components.Engine;
import org.ngleanhvu.creational.builder.components.GPSNavigator;
import org.ngleanhvu.creational.builder.components.Transmission;
import org.ngleanhvu.creational.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
