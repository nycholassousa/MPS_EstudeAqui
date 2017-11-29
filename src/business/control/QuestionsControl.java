package business.control;

import infra.database.MysqlConnect;
import business.model.exceptions.QuestionNotExistException;
import business.model.questions.Questions;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class QuestionsControl {

    private static Questions question;
    private static ArrayList<Questions> questions;

    public static Questions getQuestion(int id) throws QuestionNotExistException {
        try {
            MysqlConnect mysql = MysqlConnect.getDbCon();
            ResultSet result = mysql.query("SELECT * FROM `questions` WHERE id = " + id + ";");
            while (result.next()) {
                question = new Questions(result.getString("statment"), result.getString("alternative1"), result.getString("alternative2"), result.getString("alternative3"),
                        result.getString("alternative4"), result.getString("alternative5"), result.getString("correct"));
            }
            return question;
        } catch (SQLException error) {
            System.out.println("Error: " + error);
        }
        return null;
    }

    public static void getAllQuestions() {
        try {
            Questions questionAux;
            MysqlConnect mysql = MysqlConnect.getDbCon();
            ResultSet result = mysql.query("SELECT * FROM `questions`;");
            while (result.next()) {
                questionAux = new Questions(result.getString("statment"), result.getString("alternative1"), result.getString("alternative2"), result.getString("alternative3"),
                        result.getString("alternative4"), result.getString("alternative5"), result.getString("correct"));
                getQuestions().add(questionAux);
            }
        } catch (SQLException error) {
            System.out.println("Error: " + error);
        }

    }

    public static ArrayList<Questions> getQuestions() {
        return questions;
    }
}
