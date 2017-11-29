package business.control;

import infra.database.MysqlConnect;
import business.model.exceptions.StudentNotExistException;
import business.model.exceptions.LoginValidationException;
import business.model.exceptions.PasswordValidationException;
import business.model.student.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class StudentControl {

    public static void addStudent(String email, String password, int admin) {
        try {
            MysqlConnect mysql = MysqlConnect.getDbCon();
            Validator.validateEmail(email);
            Validator.validatePassword(password);
            mysql.insert("INSERT INTO `students` (`email`, `password`, `page_admin`) VALUES ('" + email + "', '" + password + "', '" + admin + "');");
        } catch (LoginValidationException | PasswordValidationException | SQLException lve) {
            JOptionPane.showMessageDialog(null, lve.getMessage());
        }
    }

    public static ResultSet getStudent(String email, String password) throws StudentNotExistException {
        try {
            MysqlConnect mysql = MysqlConnect.getDbCon();
            return mysql.query("SELECT * FROM `students` WHERE email = '" + email + "' and password = '" + password + "';");
        } catch (SQLException error) {
            System.out.println("Error: " + error);
        }
        return null;
    }

    public void setAccess(int access, String email) throws StudentNotExistException {
        try {
            MysqlConnect mysql = MysqlConnect.getDbCon();
            mysql.insert("UPDATE `students` SET `page_admin` = " + access + " where `email` = '" + email + "';");
        } catch (SQLException error) {
            System.out.println("Error: " + error);
        }
    }

    public static void loginStudent(String email, String password) throws SQLException {
        try {
            ResultSet res = getStudent(email, password);
            Student student = new Student();
            while(res.next()){
                student.setEmail(res.getString(email));
                student.setPassword(res.getString(password));
            }
            student.login(email, password);
        } catch (StudentNotExistException ex) {
            System.out.println("This user do not exist.");
        }
    }
}
