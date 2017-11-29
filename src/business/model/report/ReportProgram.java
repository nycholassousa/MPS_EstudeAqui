package business.model.report;

import business.control.AnswersControl;
import business.control.QuestionsControl;
import business.model.answers.Answers;
import business.model.questions.Questions;
import java.util.ArrayList;

public class ReportProgram extends ReportTemplate {

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

        System.out.println("Quantidade de Questoes respondidas: " + questions_answered + "/" + total_questions);
        System.out.println("Quantidade de Erros: " + wrong_questions);
        System.out.println("Quantidade de Erros: " + wrong_questions);
    }

}