package business.control.commands;

import business.model.answers.AnswersComponent;

public class ShowAnswersCommand implements Command {

    private AnswersComponent component;

    public ShowAnswersCommand(AnswersComponent component) {
        this.component = component;
    }

    @Override
    public void execute() {
        component.showAnswers();
    }

}
