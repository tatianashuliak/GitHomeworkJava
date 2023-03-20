public class Calculator {
    private double firstVariable;
    private double secondVariable;

    public Calculator(double firstVariable, double secondVariable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
    }

    public void calculateSum() {
        System.out.println("Сумма двух чисел равна " + (firstVariable + secondVariable));
    }

    public void calculateDif() {
        System.out.println("Разность двух чисел равна " + (firstVariable - secondVariable));
    }

    public void calculateMult() {
        System.out.println("Произведение двух чисел равно " + (firstVariable * secondVariable));
    }

    public void calculateDiv() {
        System.out.println("Частное двух чисел равно " + (firstVariable / secondVariable));
    }
}
