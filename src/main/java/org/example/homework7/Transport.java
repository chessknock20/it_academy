package org.example.homework7;

import java.util.Objects;

public class Transport {
    public String model;
    public int maxSpeed;

    public static int CountOfTransport;

    public Transport() {
        CountOfTransport++;
    }

    public Transport(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        CountOfTransport++;
    }

    public static void printCountOfTransport() {
        System.out.println(CountOfTransport);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transport transport = (Transport) o;

        if (maxSpeed != transport.maxSpeed) return false;
        return Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + maxSpeed;
        return result;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
