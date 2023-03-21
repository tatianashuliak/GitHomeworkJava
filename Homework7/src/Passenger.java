public class Passenger extends Ground{
    private String bodyType;
    private int numberOfPassengers;

    double amountOfFuel;
    public Passenger(int power,
                     int maxSpeed,
                     int weight,
                     String brand,
                     int numberOfWheels,
                     int fuelСonsumption,
                     String bodyType,
                     int numberOfPassengers) {
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelСonsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
        }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Тип кузова - " + bodyType);
        System.out.println("Кол-во пассажиров - " + numberOfPassengers);
    }
    private double calculateFuel (int time) {
        amountOfFuel = getFuelСonsumption()* ((getMaxSpeed()*time)/100);
        return amountOfFuel;
    }
    public void calculateDistance (int time) {
        calculateFuel(time);
        System.out.println("За время " + time + " ч, автомобиль " + getBrand() + " двигаясь с максимальной скоростью "
                + getMaxSpeed() + " км/ч проедет " + getMaxSpeed()*time + " км и израсходует " + amountOfFuel + " литров топлива.");
    }

}

