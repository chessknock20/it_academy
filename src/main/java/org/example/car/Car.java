package org.example.car;

public class Car extends Transport implements IRefuel, IStop, IKeepSpeed {

    Engine engine;
    Radiator radiator;
    Battery battery;
    int a = 5;

    public Car() {
    }

    public Car(String model) {
        super(model);
    }

    public Car(String model, int height, int weight, int maxSpeed) {
        super(model, height, weight, maxSpeed);
    }

    public Car(Engine engine, Radiator radiator, Battery battery) {
        this.engine = engine;
        this.radiator = radiator;
        this.battery = battery;
    }

    public Car(String model, Engine engine) {
        super(model);
        this.engine = engine;
    }

    public Car(String model, Engine engine, Radiator radiator, Battery battery) {
        super(model);
        this.engine = engine;
        this.radiator = radiator;
        this.battery = battery;
    }

    public Car(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void run() {
        System.out.println("The car is running");
    }

    @Override
    public void parking() {
        System.out.println("The car is parked");
    }

    @Override
    public void refuel() {
        System.out.println("The car is refueling");
    }


    @Override
    public void stop() {
        System.out.println("The car stopped");
    }
    @Override
    public void keepSpeed() {
        System.out.println("Keep speed 90");
    }


}

