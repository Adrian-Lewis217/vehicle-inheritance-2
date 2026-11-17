package com.pluralsight;

public class Moped extends Vehicle {
    private int maxWeight;

    public Moped(String color, int fuelCapacity, int maxWeight) {
        super(color, fuelCapacity);
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void ride(){}
}
