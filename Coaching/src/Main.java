//Car <Interface>
//-> FourDoorCar <Abstract Class>
//->->FourDoorToyota <Class>
//->->FourDoorBMW <Class>
//->->FourDoorFord<Class>
//->->FourDoorHyundai <Class>
//-> TwoDoorCar <Abstract Class>
//->->TwoDoorToyota <Class>
//->->TwoDoorBMW <Class>
//->->TwoDoorFord <Class>
//->->TwoDoorHyundai <Class>

public class Main {
    public static void main(String[] args) {

        FourDoorToyota toyota = new FourDoorToyota("T1-001", "Camry", "Red", 30000, 200, 50, 2023, 0,40);

        Dealer dealer = new Dealer("Joe", "Kampala", "0778899221", 10000);
        dealer.dealerMenu();

        Dealers newDealer = new Dealers(dealer.name, dealer.location, dealer.contact, dealer.carPrice);

    }
}


