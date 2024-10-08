abstract class FourDoorCar implements Car {
    String model;
    String name;
    String color;
    double price;
    double maxSpeed;
    double fuelCapacity;
    double speed;
    int year;
    int mileage;
    int power;

    public FourDoorCar
            (String model, String name, String color, double price, double maxSpeed, double fuelCapacity, int year, int mileage, int power) {
        this.model = model;
        this.name = name;
        this.color = color;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.fuelCapacity = fuelCapacity;
        speed = 0;
        this.year = year;
        this.mileage = mileage;
        this.power = power;
    }

    @Override
    public void start() {
        speed = 0;
        System.out.println(name + " Starting " + speed + " speed");
    }

    @Override
    public void stop() {
        speed = 0;
        System.out.println(name + " Stopping " + speed + " speed");
    }

    @Override
    public void accelerate() {
        speed += 10;
        System.out.println(name + " Accelerating " + speed + " speed");
    }

    @Override
    public void brake() {
        if (speed > 0) {
            speed -= 10;
        }
        if (speed < 0) {
            speed = 0;
        }
        System.out.println(name + " Braking " + speed + " speed");
    }

    @Override
    public double sell() {
        return 25000 + (( year==0?0.001:year / mileage==0?0.0001:mileage ) * power);
    }

    @Override
    public String toString() {
        return "FourDoorCar{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", year=" + year +
                ", mileage=" + mileage +
                ", power=" + power +
                '}';
    }
}

// Toyota class
class FourDoorToyota extends FourDoorCar {
    public FourDoorToyota(String model, String name, String color, double price, double maxSpeed, double fuelCapacity, int year, int mileage, int power) {
        super(model, name, color, price, maxSpeed, fuelCapacity, year, mileage, power);
    }

    public String toString() {
        return "FourDoorToyota{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", year=" + year +
                ", mileage=" + mileage +
                ", power=" + power +
                '}';
    }

    @Override
    public double sell() {
        return super.sell() * 1.5;
    }

    @Override
    public String getName() {
        return "";
    }
}
// BMW class
class FourDoorBMW extends FourDoorCar {
    public FourDoorBMW(String model, String name, String color, double price, double maxSpeed, double fuelCapacity, int year, int mileage, int power) {
        super(model, name, color, price, maxSpeed, fuelCapacity, year, mileage, power);
    }

    public String toString() {
        return "FourDoorBMW{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", fuelCapacity=" + fuelCapacity +
                ", speed=" + speed +
                ", year=" + year +
                ", mileage=" + mileage +
                ", power=" + power +
                '}';
    }

    @Override
    public double sell() {
        return super.sell() * 2.5;
    }

    @Override
    public String getName() {
        return "";
    }
}
    // Ford class
    class FourDoorFord extends FourDoorCar {
        public FourDoorFord(String model, String name, String color, double price, double maxSpeed, double fuelCapacity, int year, int mileage, int power) {
            super(model, name, color, price, maxSpeed, fuelCapacity, year, mileage, power);
        }

        public String toString() {
            return "FourDoorFord{" +
                    "model='" + model + '\'' +
                    ", name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    ", price=" + price +
                    ", maxSpeed=" + maxSpeed +
                    ", fuelCapacity=" + fuelCapacity +
                    ", speed=" + speed +
                    ", year=" + year +
                    ", mileage=" + mileage +
                    ", power=" + power +
                    '}';
        }

        @Override
        public double sell() {
            return super.sell() * 2.3;
        }

        @Override
        public String getName() {
            return "";
        }
    }

        // Hyundai class
        class FourDoorHyundai extends FourDoorCar {

            public FourDoorHyundai(String model, String name, String color, double price, double maxSpeed, double fuelCapacity, int year, int mileage, int power) {
                super(model, name, color, price, maxSpeed, fuelCapacity, year, mileage, power);
            }

            public String toString() {
                return "FourDoorHyundai{" +
                        "model='" + model + '\'' +
                        ", name='" + name + '\'' +
                        ", color='" + color + '\'' +
                        ", price=" + price +
                        ", maxSpeed=" + maxSpeed +
                        ", fuelCapacity=" + fuelCapacity +
                        ", speed=" + speed +
                        ", year=" + year +
                        ", mileage=" + mileage +
                        ", power=" + power +
                        '}';
            }

            @Override
            public double sell() {
                return super.sell();
            }

            @Override
            public String getName() {
                return "";
            }
        }