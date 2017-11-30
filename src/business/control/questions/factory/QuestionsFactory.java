package business.control.questions.factory;

import business.model.questions.Questions;
import java.sql.SQLException;

public interface QuestionsFactory {

    public Questions createQuestion() throws SQLException;

}
