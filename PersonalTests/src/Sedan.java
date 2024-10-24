import java.util.ArrayList;
import java.util.List;

public class Sedan extends Car{

    public Sedan(String licensePlate, String vehicleType, double rentalPrice) {
        super(licensePlate, vehicleType, rentalPrice);
    }

    @Override
    public void printVehicleDetails() {
        System.out.println("License plate: " + getLicensePlate() + " Vehicle Type: " +
                getVehicleType() + " Rent per day: " + getRentalPricePerDay());
    }

    @Override
    public void printRentedBy() {
        System.out.println("Sedan rented by: " + getCustomers());
    }

    @Override
    public void rentVehicle(Customer customer) {
        getCustomers().add(customer);
        System.out.println("The customer " + customer.getName() + " has rented the sedan");

    }

    @Override
    public void returnVehicle(Customer customer) {
        getCustomers().remove(customer);
        System.out.println("The customer " + customer.getName() + " has returned the sedan");

    }
}
