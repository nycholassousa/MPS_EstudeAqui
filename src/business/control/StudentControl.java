package business.control;

import business.model.exceptions.StudentNotExistException;
import business.model.exceptions.LoginValidationException;
import business.model.exceptions.PasswordValidationException;
import business.model.student.Student;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class StudentControl {

    private static ArrayList<Student> students = new ArrayList<Student>();

    public static void addStudent(String email, String password, int admin) {
        try {
            Validator.validateEmail(email);
            Validator.validatePassword(password);
            Student student = new Student(email, password, admin);
            getStudents().add(student);
        } catch (LoginValidationException | PasswordValidationException lve) {
            JOptionPane.showMessageDialog(null, lve.getMessage());
        }
    }

    public static Student getStudent(String email) throws StudentNotExistException {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getEmail().equals(email)) {
                return student;
            }
        }
        return null;
    }

    public static void loginStudent(String email, String password) {
        try {
            Student student = getStudent(email);
            student.login(email, password);
        } catch (StudentNotExistException ex) {
            System.out.println("This student do not exist");
        }
    }

    public void setAccess(int access, String email) throws StudentNotExistException {
        Student student = getStudent(email);
        student.setAdmin(access);
    }

    public static String listAllStudents(){
        String list = "";
        
        for(Student student : students){
            list += student.getInfo();
        }
        return list;
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }
    
    public static void clear(){
    	students.clear();
    }
}
