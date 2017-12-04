package business.control.questions.factory;

import business.model.questions.Questions;
import infra.adapter.AdapterImport;
import infra.adapter.JsonImport;

public class QuestionsFromJson implements QuestionsFactory {

    @Override
    public Questions createQuestion() {
        AdapterImport adapter = new JsonImport();
        Questions question = adapter.parseData("import.json");
        return question;

    }
}
