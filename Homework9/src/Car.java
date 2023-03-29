import java.util.Random;

public class Car {
    private String brand;
    private int speed;
    private int price;

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void start() throws CarDidntStartException {
        Random random = new Random();
        int randomValue = random.nextInt(21);
        if (randomValue%2==0) {
                throw new CarDidntStartException("Ошибка, автомобиль не завелся");
        }
        else {
            System.out.println("Автомобиль с маркой "+ brand + " завелся");
        }

    }
}
