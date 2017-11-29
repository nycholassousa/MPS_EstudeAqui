package infra.database;

import business.model.questions.Questions;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QuestionsDAO {

    public List<Questions> saveQuestionsList() throws Exception {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT statment, alternative1, alternative2, alternative3, alternative4, alternative5, correct");
        sql.append("FROM questions");

        MysqlConnect mysql = MysqlConnect.getDbCon();
        PreparedStatement sqlCommand = mysql.conn.prepareStatement(sql.toString());

        ResultSet result = sqlCommand.executeQuery();

        List<Questions> questionsList = new ArrayList<>();

        while (result.next()) {
            Questions question = new Questions();

            question.setStatment(result.getString("statment"));
            question.setAlternative1(result.getString("alternative1"));
            question.setAlternative2(result.getString("alternative2"));
            question.setAlternative3(result.getString("alternative3"));
            question.setAlternative4(result.getString("alternative4"));
            question.setAlternative5(result.getString("alternative5"));
            question.setCorrect(result.getString("correct"));

            questionsList.add(question);
        }

        for (Questions question : questionsList) {
            System.out.println(question.getInfo());
        }

        result.close();
        sqlCommand.close();

        return questionsList;
    }

    public int questionsSize() throws SQLException {
        int size = 0;
        MysqlConnect mysql = MysqlConnect.getDbCon();
        ResultSet result = mysql.query("SELECT * FROM `questions`;");
        
        if (result.next()){
            size = size++;
        }
        
        return size;
    }
}