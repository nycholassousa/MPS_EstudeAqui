package business.control.questions.observer;

import java.util.ArrayList;
import java.util.List;

public class QuestionsSubject {

    protected List<Observer> observers;
    protected InfoQuestions questions;

    public QuestionsSubject() {
        observers = new ArrayList<Observer>();
    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    public void setState(InfoQuestions questions) {
        this.questions = questions;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public InfoQuestions getState() {
        return questions;
    }
}
