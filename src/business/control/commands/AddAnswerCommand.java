package business.control.commands;

import business.model.answers.Answers;
import business.model.answers.AnswersComponent;
import business.model.answers.AnswersComposite;
import business.model.exceptions.InvalidTypeException;

public class AddAnswerCommand implements Command {

    private AnswersComponent component;
    private Object object;

    public AddAnswerCommand(AnswersComponent component, Object object) {
        this.component = component;
        this.object = object;
    }

    @Override
    public void execute() {
        if (object instanceof AnswersComponent) {
            AnswersComposite composite = (AnswersComposite) component;
            composite.addComponent((AnswersComponent) object);
        } else if (object instanceof Answers) {
            component.addAnswers((Answers) object);
        } else {
            throw new InvalidTypeException("Error: Invalid Type of Object");
        }
    }

}
