package infra.database.reader;

import business.model.answers.Answers;
import infra.database.MysqlConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AnswersDAOReader {

    public static List<Answers> loadAnswers() throws Exception {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT question_id, student_id, student_answer");
        sql.append("FROM answers_students");

        MysqlConnect mysql = MysqlConnect.getDbCon();
        PreparedStatement sqlCommand = mysql.conn.prepareStatement(sql.toString());

        ResultSet result = sqlCommand.executeQuery();

        List<Answers> answersList = new ArrayList<>();

        while (result.next()) {
            Answers answers = new Answers();

            answers.setIdQuestion(Integer.parseInt(result.getString("question_id")));
            answers.setIdStudent(Integer.parseInt(result.getString("student_id")));
            answers.setAnswers(Integer.parseInt(result.getString("student_answer")));

            answersList.add(answers);
        }

        for (Answers answer : answersList) {
            System.out.println(answer.getInfo());
        }

        result.close();
        sqlCommand.close();

        return answersList;
    }
}
