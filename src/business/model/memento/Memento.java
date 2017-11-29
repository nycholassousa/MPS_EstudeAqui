package business.model.memento;

import business.model.answers.AnswersComponent;

public class Memento {

    private AnswersComponent component;

    public Memento(AnswersComponent component) {
        this.component = component;
    }

    public AnswersComponent get_saved_wishlist() {
        return this.component;
    }
}
