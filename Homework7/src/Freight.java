public class Freight extends Ground {
    private int loadCapacity;

    public Freight(int power,
                   int maxSpeed,
                   int weight,
                   String brand,
                   int numberOfWheels,
                   int fuelСonsumption,
                   int loadCapacity) {
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelСonsumption);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Грузоподъемность - " + loadCapacity + " т");
    }

    public void checkLoadCapacity(double cargo) {
        if (cargo > loadCapacity) {
            System.out.println("Вам нужен грузовик побольше");
        } else {
            System.out.println("Грузовик загружен");
        }
    }

}
