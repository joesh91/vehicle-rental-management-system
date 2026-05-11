package models;

import interfaces.Rentable;

import java.sql.SQLOutput;

public class Truck extends Vehicle implements Rentable {

    public Truck(String id, String brand, double rentPrice){
            super(id,brand,rentPrice);
    }

    @Override
    public void displayDetails(){
        System.out.println("DISPLAY TRUCK DETAILS ");
    }

    @Override
    public void rent(){
        System.out.println("TRUCK RENTED");
    }

    @Override
    public void returnVehicle(){
        System.out.println("TRUCK RETURNED");
    }
}
