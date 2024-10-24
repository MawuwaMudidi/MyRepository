import java.util.ArrayList;

public class SportBike extends Motorcycle{

    public SportBike(String licensePlate, String vehicleType, double rentalPrice) {
        super(licensePlate, vehicleType, rentalPrice);
    }

    @Override
    public void printVehicleDetails() {
        System.out.println("License plate: " + getLicensePlate() + " Vehicle Type: " +
                getVehicleType() + " Rent per day: " + getRentalPricePerDay());
    }

    @Override
    public void printRentedBy() {
        System.out.println(getCustomers());
        }

    @Override
    public void rentVehicle(Customer customer) {
        getCustomers().add(customer);
        System.out.println("The customer " + customer.getName() + " has rented the bike");


    }

    @Override
    public void returnVehicle(Customer customer) {
        getCustomers().remove(customer);
        System.out.println("The customer " + customer.getName() + " has returned the bike");


    }
}

