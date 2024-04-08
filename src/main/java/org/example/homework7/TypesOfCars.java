package org.example.homework7;

public enum TypesOfCars {
    SEDAN("седан"), COUPE("купер"), HATCHBACK("хэтчбэк"), MINIVAN("минивен");

    private String translation;

    TypesOfCars(String translation) {
        this.translation = translation;
    }

    public String getTypesOfCars() {
        return "Тип транспорта " +translation;
    }

}
