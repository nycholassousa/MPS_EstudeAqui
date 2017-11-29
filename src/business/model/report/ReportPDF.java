package business.model.report;

import business.control.AnswersControl;
import business.control.QuestionsControl;
import business.model.answers.Answers;
import business.model.questions.Questions;
import java.util.ArrayList;
import com.gnostice.pdfone.PdfDocument;
import com.gnostice.pdfone.PdfException;
import java.io.IOException;

public class ReportPDF extends ReportTemplate {

    private ArrayList<Answers> answers = new ArrayList<Answers>();
    private ArrayList<Questions> questions = new ArrayList<Questions>();

    @Override
    public void createReport(String email) {
        AnswersControl.getAnswersFromStudent(email);
        answers = AnswersControl.getAnswers();
        questions_answered = answers.size();

        QuestionsControl.getAllQuestions();
        questions = QuestionsControl.getQuestions();
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