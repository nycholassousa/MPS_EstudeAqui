package business.control.questions.observer;

public class QuestionsObserver extends Observer {

    public QuestionsObserver(QuestionsSubject questions) {
        super(questions);
    }

    @Override
    public void update() {
        System.out.println("Novas Questões Adicionadas! Total de questoes: " + questions.getState());
    }

}
