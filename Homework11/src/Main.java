import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ratingList = new ArrayList<>();
        ratingList.add(8);
        ratingList.add(7);
        ratingList.add(10);
        Student student = new Student(17, "Grisha", ratingList);
        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(student);
        University university = new University("Harvard", studentsList, 0);
    }
}