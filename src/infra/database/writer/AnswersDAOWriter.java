package infra.database.writer;

import business.control.StudentControl;
import infra.database.MysqlConnect;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AnswersDAOWriter {

    public static void save() {
        try {
            String email = StudentControl.student.getEmail();
            int id_student = 0;
            
            MysqlConnect mysql = MysqlConnect.getDbCon();
            ResultSet result = mysql.query("SELECT id FROM `students` WHERE email = " + email + ";");
            while (result.next()) {
                id_student = Integer.parseInt(result.getString("id"));
            }
            
            mysql.insert("INSERT INTO `answers_students` (`question_id`, `student_id, `student_answer`) VALUES () WHERE `id` = " + id_student + "");

        } catch (SQLException error) {
            System.out.println("Error: " + error);
        }
    }
}
