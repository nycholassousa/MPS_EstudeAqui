package business.control.commands;

import business.model.answers.AnswersComponent;
import business.model.answers.AnswersComposite;
import business.model.memento.Caretaker;
import business.model.memento.Memento;
import business.model.student.Student;

public class UndoCommand implements Command {

    private Memento memento;
    private AnswersComponent component;

    @Override
    public void execute() {
        Caretaker caretaker = Caretaker.getInstance();
        memento = caretaker.getLastMemento();
        component = memento.get_saved_wishlist();
        Student student = component.getStudent();
        student.setComposite((AnswersComposite) component);
    }
}
