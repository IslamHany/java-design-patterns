package creational.builder;

public class Main {
    public static void main(String[] args){
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();

        director.constructSportsCar(carBuilder);

        Car car = carBuilder.getResult();
        System.out.println(car);

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSportsCar(carManualBuilder);

        Manual manual = carManualBuilder.getResult();
        System.out.println(manual.print());
    }
}
