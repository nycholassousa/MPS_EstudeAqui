package infra.database;

import business.model.student.Student;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    public List<Student> saveStudentsList() throws Exception {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT email, password");
        sql.append("FROM students");

        MysqlConnect mysql = MysqlConnect.getDbCon();
        PreparedStatement sqlCommand = mysql.conn.prepareStatement(sql.toString());

        ResultSet result = sqlCommand.executeQuery();

        List<Student> studentList = new ArrayList<>();

        while (result.next()) {
            Student student = new Student();
            student.setEmail(result.getString("email"));
            student.setPassword(result.getString("password"));

            studentList.add(student);
        }

        for (Student student : studentList) {
            System.out.println(student.getInfo());
        }

        result.close();
        sqlCommand.close();

        return studentList;
    }
}
