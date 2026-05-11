import enums.VehicleType;
import factory.VehicleFactory;
import models.Vehicle;
import repository.Repository;
import services.RentalService;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
        Repository <Vehicle> vehicleRepository = new Repository<>();
        RentalService rentalService = new RentalService(vehicleRepository);

        boolean running = true;

            while(running){
                System.out.println(" ");
                System.out.println("** VEHICLE RENTAL SERVICE SYSTEM **");
                System.out.println("1 . Add Vehicle");
                System.out.println("2 . Display Vehicles");
                System.out.println("3 . Rent Vehicle");
                System.out.println("4 . Return Vehicle");
                System.out.println("5 . Remove Vehicles");
                System.out.println("9 . Exit");

                System.out.println("ENTER YOUR CHOICE");

                int choice = scn.nextInt();
                scn.nextLine();

                switch (choice){

                    case 1:

                        System.out.println("ENTER VEHICLE ID");
                        String id = scn.nextLine();

                        System.out.println("ENTER BRAND");
                        String brand = scn.nextLine();

                        System.out.println("ENTER PRICE");
                        double rentPrice = scn.nextDouble();
                        scn.nextLine();

                        System.out.println("NO OF SEATS ");
                        int seats = scn.nextInt();
                        scn.nextLine();

                        System.out.println("ENTER TYPE (CAR / BIKE / TRUCK)");
                        String type = scn.nextLine().toUpperCase();

                        Vehicle vehicle = VehicleFactory.createVehicle(VehicleType.valueOf(type),id,brand,rentPrice,seats);

                        rentalService.addVehicle(vehicle);
                        break;

                    case 2 : rentalService.displayAllVehicles();
                                break;

                    case 3 :
                }

            }

    }
}
