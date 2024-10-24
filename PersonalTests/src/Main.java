//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("001", "John", 30);
        Customer customer2 = new Customer("002", "James", 25);
        Customer customer3 = new Customer("003", "Neema", 28);
        Customer customer4 = new Customer("004", "Mark", 50);

        Sedan sedan = new Sedan("UBJ001J", "race car", 99.99);
        SportBike bike = new SportBike("UAA001U", "Sport Bike", 22.5);

        System.out.println("The details for sedan cars are:");
        sedan.printVehicleDetails();

        System.out.println("The details for sport bikes are:");
        bike.printVehicleDetails();

        sedan.rentVehicle(customer1);
        sedan.returnVehicle(customer1);

        sedan.rentVehicle(customer2);

        bike.rentVehicle(customer3);
        bike.returnVehicle(customer3);

        bike.rentVehicle(customer4);








    }
}