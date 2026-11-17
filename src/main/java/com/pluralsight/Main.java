package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        Car hotRide = new Car();
        SemiTruck bigRide = new SemiTruck();
        Hovercraft seaRide = new Hovercraft();

        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        System.out.println("The Moped is " + slowRide.getColor() + " with a fuel capacity of " + slowRide.getFuelCapacity() + ".");

        hotRide.setModel("Camaro");
        hotRide.setNumberOfPassengers(2);
        System.out.println("The " + hotRide.getModel() + " with " + hotRide.getNumberOfPassengers() + "seats.");

        bigRide.setCargoCapacity(7000);
        bigRide.setTopSpeed(65);
        System.out.println("The Semi-Truck has " + slowRide.getColor() + " with a fuel capacity of " + slowRide.getFuelCapacity() + ".");

        seaRide.setColor("Purple");
        seaRide.setNumberOfPassengers(4);
        System.out.println("The Moped is " + slowRide.getColor() + " with a fuel capacity of " + slowRide.getFuelCapacity() + ".");
    }
}
