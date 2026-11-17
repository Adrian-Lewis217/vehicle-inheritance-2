package com.pluralsight;

public class Vehicle {
    private String model;
    private String color;
    private int topSpeed;
    private int fuelCapacity;
    private int numberOfPassengers;
    private int cargoCapacity;

    // Constructor


    public Vehicle(String model, String color, int topSpeed, int fuelCapacity, int numberOfPassengers, int cargoCapacity) {
        this.model = model;
        this.color = color;
        this.topSpeed = topSpeed;
        this.fuelCapacity = fuelCapacity;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
    }

    public Vehicle(String color, int topSpeed, int numberOfPassengers) {
        this.color = color;
        this.topSpeed = topSpeed;
        this.numberOfPassengers = numberOfPassengers;
    }

    public Vehicle(String color, int fuelCapacity) {
        this.color = color;
        this.fuelCapacity = fuelCapacity;
    }

    public Vehicle(int numberOfPassengers,String model) {
        this.numberOfPassengers = numberOfPassengers;
        this.model = model;
    }

    public Vehicle(int topSpeed,int cargoCapacity) {
        this.topSpeed = topSpeed;
        this.cargoCapacity = cargoCapacity;
    }

    public Vehicle() {
    }

    // Getter
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    // Setter
    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    // Methods
    public static void startEngine(){}
    public static void stopEngine(){}
    public static void accelerate(){}
    public static void brake(){}
}
