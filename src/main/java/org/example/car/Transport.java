package org.example.car;

public abstract class Transport {
    private String model = "Default model";
    private int height = 1500;
    private int weight = 1600;
    private int maxSpeed = 220;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {return model;}

    public void setModel(String model) {this.model = model;}

    public int getHeight() {return height;}

    public void setHeight(int height) {this.height = height;}

    public int getWeight() {return weight;}

    public void setWeight(int weight) {this.weight = weight;}

    public Transport() {
    }

    public Transport(String model) {
        this.model = model;
    }

    public Transport(String model, int height, int weight, int maxSpeed) {
        this.model = model;
        this.height = height;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    public abstract void run();

    public void parking() {
        System.out.println("The transport is parked");
    }

}
