package org.example.car;

public class Engine {

    private int power = 250;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Engine() {
    }

    public Engine(int power) {
        this.power = power;
    }
}
