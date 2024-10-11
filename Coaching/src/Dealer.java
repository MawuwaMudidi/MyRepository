import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dealer {
    String name;
    String location;
    String contact;

    double carPrice;
    private List<String> cars;

    // Constructor for the Dealer class
    public Dealer(String name, String location, String contact, double carPrice) {
        this.name = name;
        this.location = location;
        this.contact = contact;
        this.carPrice = carPrice;
        this.cars = new ArrayList<String>();
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Dealer Menu ---");
            System.out.println("1. View Dealer Info");
            System.out.println("2. Update Dealer Info");
            System.out.println("0. Exit to Main Menu");
            System.out.print("Select an option: ");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    viewInfo();
                    break;
                case 2:
                    updateInfo();
                    break;
                case 0:
                    System.out.println("Exiting to main menu...");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        } while (choice != 0);
    }
    public void viewInfo() {
        System.out.println("\n--- Dealer Information ---");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Contact: " + contact);
    }
    public void updateInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter new dealer name: ");
        this.name = sc.nextLine();
        System.out.print("Enter new dealer location: ");
        this.location = sc.nextLine();
        System.out.print("Enter new dealer contact: ");
        this.contact = sc.nextLine();

        System.out.println("Dealer info updated successfully.");
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
            System.out.println("\n--- Dealers Menu ---");
            System.out.println("1. " + "Show dealers info");
            System.out.println("2. " + "Show all cars");
            System.out.println("3. Add a new car");
            System.out.println("4. Sell a car");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            switch (choice) {
                case 1:
                    menu();
                    break;
                case 2:
                    showCars();
                    break;
                case 3:
                    addCar();
                    break;
                case 4:
                    sellCar();
                    break;
                case 0:
                    System.out.println(" exiting program");
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;

            } while (choice != 0);
        }
    }
}
