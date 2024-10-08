import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dealer {
    String name;
    double carPrice;
    private List<String> cars;

    // Constructor for the Dealer class
    public Dealer(String name, double carPrice) {
        this.name = name;
        this.carPrice = carPrice;
        this.cars = new ArrayList<String>();
    }

    // Method to add a car to the dealer's inventory
    public void addCar(String carDetails) {
        cars.add(carDetails);
        System.out.println("Car added: " + carDetails);
    }

    // Show all cars in the inventory
    public void showCars() {
        if (cars.isEmpty()) {
            System.out.println("No cars available.");
        } else {
            System.out.println("Available cars:");
            for (int i = 0; i < cars.size(); i++) {
                System.out.println((i + 1) + ". " + cars.get(i));
            }
        }
    }

    // Sell a car from the inventory
    public void sellCar(int index) {
        if (index >= 0 && index < cars.size()) {
            System.out.println("Sold: " + cars.get(index));
            cars.remove(index);
        } else {
            System.out.println("Invalid car number.");
        }
    }

    // Dealer menu to interact with the system
    public void dealerMenu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nDealer Menu:");
            System.out.println("1. Show all cars");
            System.out.println("2. Add a new car");
            System.out.println("3. Sell a car");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    showCars();
                    break;
                case 2:
                    System.out.print("Enter car details: ");
                    String carDetails = scanner.nextLine();
                    addCar(carDetails);
                    break;
                case 3:
                    showCars();
                    System.out.print("Enter car number to sell: ");
                    int carIndex = scanner.nextInt() - 1;
                    sellCar(carIndex);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
