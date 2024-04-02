package org.example.car;

public final class Bus extends Transport {

    private final int seatsNumber = 16;

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public Bus() {
    }

    public Bus(String model) {
        super(model);
    }

    public Bus(String model, int height, int weight, int maxSpeed) {
        super(model, height, weight, maxSpeed);
    }

    @Override
    public void run() {
        System.out.println("The bus is running");
    }

    public final void showSeatsNumber() {
        System.out.println(seatsNumber);
    }

}
