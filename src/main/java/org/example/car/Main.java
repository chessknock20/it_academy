package org.example.car;

public class Main {
    public static void main(String[] args) {

        Engine engine1 = new Engine();
        Radiator radiator1 = new Radiator();
        Battery battery1 = new Battery();

        Car car1 = new Car("Audi", engine1, radiator1, battery1);
        Bus bus1 = new Bus("Ford");

        Transport transport1 = new Car("Hyundai");
        transport1.parking();

        Transport transport2 = new Bus("Volvo");

        runTest(car1);
        runTest(transport1);

        car1.keepSpeed();
        car1.stop();

        runTest(transport2);
        bus1.keepSpeed();
        bus1.stop();
        bus1.refuel();
    }
    public static void runTest(Transport transport){

        transport.run();
    }
}
