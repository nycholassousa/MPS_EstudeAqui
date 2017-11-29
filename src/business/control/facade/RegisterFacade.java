package business.control.facade;

import business.control.StudentControl;
import business.control.questions.factory.QuestionsFactory;
import business.control.questions.factory.QuestionsFromCsv;
import business.control.questions.factory.QuestionsFromJson;
import java.sql.SQLException;

public class RegisterFacade {

    private static QuestionsFactory questionsFactory;

    public static void createQuestion(int type, String importFile) throws SQLException {
        switch (type) {
            case 1:
                questionsFactory = new QuestionsFromJson();
                questionsFactory.createQuestion(importFile);
                break;
            case 2:
                questionsFactory = new QuestionsFromCsv();
                questionsFactory.createQuestion(importFile);
                break;
            default:
                break;
        }
    }

    public static void registerStudent(String email, String password) {
        StudentControl.addStudent(email, password, 0);
    }
    
    
}
