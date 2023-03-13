import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа");
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        Calculator calculator = new Calculator(a, b);
        calculator.calculateSum();
        calculator.calculateDif();
        calculator.calculateMult();
        calculator.calculateDiv();
    }
}