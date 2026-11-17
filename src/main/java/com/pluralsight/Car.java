package com.pluralsight;

public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(int numberOfPassengers, String model, int numberOfDoors) {
        super(numberOfPassengers, model);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void openTrunk() {}
    public void closeTrunk() {}
}
