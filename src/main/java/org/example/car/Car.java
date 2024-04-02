package org.example.car;

public class Car extends Transport {

    Engine engine;
    Radiator radiator;
    Battery battery;

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


//    public void printCarInfo(){
//
//        if(engine == null || radiator == null || battery == null) {
//            System.out.println(getModel() + ", " + getHeight() + ", " + getWeight() + ", " + getMaxSpeed());
//        } else {
//            System.out.println(getModel() + ", " + getHeight() + ", " + getWeight() + ", " + getMaxSpeed() + ", " + engine.getPower() + ", "+ radiator.getBrand()+ ", " + battery.getCapacity());
//        }
//    }
}

