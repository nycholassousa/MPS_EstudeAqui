package infra.database.writer;

import business.control.facade.RegisterFacade;
import business.model.questions.Questions;
import infra.database.MysqlConnect;
import java.sql.SQLException;

public class QuestionsDAOWriter {

    public void save(int type) {
        try {
            MysqlConnect mysql = MysqlConnect.getDbCon();
            Questions question = RegisterFacade.createQuestion(type);

            mysql.insert("INSERT INTO `questions` (`statment`, `alternative1`, `alternative2`, `alternative3`, `alternative4`, `alternative5`, `correct`) VALUES "
                    + "('" + question.getStatment() + "', '" + question.getAlternative1() + "', '" + question.getAlternative2() + "', '" + question.getAlternative3() + "', '"
                    + question.getAlternative4() + "', '" + question.getAlternative5() + "', '" + question.getCorrect() + "')");

        } catch (SQLException error) {
            System.out.println("Error: " + error);
        }
    }
}
