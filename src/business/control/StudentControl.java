package business.control;

import infra.database.MysqlConnect;
import business.model.exceptions.StudentNotExistException;
import business.model.exceptions.LoginValidationException;
import business.model.exceptions.PasswordValidationException;
import business.model.student.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class StudentControl {

    private static ArrayList<Student> students = new ArrayList<Student>();

    public static void addStudent(String email, String password, int admin) {
        try {
            MysqlConnect mysql = MysqlConnect.getDbCon();
            Validator.validateEmail(email);
            Validator.validatePassword(password);
            mysql.insert("INSERT INTO `students` (`email`, `password`, `page_admin`) VALUES ('" + email + "', '" + password + "', '" + admin + "');");
            Student student = new Student(email, password, admin);
            getStudents().add(student);
        } catch (LoginValidationException | PasswordValidationException | SQLException lve) {
            JOptionPane.showMessageDialog(null, lve.getMessage());
        }
    }

    public static Student getStudent(String email) throws StudentNotExistException {
        try {
            MysqlConnect mysql = MysqlConnect.getDbCon();
            ResultSet result = mysql.query("SELECT * FROM `students` WHERE email = '" + email + ";");
            Student student = new Student();
            while (result.next()) {
                student = new Student(email, result.getString("password"), Integer.parseInt(result.getString("admin")));
            }
            return student;
        } catch (SQLException error) {
            System.out.println("Error: " + error);
        }
        return null;
    }

    public static void loginStudent(String email, String password) {
        try {
            Student student = getStudent(email);
            student.login(email, password);
        } catch (StudentNotExistException error) {
            System.out.println("User do not exists");
        }
    }

    public void setAccess(int access, String email) throws StudentNotExistException {
        try {
            MysqlConnect mysql = MysqlConnect.getDbCon();
            mysql.insert("UPDATE `students` SET `page_admin` = " + access + " where `email` = '" + email + "';");
        } catch (SQLException error) {
            System.out.println("Error: " + error);
        }
    }

    public static String listAllStudents() throws SQLException { //Deve-se deixar mais generico
        MysqlConnect mysql = MysqlConnect.getDbCon();
        ResultSet result = mysql.query("SELECT * FROM `students`;");
        String list = "";

        while (result.next()) {
            list += "Email: " + result.getString("email") + "\nPassword: " + result.getString("email") + "\n\n";
        }

        return list;
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }
}
