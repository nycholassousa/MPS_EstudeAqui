package business.model.report;

public abstract class ReportTemplate {

    int total_questions = 0;
    int questions_answered = 0;
    int right_questions = 0;
    int wrong_questions = 0;

    public abstract void createReport(String email);
}
