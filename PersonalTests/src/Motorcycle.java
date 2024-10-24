import java.util.ArrayList;

public abstract class Motorcycle implements Vehicle {
    private String licensePlate;
    private String vehicleType;
    private double rentalPrice;
    private ArrayList<Customer> customers;

    public Motorcycle(String licensePlate, String vehicleType, double rentalPrice) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
        this.rentalPrice = rentalPrice;
        this.customers = new ArrayList<>();
    }
    @Override
    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public double getRentalPricePerDay() {
        return rentalPrice;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
