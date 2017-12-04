package business.control;

import business.model.student.Student;
import java.util.ArrayList;

public class StudentControl {

    public static Student student = new Student();
    public static int studentID = 0;

    public static ArrayList<Student> studentsList = new ArrayList<>();

    public static void addStudent(String email, String password, int admin) {
        try {
            Validator.validateEmail(email);
            Validator.validatePassword(password);
            student.setEmail(email);
            student.setPassword(password);
            student.setAdmin(admin);
        } catch (Exception error) {
            System.out.println("Error: " + error);
        }
    }
}
