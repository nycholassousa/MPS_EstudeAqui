package business.control.questions.factory;

import infra.adapter.AdapterImport;
import infra.adapter.JsonImport;
import infra.database.MysqlConnect;
import business.model.questions.Questions;
import infra.adapter.CsvImport;
import java.sql.SQLException;

public interface QuestionsFactory {

    public Questions createQuestion(String importFile) throws SQLException;

}
