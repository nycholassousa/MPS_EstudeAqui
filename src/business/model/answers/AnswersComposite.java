package business.model.answers;

import business.model.student.Student;
import java.util.ArrayList;

public class AnswersComposite implements AnswersComponent {

    public Student student;
    private String name;
    private ArrayList<AnswersComponent> component;
    private ArrayList<Answers> questions_answereds;

    public AnswersComposite(Student student, String name) {
        this.student = student;
        this.name = name;
        this.component = new ArrayList<AnswersComponent>();
        this.questions_answereds = new ArrayList<Answers>();
    }

    @Override
    public void addAnswers(Answers answer) {
        this.questions_answereds.add(answer);
    }

    public void addComponent(AnswersComponent component) {
        this.component.add(component);
    }

    @Override
    public void removeAnswer(Answers answer) {
        this.questions_answereds.remove(answer);
    }

    public void deleteComponent(AnswersComponent component) {
        this.component.remove(component);
    }

    @Override
    public void showAnswers() {
        for (Answers answer : questions_answereds) {
            System.out.println("\n" + answer.getInfo());
        }
    }

    @Override
    public Student getStudent() {
        return student;
    }

}
