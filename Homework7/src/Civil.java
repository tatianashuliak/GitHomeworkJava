public class Civil extends Air {
    private int numberOfPassengers;
    private boolean businessClass;

    public Civil(int power,
                 int maxSpeed,
                 int weight,
                 String brand,
                 int wingspan,
                 int minRunwayLength,
                 int numberOfPassengers,
                 boolean businessClass) {
        super(power, maxSpeed, weight, brand, wingspan, minRunwayLength);
        this.numberOfPassengers = numberOfPassengers;
        this.businessClass = businessClass;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Кол-во пассажиров - " + numberOfPassengers);
        System.out.println("Наличие бизнес класса - " + businessClass);
    }

    public void checkPassengerCapacity(int passengers) {
        if (passengers > numberOfPassengers) {
            System.out.println("Вам нужен самолет побольше");
        } else {
            System.out.println("Самолет готов к вылету");
        }
    }
}
