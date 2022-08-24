package creational.builder;

public interface Builder {
    void setCarType(String type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
