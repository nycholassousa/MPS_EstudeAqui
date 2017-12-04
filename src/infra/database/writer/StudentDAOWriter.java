package infra.database.writer;

import business.control.facade.RegisterFacade;
import business.model.exceptions.StudentNotExistException;
import business.model.student.Student;
import infra.database.MysqlConnect;
import java.sql.SQLException;

public class StudentDAOWriter {

    public void save(String email, String password) {
        try {
            MysqlConnect mysql = MysqlConnect.getDbCon();
            Student student = RegisterFacade.createStudent(email, password);
            
            mysql.insert("INSERT INTO `students` (`email`, `password`, `page_admin`) VALUES ('" + student.getEmail() + "', '"
                    + student.getPassword() + "', '" + student.getAdmin() + "');");

        } catch (SQLException | StudentNotExistException error) {
            System.out.println("Error: " + error);
        }
    }
}
