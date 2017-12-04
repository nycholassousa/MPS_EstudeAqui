package business.model.report;

import business.control.AnswersControl;
import business.control.QuestionsControl;
import business.control.StudentControl;
import infra.database.reader.AnswersDAOReader;

public class ReportAdmin extends ReportTemplate {

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

        System.out.println("Quantidade de Questoes respondidas: " + questions_answered + "/" + total_questions);
        System.out.println("Quantidade de Erros: " + wrong_questions);
        System.out.println("Quantidade de Erros: " + wrong_questions);
        System.out.println("Lista de Estudantes: \n");
        System.out.println(StudentControl.studentsList);
    }

}
