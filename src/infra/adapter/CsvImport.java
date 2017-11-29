package infra.adapter;

import business.model.questions.Questions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvImport implements AdapterImport {

    @Override
    public Questions parseData(String file) {
        Questions question = new Questions();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = "";

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] aux = line.split(",");

                question.setStatment(aux[0]);
                question.setAlternative1(aux[1]);
                question.setAlternative2(aux[2]);
                question.setAlternative3(aux[3]);
                question.setAlternative4(aux[4]);
                question.setAlternative5(aux[5]);
                question.setCorrect(aux[6]);

                return question;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
