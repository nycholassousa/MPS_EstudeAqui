package business.control.commands;

import business.model.memento.Memento;

public class UndoCommand implements Command {

    private Memento memento;

    @Override
    public void execute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
