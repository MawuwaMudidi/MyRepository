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

        Dealer dealer = new Dealer("Joe", 100000);
        dealer.dealerMenu();

    }
}


