package business.control.questions.observer;

public abstract class Observer {

    protected QuestionsSubject questions;

    public Observer(QuestionsSubject questions) {
        this.questions = questions;
    }

    public abstract void update();
}
