package infra.database.writer;

import business.model.student.Student;
import infra.database.MysqlConnect;
import java.sql.SQLException;

public class StudentDAOWriter {
    public void save(Student student) throws SQLException{
        MysqlConnect mysql = MysqlConnect.getDbCon();
        mysql.insert("INSERT INTO `students` (`email`, `password`, `page_admin`) VALUES ('" + student.getEmail() + "', '" + student.getPassword() + "', '" + student.getAdmin() + "');");
    }
}
