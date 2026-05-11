package models;

import interfaces.Rentable;

import java.sql.SQLOutput;

public class Car extends Vehicle implements Rentable {

    private int seats;

    public Car(String id,String brand,double rentPrice ,int seats){
        super(id,brand,rentPrice);
        this.seats = seats;
    }

    @Override
    public void rent(){
        System.out.println("CAR RENTED");
    }

    @Override
    public void returnVehicle(){
        System.out.println("CAR RETURNED");
    }

    @Override
    public void displayDetails(){
        System.out.println("=== CAR DETAILS ===");
        System.out.println("ID : "+getId());
        System.out.println("BRAND : "+getId());
        System.out.println("RENT PRICE : "+getRentPrice());
        System.out.println("====");

    }
}
