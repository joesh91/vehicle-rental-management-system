    package services;

    import exceptions.VehicleNotFoundException;
    import interfaces.Rentable;
    import models.Vehicle;
    import repository.Repository;

    import java.util.List;

    public class RentalService {

                // REPOSITORY OBJECT TO MANAGE VEHICLES
    private Repository <Vehicle> vehicleRepository;

                // CONSTRUCTOR INJECTION
     public RentalService(Repository <Vehicle> vehicleRepository){

        this.vehicleRepository = vehicleRepository;
     }

    public void rentVehicle(String VehicleId) throws VehicleNotFoundException {

         Vehicle vehicle = findVehicleById(VehicleId) ;

            if(vehicle instanceof Rentable rentableVehicle){
                    rentableVehicle.rent();
                System.out.println("VEHICLE RENTED SUCCESSFULLY");
            }else{
                System.out.println("VEHICLE IS NOT RENTABLE");
            }





    }

    public Vehicle findVehicleById(String VehicleId) throws VehicleNotFoundException{
        Vehicle vehicle=null;
       List<Vehicle> VehicleList = vehicleRepository.getAll();

        for(Vehicle v : VehicleList){
            if(v.getId().equalsIgnoreCase(VehicleId)){
                vehicle = v;
                return vehicle;
            }
        }

            throw new VehicleNotFoundException(
                    "VEHICLE ID : " +VehicleId+ " NOT FOUND"
            );
    }

    public void returnVehicle(String VehicleID) throws VehicleNotFoundException{

         Vehicle vehicle = findVehicleById(VehicleID);

            if(vehicle instanceof Rentable rentableVehicle){
                    rentableVehicle.returnVehicle();
                    System.out.println("VEHICLE RETURNED SUCCESSFULLY");
            }else{
                    System.out.println("VEHICLE IS NOT RETURNABLE ");
            }

    }

    public void displayAllVehicles() {

         List <Vehicle> vehicles = vehicleRepository.getAll();

            if(vehicles.isEmpty()){
                System.out.println("NO VEHICLES TO DISPLAY");
                return;
            }
                for(Vehicle v : vehicles){
                       v.displayDetails();
                    System.out.println("*****");
                }

    }

    public void addVehicle(Vehicle vehicle){

        vehicleRepository.add(vehicle);
        System.out.println("VEHICLE ADDED SUCCESSFULLY.");
        System.out.println("TOTAL VEHICLES : "+vehicleRepository.getAll().size());

    }

    public void removeVehicle(String vehicleId) throws VehicleNotFoundException{

         List <Vehicle> vehicles = vehicleRepository.getAll();

         Vehicle foundVehicle = null;

            for(Vehicle v : vehicles){
                if(v.getId().equalsIgnoreCase(vehicleId)){
                    foundVehicle = v;
                    break;
                }
            }
            if(foundVehicle==null){
                throw new VehicleNotFoundException("VEHICLE ID : " +vehicleId+ " NOT FOUND");
            }
            vehicles.remove(foundVehicle);
        System.out.println("VEHICLE REMOVAL DONE SUCCESSFULLY");
    }



    }