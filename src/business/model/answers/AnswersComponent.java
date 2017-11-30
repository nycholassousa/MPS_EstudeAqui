package business.model.answers;

import business.model.student.Student;

public interface AnswersComponent {

    public Student getStudent();

    public void addAnswers(Answers answer);

    public void removeAnswer(Answers answer);

    public void showAnswers();
}
