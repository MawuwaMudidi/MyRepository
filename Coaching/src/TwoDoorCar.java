abstract class TwoDoorCar implements Car{
    String model;
    String name;
    int carSits;
    double price;
    double maxSpeed;
    double fuelCapacity;
    double speed;

    public TwoDoorCar
            (String model, String name, int carSits ,double price, double maxSpeed, double fuelCapacity) {
        this.model = model;
        this.name = name;
        this.carSits = carSits;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.fuelCapacity = fuelCapacity;
        speed = 0;
    }
    @Override
    public void start() {
        speed = 0;
        System.out.println(name+" Starting "+ speed + " speed");
    }
    @Override
    public void stop() {
        speed = 0;
        System.out.println(name+" Stopping "+ speed+" speed");
    }
    @Override
    public void accelerate() {
        speed += 10;
        System.out.println(name+" Accelerating "+ speed+" speed");
    }

    @Override
    public void brake() {
        if(speed > 0){
            speed -= 10;
        }
        if (speed < 0) {
            speed = 0;
        }
        System.out.println(name+" Braking "+ speed+" speed");
    }
    @Override
    public String toString() {
        return "TwoDoorCar{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", carSits='" + carSits + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                '}';
    }
}
// Toyota class
class TwoDoorToyota extends TwoDoorCar {
    public TwoDoorToyota
            (String model, String name, int carSits, double price, double maxSpeed, double fuelCapacity) {
        super(model, name, carSits, price, maxSpeed, fuelCapacity);
    }
    public String toString() {
        return "TwoDoorToyota{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", carSits='" + carSits + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                '}';
    }

    @Override
    public double sell() {
        return 0;
    }

    @Override
    public String getName() {
        return "";
    }
}
// BMW class
class TwoDoorBMW extends TwoDoorCar {
    public TwoDoorBMW
            (String model, String name, int carSits, double price, double maxSpeed, double fuelCapacity) {
        super(model, name, carSits, price, maxSpeed, fuelCapacity);
    }
    public String toString() {
        return "TwoDoorBMW{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", carSits='" + carSits + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                '}';
    }

    @Override
    public double sell() {
        return 0;
    }

    @Override
    public String getName() {
        return "";
    }
}
// Ford class
class TwoDoorFord extends TwoDoorCar {
    public TwoDoorFord
            (String model, String name, int carSits, double price, double maxSpeed, double fuelCapacity) {
        super(model, name, carSits, price, maxSpeed, fuelCapacity);
    }
    public String toString() {
        return "TwoDoorFord{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", carSits='" + carSits + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                '}';
    }

    @Override
    public double sell() {
        return 0;
    }

    @Override
    public String getName() {
        return "";
    }
}
// Hyundai class
class TwoDoorHyundai extends TwoDoorCar {
    public TwoDoorHyundai
            (String model, String name, int carSits, double price, double maxSpeed, double fuelCapacity) {
        super(model, name, carSits, price, maxSpeed, fuelCapacity);
    }
    public String toString() {
        return "TwoDoorHyundai{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", carSits='" + carSits + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                '}';
    }

    @Override
    public double sell() {
        return 0;
    }

    @Override
    public String getName() {
        return "";
    }
}