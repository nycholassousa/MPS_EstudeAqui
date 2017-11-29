package business.model.report;

import business.control.AnswersControl;
import business.control.QuestionsControl;
import business.control.StudentControl;
import business.model.answers.Answers;
import business.model.questions.Questions;
import business.model.student.Student;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReportAdmin extends ReportTemplate {

    private String studentList;
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
        
        try {
            studentList = StudentControl.listAllStudents();
        } catch (SQLException ex) {
            Logger.getLogger(ReportAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }

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
        System.out.println(studentList);
    }

}
