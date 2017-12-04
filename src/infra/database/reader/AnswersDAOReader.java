package infra.database.reader;

import business.control.AnswersControl;
import business.control.StudentControl;
import business.model.answers.Answers;
import infra.database.MysqlConnect;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AnswersDAOReader {

    public static void load(String email) {
        try {
            Answers answer = new Answers();
            int id_student = 0;
            MysqlConnect mysql = MysqlConnect.getDbCon();
            ResultSet result = mysql.query("SELECT id FROM `students` WHERE email = " + email + ";");
            while (result.next()) {
                id_student = Integer.parseInt(result.getString("id"));
            }
            StudentControl.studentID = id_student;
            
            result = mysql.query("SELECT `question_id`, `student_answer` FROM `answers_students` WHERE student_id = " + id_student + ";");
            while (result.next()) {
                answer.setIdStudent(id_student);
                answer.setIdQuestion(Integer.parseInt(result.getString("question_id")));
                answer.setAnswers(Integer.parseInt(result.getString("student_answer")));

                AnswersControl.answers.add(answer);
            }
        } catch (SQLException error) {
            System.out.println("Error: " + error);
        }
    }
}
