package infra.adapter;

import business.model.questions.Questions;

public interface AdapterImport {

    public Questions parseData(String file);
}
