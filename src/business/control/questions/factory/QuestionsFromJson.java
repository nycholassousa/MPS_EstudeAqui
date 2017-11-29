/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control.questions.factory;

import business.model.questions.Questions;
import infra.adapter.AdapterImport;
import infra.adapter.JsonImport;
import infra.database.MysqlConnect;
import java.sql.SQLException;

/**
 *
 * @author nycho
 */
public class QuestionsFromJson implements QuestionsFactory {

    @Override
    public Questions createQuestion(String importFile) throws SQLException {
        try {
            MysqlConnect mysql = MysqlConnect.getDbCon();
            AdapterImport adapter = new JsonImport();
            Questions question = adapter.parseData(importFile);

            mysql.insert("INSERT INTO `questions` (`statment`, `alternative1`, `alternative2`, `alternative3`, `alternative4`, `alternative5`, `correct`) VALUES "
                    + "('" + question.getStatment() + "', '" + question.getAlternative1() + "', '" + question.getAlternative2() + "', '" + question.getAlternative3() + "', '"
                    + question.getAlternative4() + "', '" + question.getAlternative5() + "', '" + question.getCorrect() + "')");

            return question;
        } catch (SQLException error) {
            System.out.println("Error: " + error);
        }
        return null;
    }
}
