package org.example.car;

public class Main {
    public static void main(String[] args) {

        Engine engine1 = new Engine();
        Radiator radiator1 = new Radiator();
        Battery battery1 = new Battery();

        Car car1 = new Car("Audi", engine1, radiator1, battery1);
        Car car2 = new Car("Volvo", new Engine(260));
        Bus bus1 = new Bus();

        Car car3 = new Car("Huyndai");

        car1.run();
        bus1.run();

        car1.parking();
        bus1.parking();

        Info.printInfo();

        bus1.showSeatsNumber();

        //car1.printCarInfo();


    }
}
