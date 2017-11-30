package business.control.questions.observer;

import business.model.questions.Questions;
import infra.database.reader.QuestionsDAOReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class InfoQuestions {

    boolean notify = false;

    public InfoQuestions() {
        try {
            int questions_sizeDAO;
            int questions_sizeFile;
            
            List<Questions> questionsList = QuestionsDAOReader.loadQuestions();
            questions_sizeDAO = questionsList.size();

            BufferedReader br = new BufferedReader(new FileReader("info.txt"));
            questions_sizeFile = Integer.parseInt(br.readLine());
            br.close();

            if (questions_sizeDAO != questions_sizeFile) {
                this.notify = true;
                FileWriter file;
                file = new FileWriter(new File("info.txt"));
                file.write(questions_sizeDAO);
                file.close();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
