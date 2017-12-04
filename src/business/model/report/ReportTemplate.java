package business.model.report;

import business.model.answers.Answers;
import business.model.questions.Questions;
import java.util.ArrayList;

public abstract class ReportTemplate {

    int total_questions = 0;
    int questions_answered = 0;
    int right_questions = 0;
    int wrong_questions = 0;
    
    ArrayList<Answers> answers = new ArrayList<>();
    ArrayList<Questions> questions = new ArrayList<>();

    public abstract void createReport(String email);
}
