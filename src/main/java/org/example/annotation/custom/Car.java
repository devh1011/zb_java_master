package org.example.annotation.custom;

public class Car {
    private final String model;

    private final Integer year; // 연식
    public Car(String model, Integer year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }
    public Integer getYear() {
        return year;
    }
    @Override
    public String toString() {
        return "Car{" +
            "model='" + model + '\'' +
            ", year='" + year + '\'' +
            '}';
    }
}
