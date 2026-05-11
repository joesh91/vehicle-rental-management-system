package models;

public abstract class Vehicle {
    private String id;
    private String brand;
    private double rentPrice;

            // CONSTRUCTOR

    public Vehicle(String id, String brand, double rentPrice) {
        this.id = id;
        this.brand = brand;
        this.rentPrice = rentPrice;
    }

            // GETTERS

    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public double getRentPrice() {
        return rentPrice;
    }

            // SETTERS

    public void setId(String id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

            // FUNCTIONS

    public abstract void displayDetails();
}
