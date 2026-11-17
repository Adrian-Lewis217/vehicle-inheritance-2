package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped("Blue", 5, 200);
        Car hotRide = new Car(2,"Camaro", 2);
        SemiTruck bigRide = new SemiTruck(100,2000,1);
        Hovercraft seaRide = new Hovercraft("Jet Black",120,3,20);

        /*slowRide.setColor("Red");
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
        System.out.println("The Moped is " + slowRide.getColor() + " with a fuel capacity of " + slowRide.getFuelCapacity() + ".");*/
    }
}
