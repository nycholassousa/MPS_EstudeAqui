package view;

import business.control.StudentControl;
import infra.adapter.AdapterImport;
import infra.adapter.JsonImport;
import infra.database.MysqlConnect;
import business.model.exceptions.StudentNotExistException;
import business.model.student.Student;
import com.mysql.jdbc.MySQLConnection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws StudentNotExistException, SQLException {
        MysqlConnect mysql = MysqlConnect.getDbCon();
        //mysql.insert("INSERT INTO `students` (`email`, `password`, `page_admin`) VALUES ('email@email.email', '123', '0')");

        //ResultSet rs = StudentControl.getStudent("email@email.email", "123");
        //while (rs.next()) {
        //    System.out.println(rs.getString("password"));
        //}
        //student.setAccess(0, "email@email.email");
        //System.out.println(student.getStudent("email@email.email").first());
        //mysql.insert("INSERT INTO `students` (`id`, `email`, `password`, `page_admin`) VALUES (1, 'email@email.email', '123456', '0')");
        //AdapterImport adapter = new JsonImport();
        //adapter.parseData("import.json");
    }

}
