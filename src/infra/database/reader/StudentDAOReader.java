package infra.database.reader;

import business.control.StudentControl;
import business.model.student.Student;
import infra.database.MysqlConnect;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAOReader {

    public void load(String email) {
        try {
            MysqlConnect mysql = MysqlConnect.getDbCon();
            ResultSet result = mysql.query("SELECT * FROM `students` WHERE email = " + email + ";");
            while (result.next()) {
                StudentControl.student.setEmail(result.getString("email"));
                StudentControl.student.setPassword(result.getString("password"));
                StudentControl.student.setAdmin(Integer.parseInt(result.getString("page_admin")));
            }

        } catch (SQLException error) {
            System.out.println("Error: " + error);
        }
    }

    public void load() {
        try {
            MysqlConnect mysql = MysqlConnect.getDbCon();
            Student student = new Student();
            ResultSet result = mysql.query("SELECT * FROM `students`;");
            while (result.next()) {
                student.setEmail(result.getString("email"));
                student.setPassword(result.getString("password"));
                student.setAdmin(Integer.parseInt(result.getString("page_admin")));
                
                StudentControl.studentsList.add(student);
            }

        } catch (SQLException error) {
            System.out.println("Error: " + error);
        }
    }
}
