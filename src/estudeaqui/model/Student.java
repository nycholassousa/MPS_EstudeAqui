package estudeaqui.model;

import estudeaqui.util.MysqlConnect;
import java.sql.SQLException;

public class Student {

    

    private String email;
    private String password;
    private int admin;
    private MysqlConnect mysql;

    private Student(String email, String password, int admin) {
        this.email = email;
        this.password = password;
        this.admin = admin; //Caso seja administrador, o usuário ficará com admin = 1 -> Essa alteração está disponivel apenas via MySQL
    }
    
    private static Student createStudent(String email, String password, int admin) {
        return new Student(email, password, admin);
    }

    public String getEmail() throws SQLException {
        return mysql.query("SELECT email FROM users").getString(1);
    }

    public String getPassword() throws SQLException {
        return mysql.query("SELECT password FROM users").getString(1);
    }

    public int getAdmin() throws SQLException {
        return mysql.query("SELECT admin FROM users").getInt(1);
    }

}
