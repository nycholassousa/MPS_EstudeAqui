package business.control.questions.factory;

import business.model.questions.Questions;
import infra.adapter.AdapterImport;
import infra.adapter.CsvImport;
import infra.database.MysqlConnect;
import java.sql.SQLException;

public class QuestionsFromCsv implements QuestionsFactory {

    @Override
    public Questions createQuestion() throws SQLException {
        AdapterImport adapter = new CsvImport();
        Questions question = adapter.parseData("import.csv");
        return question;
    }
}
