package infra.database.reader;

import business.control.QuestionsControl;
import business.model.questions.Questions;
import infra.database.MysqlConnect;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QuestionsDAOReader {

    public static void load() {
        try {
            MysqlConnect mysql = MysqlConnect.getDbCon();
            Questions question = new Questions();
            ResultSet result = mysql.query("SELECT * FROM `questions`;");
            while (result.next()) {
                question.setStatment(result.getString("statment"));

                question.setAlternative1(result.getString("alternative1"));
                question.setAlternative2(result.getString("alternative2"));
                question.setAlternative3(result.getString("alternative3"));
                question.setAlternative4(result.getString("alternative4"));
                question.setAlternative5(result.getString("alternative5"));

                question.setCorrect(result.getString("correct"));

                QuestionsControl.questions.add(question);
            }

        } catch (SQLException error) {
            System.out.println("Error: " + error);
        }
    }
}
