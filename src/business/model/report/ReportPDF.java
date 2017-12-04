package business.model.report;

import business.control.AnswersControl;
import business.control.QuestionsControl;
import com.gnostice.pdfone.PdfDocument;
import com.gnostice.pdfone.PdfException;
import infra.database.reader.AnswersDAOReader;
import java.io.IOException;

public class ReportPDF extends ReportTemplate {

    @Override
    public void createReport(String email) {
        AnswersDAOReader.load(email);
        answers = AnswersControl.answers;
        questions_answered = answers.size();

        questions = QuestionsControl.questions;
        total_questions = questions.size();

        for (int i = 0; i < answers.size(); i++) {
            if (answers.get(i).getAnswers() == Integer.parseInt(questions.get(i).getCorrect())) {
                right_questions++;
            } else {
                wrong_questions++;
            }
            questions_answered++;
        }

        PdfDocument doc = new PdfDocument();
        try {
            doc.writeText("Quantidade de Questoes respondidas: " + questions_answered + "/" + total_questions);
            doc.writeText("Quantidade de Acertos: " + right_questions);
            doc.writeText("Quantidade de Erros: " + wrong_questions);
            doc.save("Relatorio.pdf");
            doc.close();
        } catch (IOException | PdfException e) {
            e.printStackTrace();
        }
    }

}
