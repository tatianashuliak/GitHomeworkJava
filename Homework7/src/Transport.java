public class Transport {
    private int power;
    private int maxSpeed;
    private int weight;
    private String brand;

    public Transport(int power, int maxSpeed, int weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public double calculatePower() {
        double kilowatt = power * 0.74;
        return kilowatt;
    }

    public void printInfo() {
        System.out.println("Мощность - " + power + " лошадиных сил");
        System.out.println("Мощность - " + calculatePower() + " кВ");
        System.out.println("Максимальная скорость - " + maxSpeed + " км/ч");
        System.out.println("Марка - " + brand);
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
