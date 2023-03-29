public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes", 150, 15000);
        Car car2 = new Car("Audi", 200, 10000);
        try {
            car1.start();
        }
        catch (CarDidntStartException e) {
            e.printStackTrace();
        }
        try {
            car2.start();
        }
        catch (CarDidntStartException e) {
            e.printStackTrace();
        }
    }
}