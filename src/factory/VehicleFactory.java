package factory;

import enums.VehicleType;
import models.Bike;
import models.Car;
import models.Truck;
import models.Vehicle;

public class VehicleFactory {

    public static Vehicle createVehicle(VehicleType type, String id,String brand, double price,int seats){

            switch(type){
                case CAR    : return new Car(id,brand,price,seats);
                case BIKE   : return new Bike(id,brand,price);
                case TRUCK  : return new Truck(id,brand,price);
                default     : throw new IllegalArgumentException("INVALID TYPE");
            }

    }
}
