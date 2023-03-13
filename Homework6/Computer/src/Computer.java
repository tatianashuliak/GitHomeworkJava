import java.util.Random;
import java.util.Scanner;

public class Computer {
    String processor;
    int ram;
    int hardDisk;
    int cyclesOfWork;
    boolean computerIsWorking;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public Computer(String processor, int ram, int hardDisk, int cyclesOfWork, boolean computerIsWorking) {
        this.processor = processor;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.cyclesOfWork = cyclesOfWork;
        this.computerIsWorking = computerIsWorking;
    }

    public void describe() {
        System.out.println("Процессор компьютера - " + processor);
        System.out.println("Оперативная память компьютера - " + ram + " гб");
        System.out.println("Жесткий диск компьютера - " + hardDisk + " гб");
        System.out.println("Ресурс полных циклов работы - " + cyclesOfWork);
    }

    public void turnOn() {
        int a = random.nextInt(2);
        System.out.println("Чтобы включить компьютер, введите число 0 или 1");
        int b = scanner.nextInt();
        if (computerIsWorking) {
            if (a == b) {
                System.out.println("Идет включение компьютера...");
            } else if (b != 0 && b != 1) {
                System.out.println("Вы выбрали несуществующую опцию");
                computerIsWorking = false;
            } else {
                System.out.println("К сожалению, Ваш компьютер сгорел");
                computerIsWorking = false;
            }
        } else {
            System.out.println("Невозможно включить компьютер, он сгорел");
        }

    }

    public void turnOff() {
        if (computerIsWorking) {
            int a = random.nextInt(2);
            System.out.println("Чтобы выключить компьютер, введите число 0 или 1");
            int b = scanner.nextInt();
            if (a == b) {
                System.out.println("Идет выключение компьютера...");
            } else if (b != 0 && b != 1) {
                System.out.println("Вы выбрали несуществующую опцию");
                computerIsWorking = false;
            } else {
                System.out.println("К сожалению, Ваш компьютер сгорел");
                computerIsWorking = false;
            }
        }
    }
}
