package business.control.questions.factory;

import business.model.questions.Questions;
import infra.adapter.AdapterImport;
import infra.adapter.CsvImport;

public class QuestionsFromCsv implements QuestionsFactory {

    @Override
    public Questions createQuestion() {
        AdapterImport adapter = new CsvImport();
        Questions question = adapter.parseData("import.csv");
        return question;
    }
}
