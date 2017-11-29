package business.control;

import business.model.answers.Answers;
import infra.database.MysqlConnect;
import java.sql.ResultSet;
import java.util.ArrayList;

public class AnswersControl {

    private static ArrayList<Answers> answers = new ArrayList<Answers>();

    public static void getAnswersFromStudent(String email) {
        try {
            Answers answer = new Answers();
            int id_student = 0;
            MysqlConnect mysql = MysqlConnect.getDbCon();
            ResultSet result = mysql.query("SELECT id FROM `students` WHERE email = " + email + ";");
            while (result.next()) {
                id_student = Integer.parseInt(result.getString("id"));
            }
            result = mysql.query("SELECT `question_id`, `student_answer` FROM `answers_students` WHERE student_id = " + id_student + ";");
            while (result.next()) {
                answer.setIdStudent(id_student);
                answer.setIdQuestion(Integer.parseInt(result.getString("question_id")));
                answer.setAnswers(Integer.parseInt(result.getString("student_answer")));

                getAnswers().add(answer);
            }
        } catch (Exception e) {
        }
    }

    public static ArrayList<Answers> getAnswers() {
        return answers;
    }

}
