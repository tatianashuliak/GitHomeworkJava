public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel core i5", 16, 512, 3, true);
        computer.describe();
        int i = 0;
        while (computer.computerIsWorking && i < computer.cyclesOfWork) {
            computer.turnOn();
            computer.turnOff();
            i++;
        }
        if (i >= computer.cyclesOfWork) {
            System.out.println("Отработаны все циклы работы. Ваш компьютер сгорел");
        }
        computer.turnOn();
    }
}