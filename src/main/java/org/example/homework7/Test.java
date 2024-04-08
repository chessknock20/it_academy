package org.example.homework7;

public class Test {
    public static void main(String[] args) {

        Car car1 = new Car("Volvo", 220);
        Car car2 = new Car("BMW", 240);

        System.out.println(car1.equals(car2));
        System.out.println(car1.hashCode());
        System.out.println(car2.toString());

        Transport.printCountOfTransport();

        TypesOfCars audi = TypesOfCars.SEDAN;
        System.out.println(audi.getTypesOfCars());

    }
}
