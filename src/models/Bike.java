package models;

import interfaces.Rentable;

public class Bike extends Vehicle implements Rentable {

        public Bike(String id, String brand, double rentPrice){
                super(id,brand,rentPrice);
        }

    @Override
    public void rent(){
        System.out.println("BIKE RENTED");
    }

    @Override
    public void returnVehicle(){
        System.out.println("BIKE RETURNED");
    }

    @Override
    public void displayDetails(){
        System.out.println("DISPLAY BIKE DETAILS");
    }
}
