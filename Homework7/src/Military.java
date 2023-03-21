public class Military extends Air{
    private boolean ejectionSystem;
    private int numberOfRockets;

    public Military(int power,
                    int maxSpeed,
                    int weight,
                    String brand,
                    int wingspan,
                    int minRunwayLength,
                    boolean ejectionSystem,
                    int numberOfRockets) {
        super(power, maxSpeed, weight, brand, wingspan, minRunwayLength);
        this.ejectionSystem = ejectionSystem;
        this.numberOfRockets = numberOfRockets;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Наличие системы катапультирования - " + ejectionSystem);
        System.out.println("Кол-во ракет на борту - " + numberOfRockets);
    }

    public void fire() {
        if (numberOfRockets > 0) {
            System.out.println("Ракета пошла...");
        }
        else if (numberOfRockets == 0) {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void ejection() {
        if (ejectionSystem == true) {
            System.out.println("Катапультирование прошло успешно");
        }
        else {
            System.out.println("“У вас нет такой системы");
        }
    }
}
