package com.example.demo;

public class Car {
    private String brand;
    private String type;
    private String fuelType;
    private String color;

    public Car(String brand, String type, String fuelType, String color) {
        this.brand = brand;
        this.type = type;
        this.fuelType = fuelType;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public String getFuelType() {
        return fuelType;
    }

    public String getColor() {
        return color;
    }
}