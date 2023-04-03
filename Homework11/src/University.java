import java.util.ArrayList;

public class University {
    private String nameOfUniversity;
    private ArrayList<Student> studentsList;
    private double universityRanking;

    public University(String nameOfUniversity, ArrayList studentsList, double universityRanking) {
        this.nameOfUniversity = nameOfUniversity;
        this.studentsList = studentsList;
        this.universityRanking = universityRanking;
    }

    public double getUniversityRanking() {
        double sum = 0;
        for (Student s : studentsList) {
            double studentRating = s.getRatingOfStudent();
            sum += studentRating;
        }
        universityRanking = sum / studentsList.size();
        return universityRanking;
    }

    public void deleteStudent(Object studentOfUni) {
        ArrayList<Object> listToRemove = new ArrayList<>();
        for (Student value : studentsList) {
            if (value.equals(studentOfUni)) {
                listToRemove.add(value);
            }
        }
        studentsList.removeAll(listToRemove);
    }

    public void findStudent(String studentName) {
        for (Student value : studentsList) {
            String s = value.getName();
            if (s.equals(studentName)) {
                System.out.println(value);
            }
        }
    }

    public void addStudent(Student student) {
        studentsList.add(student);
    }
}
