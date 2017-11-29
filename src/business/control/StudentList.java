package business.control;

import infra.database.MysqlConnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

public class StudentList {

    public static ResultSet listAllStudents() throws SQLException { //Deve-se deixar mais generico
        MysqlConnect mysql = MysqlConnect.getDbCon();
        return mysql.query("SELECT * FROM `students`;");
    }
}
