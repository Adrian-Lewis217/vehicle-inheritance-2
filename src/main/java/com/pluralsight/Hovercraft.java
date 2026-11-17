package com.pluralsight;

public class Hovercraft extends Vehicle{
    private int airCushionPressure;

    public Hovercraft(String color, int topSpeed, int numberOfPassengers, int airCushionPressure) {
        super(color, topSpeed, numberOfPassengers);
        this.airCushionPressure = airCushionPressure;
    }

    public int getAirCushionPressure() {
        return airCushionPressure;
    }

    public void setAirCushionPressure(int airCushionPressure) {
        this.airCushionPressure = airCushionPressure;
    }

    public void hover() {}
}