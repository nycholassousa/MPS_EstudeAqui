package business.control.facade;

import business.control.StudentControl;
import business.control.questions.factory.QuestionsFactory;
import business.control.questions.factory.QuestionsFromCsv;
import business.control.questions.factory.QuestionsFromJson;
import business.model.questions.Questions;
import java.sql.SQLException;

public class RegisterFacade {

    private static QuestionsFactory questionsFactory;

    public static Questions createQuestion(int type) throws SQLException {
        switch (type) {
            case 1:
                questionsFactory = new QuestionsFromJson();
                return questionsFactory.createQuestion();
            case 2:
                questionsFactory = new QuestionsFromCsv();
                return questionsFactory.createQuestion();
            default:
                return null;
        }
    }

    public static void registerStudent(String email, String password) {
        StudentControl.addStudent(email, password, 0);
    }

}
