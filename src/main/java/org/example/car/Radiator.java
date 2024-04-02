package org.example.car;

public class Radiator {

    private String brand = "Nissens";

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Radiator() {}

    public Radiator(String brand) {
        this.brand = brand;
    }
}
