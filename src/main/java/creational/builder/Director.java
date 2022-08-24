package creational.builder;

public class Director {
    public void constructSportsCar(Builder builder){
        builder.setCarType("SPORTS");
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType("CITY_CAR");
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType("SUV");
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setGPSNavigator(new GPSNavigator());
    }
}
