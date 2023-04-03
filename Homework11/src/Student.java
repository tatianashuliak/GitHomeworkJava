import java.util.ArrayList;

public class Student {
    private int age;
    private String name;
    private ArrayList<Integer> ratingList;


    public Student(int age, String name, ArrayList<Integer> ratingList) {
        this.age = age;
        this.name = name;
        this.ratingList = ratingList;
    }

    public ArrayList<Integer> getRatingList() {
        return ratingList;
    }

    public double getRatingOfStudent() {
        double sum = 0;
        int i = 0;
        for (int value : ratingList) {
            sum += value;
            i++;
        }
        double ratingOfStudent = sum / i;
        return ratingOfStudent;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

