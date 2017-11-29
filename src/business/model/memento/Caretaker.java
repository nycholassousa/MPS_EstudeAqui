package business.model.memento;

import java.util.LinkedList;

public class Caretaker {

    static private LinkedList<Memento> saved_states = null;
    static private Caretaker caretaker = null;

    private Caretaker() {
        saved_states = new LinkedList<Memento>();
    }

    //Singleton
    public static synchronized Caretaker getInstance() {
        if (caretaker == null) { //Indica que o caretaker não foi inicializado
            caretaker = new Caretaker();
        }
        return caretaker;
    }

    public void addMemento(Memento m) {
        saved_states.add(m);
    }

    public Memento getLastMemento() {
        return saved_states.getLast();
    }
}
